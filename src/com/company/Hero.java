package com.company;

public class Hero {
    private int heroHealth;
    private int heroDamage;
    public String heroesAttackType;

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }


    public Hero(int heroHealth, int heroDamage, String heroesAttackType) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroesAttackType = heroesAttackType;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public String getHeroesAttackType() {
        return heroesAttackType;
    }

    public void setHeroesAttackType(String heroesAttackType) {
        this.heroesAttackType = heroesAttackType;

    }
    }
