package ru.mirea.newpr.pr6_done.part10;

import java.util.Objects;
import java.util.Scanner;

public class Processor {
    private String name;
    private int countCores;
    Processor(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название процессора: ");
        name = scanner.next();
        System.out.print("Введите количество ядер процессора: ");
        countCores = scanner.nextInt();
    }

    public String getName() {
        return name;
    }
    public int getCountCores() {
        return countCores;
    }


    public boolean equals(Processor obj) {
        return Objects.equals(name, obj.getName()) && countCores == obj.getCountCores();
    }

    @Override
    public String toString() {
        return "    Процессор: " + name + "\n" + "   Количество ядер: " + countCores + "\n";
    }
}
