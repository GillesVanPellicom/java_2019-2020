package com.powkiemawn;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    //Variables which make up a trainer
    private String name = "Not defined";
    private int gender = 1;
    private int badgeCount = 0;
    private double money = 0;
    private List<Pokemon> catchedPokemon = new ArrayList<Pokemon>();
    private List<Pokemon> currentPokemon = new ArrayList<Pokemon>();

    public Trainer(String name, int gender, int badgeCount, double money, List<Pokemon> catchedPokemon, List<Pokemon> currentPokemon) {
        this.setName(name);
        this.setGender(gender);
        this.setBadgeCount(badgeCount);
        this.setMoney(money);
        this.setCatchedPokemon(catchedPokemon);
        this.setCurrentPokemon(currentPokemon);
    }

    public static void main(String[] args) {

    }

    private void rawPrintTrainer() {
        System.out.println("Name: " + this.getName());
        System.out.println("Gender: " + this.getGender());
        System.out.println("BadgeCount: " + this.getBadgeCount());
        System.out.println("Money: " + this.getMoney());
        System.out.println("Total Catched Pokemon: " + this.getCatchedPokemon().size());
        System.out.println("Total Current Pokemon: " + this.getCurrentPokemon().size());
    }

    //Getters and setters for above variables + range enforcement.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getBadgeCount() {
        return badgeCount;
    }

    public void setBadgeCount(int badgeCount) {
        if (badgeCount < 0 || gender > 8) {
            throw new IllegalArgumentException("The badgeCount range is [0;8]");
        } else {
            this.badgeCount = badgeCount;
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public List<Pokemon> getCatchedPokemon() {
        return catchedPokemon;
    }

    public void setCatchedPokemon(List<Pokemon> catchedPokemon) {
        this.catchedPokemon = catchedPokemon;
    }

    public List<Pokemon> getCurrentPokemon() {
        return currentPokemon;
    }

    public void setCurrentPokemon(List<Pokemon> currentPokemon) {
        if (currentPokemon.size() < 1 || currentPokemon.size() > 6) {
            throw new IllegalArgumentException(currentPokemon.size() + " is not valid. Expected [1;8]");
        } else {
            this.currentPokemon = currentPokemon;
        }
    }

}
