package com.powkiemawn;

import java.util.ArrayList;
import java.util.List;

public class Aanvallen {

    //All attacks
    private Aanval splash = new Aanval("Splash", 5, 50, "It wasn't very effective...");
    private Aanval opera = new Aanval("Opera", 75, 50, "All eardrums in earshot violently explode.");
    private Aanval baka = new Aanval("Baka", 3, 100, "He  said the other pokemon is stupid. The physical damage is minimal but the psychological damage is unthinkable");
    private Aanval wasteChips = new Aanval("Waste Chips", 0, 100, "He threw perfectly good chips on the floor. Monster!");
    private Aanval pylons = new Aanval("Construct Additional Pylons", 0, 100, "Since he does not have any gateways he could not spawn zealots.");
    private Aanval charge = new Aanval("Charge", 100, 30, "'All right let's do this. LEEEROOOOY NJEEEENKIIIINS!");
    private final List<Aanval> ReferenceAttacks = new ArrayList<Aanval>() {{
        add(baka);
        add(pylons);
        add(charge);
    }};
    //Attack list for pokemon "Lander"
    private List<Aanval> LanderAttacks = new ArrayList<Aanval>() {{
        add(splash);
        add(opera);
        add(wasteChips);
    }};

    public static void main(String[] args) {

    }

    public List<Aanval> getReferenceAttacks() {
        return ReferenceAttacks;
    }

    //Method to attack another pokemon
    public Pokemon attackPokemon(Aanval attackUsed, Pokemon attackingPokemon, Pokemon afflictedPokemon) throws InterruptedException {
        int precision = attackUsed.getPrecision();
        int precisionRandomizer = (int) (Math.random() * (100 + 1));
        System.out.println(attackingPokemon.getName() + " used " + attackUsed.getNaam());
        Thread.sleep(1000);
        if (precisionRandomizer <= precision) {
            System.out.println(attackUsed.getDescription());
            afflictedPokemon.setHp(afflictedPokemon.getHp() - attackUsed.getPower());
            System.out.println("-" + attackUsed.getPower() + " hp");
            System.out.println(afflictedPokemon.getName() + "'s current hp: " + afflictedPokemon.getHp());
            Thread.sleep(1500);
        } else {
            System.out.println(attackingPokemon.getName() + "'s attack missed!");
            Thread.sleep(1500);
        }
        return afflictedPokemon;
    }

    public Aanval getSplash() {
        return splash;
    }

    public void setSplash(Aanval splash) {
        this.splash = splash;
    }

    public Aanval getOpera() {
        return opera;
    }

    public void setOpera(Aanval opera) {
        this.opera = opera;
    }

    public Aanval getBaka() {
        return baka;
    }

    public void setBaka(Aanval baka) {
        this.baka = baka;
    }

    public Aanval getWasteChips() {
        return wasteChips;
    }

    public void setWasteChips(Aanval wasteChips) {
        this.wasteChips = wasteChips;
    }

    public Aanval getPylons() {
        return pylons;
    }

    public void setPylons(Aanval pylons) {
        this.pylons = pylons;
    }

    public Aanval getCharge() {
        return charge;
    }

    public void setCharge(Aanval charge) {
        this.charge = charge;
    }

    public List<Aanval> getLanderAttacks() {
        return LanderAttacks;
    }

    public void setLanderAttacks(List<Aanval> landerAttacks) {
        LanderAttacks = landerAttacks;
    }
}
