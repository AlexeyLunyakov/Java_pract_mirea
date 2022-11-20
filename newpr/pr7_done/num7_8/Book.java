package ru.mirea.newpr.pr7_done.num7_8;

public class Book implements Printable{
    private String name, author;
    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public static void printBooks(Printable[] printable){
        System.out.print("Книги: ");
        for (Printable el: printable){
            if (el instanceof Book)
                System.out.print(((Book) el).getName() + " ");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Параметры книги:\n    Название: " + name + "\n    Автор: " + author);
    }
}
