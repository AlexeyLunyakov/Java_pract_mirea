package ru.mirea.newpr.pr6_done.part10;

import java.util.Objects;
import java.util.Scanner;

public class Memory {
    private String name;
    private int count;

    Memory(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название памяти: ");
        name = scanner.next();
        System.out.print("Введите количество памяти: ");
        count = scanner.nextInt();
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public boolean equals(Memory obj) {
        return Objects.equals(name, obj.getName()) && count == obj.getCount();
    }

    @Override
    public String toString() {
        return "    Память: " + name + "\n    Количество: " + count + "\n";
    }
}
