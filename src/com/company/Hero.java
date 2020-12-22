package com.company;

public abstract class Hero {
    private int damage;
    private int health;

    public Hero ( int damage,int health){
        this.damage= damage;
        this.health= health;
    }

    public Hero(String info) {
    }

    public int getDamage(){
        return damage;
    }

    public int getHealth() {
        return health;
    }
    public String getInfo(){
        return "Damage "+ getDamage()+" Health "+getHealth();
    }


}
