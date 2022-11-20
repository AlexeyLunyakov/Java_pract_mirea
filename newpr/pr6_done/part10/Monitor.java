package ru.mirea.newpr.pr6_done.part10;

import java.util.Objects;
import java.util.Scanner;

public class Monitor {
    private String name, resolution;
    private double diagonal;
    Monitor(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название монитора: ");
        name = scanner.next();
        System.out.print("Введите разрешение монитора: ");
        resolution = scanner.next();
        System.out.print("Введите диагональ монитора: ");
        diagonal = scanner.nextDouble();

    }

    public String getName() {
        return name;
    }
    public String getResolution() {
        return resolution;
    }
    public double getDiagonal() {
        return diagonal;
    }

    public boolean equals(Monitor obj) {
        return Objects.equals(name, obj.getName()) && resolution == obj.getResolution() && diagonal == obj.getDiagonal() ;
    }

    @Override
    public String toString() {
        return "    Монитор: " + name + "\n    Разрешение: " + resolution + "\n    Диагональ: " + diagonal + "\n" ;
    }
}
