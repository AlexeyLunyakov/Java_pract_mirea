package ru.mirea.newpr.pr20_done.num1_2_3;

import java.io.Serializable;

public class AllClass<T extends Comparable, V extends Ident, K extends Serializable> {
    private final T first;
    private final V second;
    private final K third;

    AllClass(T first, V second, K third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void printTypes(){
        System.out.println("\nТипы данных:\n\tПервый тип: " + first.getClass().getName() + ": " + first + "\n" +
                "\tВторой тип: " + second.getClass().getName() + ": " + second + "\n" +
                "\tТретий тип: " + third.getClass().getName() + ": " + third + "\n");
    }
    public static void main(String [] args) {
        AllClass<String, Ident, Integer> ans = new AllClass<String, Ident, Integer>("Info example..",  new Ident(), 19);
        ans.printTypes();
    }
}
