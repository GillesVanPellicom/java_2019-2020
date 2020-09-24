package com.powkiemawn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pokemon {
    //Variables which make up a pokemon
    private String name = "Not Defined";
    private int number = -1;
    private int type = 1;
    private int gender = 1;
    private int hp = 0;
    private int attack = 0;
    private int defense = 0;
    private int speed = 0;
    private List<Aanval> a = new ArrayList<>();

    //Constructor
    public Pokemon(String name, int number, int type, int gender, int hp, int attack, int defense, int speed, List<Aanval> attackList) {
        this.setName(name);
        this.setNumber(number);
        this.setType(type);
        this.setGender(gender);
        this.setHp(hp);
        this.setAttack(attack);
        this.setDefense(defense);
        this.setSpeed(speed);
        this.setA(attackList);
    }

    public Pokemon(String pokefile) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(pokefile));
        this.setName(scan.next());
        this.setNumber(scan.nextInt());
        this.setType(scan.nextInt());
        this.setGender(scan.nextInt());
        this.setHp(scan.nextInt());
        this.setAttack(scan.nextInt());
        this.setDefense(scan.nextInt());
        this.setSpeed(scan.nextInt());
    }

    public static void main(String[] args) throws FileNotFoundException {

    }

    //Method to print pokemon stats in unaltered state
    private void rawPrintPokemon() {
        System.out.println("Name: " + this.getName());
        System.out.println("Number: " + this.getNumber());
        System.out.println("Type: " + this.getType());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Hp: " + this.getHp());
        System.out.println("Attack: " + this.getAttack());
        System.out.println("Defense: " + this.getDefense());
        System.out.println("Speed: " + this.getSpeed());
    }

    //Getters and setters for above variables + range enforcement.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        if (type < 1 || type > 18) {
            throw new IllegalArgumentException("The type range is [1;18]");
        } else {
            this.type = type;
        }

    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        if (gender < 1 || gender > 2) {
            throw new IllegalArgumentException("The gender range is [1;2]");
        } else {
            this.gender = gender;
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack > 0) {
            this.attack = attack;
        } else {
            throw new IllegalArgumentException("Attack is not allowed to go under 0");
        }
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        if (defense > 0) {
            this.defense = defense;
        } else {
            throw new IllegalArgumentException("Defense is not allowed to go under 0");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public List<Aanval> getA() {
        return a;
    }

    public void setA(List<Aanval> a) {
        if (a.size() < 1) {
            throw new IllegalArgumentException("Amount of attack(s): " + a.size() + " Expected [1;4]");
        } else if (a.size() > 4) {
            throw new IllegalArgumentException("Amount of attack(s): " + a.size() + " Expected [1;4]");
        }
        this.a = a;
    }

}
