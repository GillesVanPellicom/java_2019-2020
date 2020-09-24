package com.powkiemawn;

import javax.sound.sampled.LineUnavailableException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    SoundEngine soundEngine = new SoundEngine();

    public Game() throws LineUnavailableException {
    }

    public static void main(String[] args) throws IOException, InterruptedException, LineUnavailableException {
        Game game = new Game();
        Pokemons pokemons = new Pokemons();

        List<Pokemon> t1Pokemons = new ArrayList<Pokemon>();
        t1Pokemons.add(pokemons.getLander());

        Trainer t1 = new Trainer("Van Leemhuyzen", 1, 3, 546, t1Pokemons, t1Pokemons);

        List<Pokemon> t2Pokemons = new ArrayList<Pokemon>();
        t2Pokemons.add(pokemons.getReference());
        Trainer t2 = new Trainer("Bilbo Baggins", 1, 8, 7815, t2Pokemons, t2Pokemons);

        game.challange(t1, t2);

    }

    public void challange(Trainer ai, Trainer player) throws InterruptedException {

        System.out.println(ai.getName() + " Wants to battle you. Do you accept?");
        System.out.println("Y = Yes, N = Yes, * = yes");
        Scanner scan = new Scanner(System.in);
        int pokemonT1Number = (int) (Math.random() * (ai.getCurrentPokemon().size()));
        int pokemonT2Number = (int) (Math.random() * (player.getCurrentPokemon().size()));
        String yes = scan.next();
        soundEngine.play("src/com/powkiemawn/BattleOST.wav");
        Pokemon aiPokemon = ai.getCurrentPokemon().get(pokemonT1Number);
        Pokemon playerPokemon = player.getCurrentPokemon().get(pokemonT2Number);
        Thread.sleep(3950);
        System.out.println("Your pokemon:");
        System.out.println("\t" + playerPokemon.getName());
        System.out.println("\t" + playerPokemon.getHp() + " hp");
        System.out.println("\t" + playerPokemon.getSpeed() + " speed");
        System.out.println("\t" + playerPokemon.getAttack() + " attack");
        System.out.println("\t" + playerPokemon.getDefense() + " defense");
        Thread.sleep(2920);
        System.out.println("Your opponent's pokemon:");
        System.out.println("\t" + aiPokemon.getName());
        System.out.println("\t" + aiPokemon.getHp() + " hp");
        System.out.println("\t" + aiPokemon.getSpeed() + " speed");
        System.out.println("\t" + aiPokemon.getAttack() + " attack");
        System.out.println("\t" + aiPokemon.getDefense() + " defense");
        boolean userTurn = true;
        if (playerPokemon.getSpeed() < aiPokemon.getSpeed()) {
            userTurn = false;
        } else if (playerPokemon.getSpeed() == aiPokemon.getSpeed()) {
            int coinFlip = (int) (Math.random() * (1 + 1));
            if (coinFlip == 1) {
                userTurn = false;
            }
        }
        Thread.sleep(2920);

        Aanvallen aanvallen = new Aanvallen();
        while (playerPokemon.getHp() > 0 && aiPokemon.getHp() > 0) {
            if (userTurn) {
                System.out.println("It's your turn!");
                Thread.sleep(1000);
                System.out.println("Attacks:");
                for (int i = 0; i < playerPokemon.getA().size(); i++) {
                    System.out.println("\t" + playerPokemon.getA().get(i).getNaam() + " (" + (i + 1) + ")");
                }
                int choice = scan.nextInt() - 1;
                aiPokemon = aanvallen.attackPokemon(playerPokemon.getA().get(choice), playerPokemon, aiPokemon);
                Thread.sleep(1000);
                userTurn = false;
            } else {
                System.out.println("It's your opponent's turn.");
                Thread.sleep(1000);
                int attackNumber = (int) (Math.random() * (aiPokemon.getA().size()));
                playerPokemon = aanvallen.attackPokemon(aiPokemon.getA().get(attackNumber), aiPokemon, playerPokemon);
                userTurn = true;
            }
        }
        if (playerPokemon.getHp() < 0) {
            System.out.println("You lost!");
            soundEngine.stop();
        } else {
            System.out.println(ai.getName() + " lost!");
            soundEngine.stop();
        }
    }

}
