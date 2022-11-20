package ru.mirea.newpr.pr6_done.part6789;

public class Book implements Printable{
    private String name, author;
    Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.println(" Книга: " + name + "\n Автор: " + author + "\n");
    }
}
