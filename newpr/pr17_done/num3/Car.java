package ru.mirea.newpr.pr17_done.num3;

public class Car {
    private int speed, spaceDisplacement;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpaceDisplacement() {
        return spaceDisplacement;
    }

    public void CarDamage(int spaceDisplacement) {
        this.spaceDisplacement = spaceDisplacement;
    }
}
