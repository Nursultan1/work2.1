package com.company;

public class Main {

    public static void main(String[] args) {
     Warrior warrior =new Warrior(50,250,"Gaz", SuperAbility.BERSERK);
        System.out.println(warrior.getInfo());
        Called called=new Called(80,500,"Sato",SuperAbility.SUPER_HIT);
        System.out.println(called.getInfo());


        }
}
