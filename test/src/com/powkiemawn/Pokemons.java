package com.powkiemawn;

public class Pokemons {
    Aanvallen aanvallen = new Aanvallen();
    private final Pokemon Reference = new Pokemon("Reference", 1, 15, 1, 90, 15, 45, 70, aanvallen.getReferenceAttacks());
    private Pokemon Lander = new Pokemon("Lander", 1, 1, 1, 60, 10, 50, 70, aanvallen.getLanderAttacks());

    public static void main(String[] args) {
        Pokemons pokemons = new Pokemons();
        System.out.println(pokemons.Lander.getName());
    }

    public Pokemon getLander() {
        return Lander;
    }

    public void setLander(Pokemon lander) {
        Lander = lander;
    }

    public Pokemon getReference() {
        return Reference;
    }
}
