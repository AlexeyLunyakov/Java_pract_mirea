package ru.mirea.old_pr.pr1_done;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println("Книга, созданная конструктором по умолчанию:");
        System.out.println(b1);
        Book b2 = new Book("Война и мир", "Лев Николаевич Толстой", "Издательство", 1, 1900);
        System.out.println("Книга, созданная конструктором с частичной инициализацией:");
        System.out.println(b2);
    }
}


