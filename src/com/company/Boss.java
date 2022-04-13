package com.company;

public class Boss {
    private int BossHealth = 200;
    private int BossDamage = 20;
    private String BossDefenseType ;

    public Boss(int bossHealth, int bossDamage, String bossDefenseType) {
        BossHealth = bossHealth;
        BossDamage = bossDamage;
        BossDefenseType = bossDefenseType;
    }

    public int getBossHealth() {
        return BossHealth;
    }

    public void setBossHealth(int bossHealth) {
        BossHealth = bossHealth;
    }

    public int getBossDamage() {
        return BossDamage;
    }

    public void setBossDamage(int bossDamage) {
        BossDamage = bossDamage;
    }

    public String getBossDefenseType() {
        return BossDefenseType;
    }

    public void setBossDefenseType(String bossDefenseType) {
        BossDefenseType = bossDefenseType;
    }


}

