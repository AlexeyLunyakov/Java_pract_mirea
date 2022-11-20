package ru.mirea.newpr.pr6_done.part6789;

public class Shop implements Printable{
    private String name, date;
    private int price;
    Shop(String name, int price, String date){
        this.name = name;
        this.price = price;
        this.date = date;
    }

    @Override
    public void print() {
        System.out.println(" Журнал: " + name + "\n Выпуск: " + price + "\n Дата издания: " + date + "\n");
    }
}
