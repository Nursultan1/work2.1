package com.company;

public class Warrior extends Hero{
    private String name;
    private SuperAbility superAbility;

    public Warrior(int damage, int health,String name) {
        super(damage, health);
        this.name=name;
    }  public Warrior(int damage, int health,String name,SuperAbility superAbility) {
        super(damage, health);
        this.name=name;
        this.superAbility=superAbility;
    }
    public String getInfo(){
        return super.getInfo() +" "+superAbility + " "+ name;
    }




}
