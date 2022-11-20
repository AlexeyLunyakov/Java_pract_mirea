package ru.mirea.newpr.pr6_done.part11;

import java.util.Scanner;

public class Zd11_tester {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int choice;
        double count;

        System.out.println("Изначальная температура: \n1 - Фаренгейт, 2 - Цельсия, 3 - Кельвин\n");
        choice = scan.nextInt();

        System.out.print("Введите температуру: ");
        count = scan.nextDouble();
        Temperature t = new Temperature(count, choice);
        t.convert();
    }
}
