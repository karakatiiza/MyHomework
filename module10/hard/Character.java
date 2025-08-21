package com.varaxina.module10.hard;

public class Character implements Hero {
    private String name;
    private int health;
    public Weapon weapon;

    public Character(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getHealth(){
        return health;
    }

    @Override
    public boolean isAlive(){
        return health > 0;
    }

    @Override
    public void getDamage(int damage){
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public void attack(Hero opponent){
        int hit = (int) (Math.random() * 2);
        if (hit == 1){
            System.out.println(name + " атакует оппонента " + opponent.getName() + "!");
            opponent.getDamage(weapon.getDamage());
        } else {
            System.out.println(name + " промахнулся!");
        }
    }
}
