package ru.mirea.newpr.pr17_done.num3;

public class MVCPatternDemo {
    public static void main(String [] args){
        Car m = new Car();
        CarView v = new CarView();
        CarController c = new CarController(m, v);
        c.initController();
    }
}
