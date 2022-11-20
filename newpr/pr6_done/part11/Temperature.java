package ru.mirea.newpr.pr6_done.part11;

import java.util.Scanner;

public class Temperature implements Convertible {
    private double temperature;
    private int choice;

    Temperature(double temper, int chc){
        temperature = temper;
        choice = chc;
    }

    @Override
    public void convert() {
        Scanner sc = new Scanner(System.in);
        int select;
        System.out.println("Перевод температуры в: \n1 - Фаренгейт, 2 - Цельсия, 3 - Кельвин\n");
        select = sc.nextInt();
        if ((select == 1 && choice == 1) || (select == 2 && choice == 2) || (select == 3 && choice == 3)) {
            System.out.println("Ошибка! Значения одинаковые!");
        }
        else{
            if (select == 2 && choice == 1){
                temperature = (temperature - 32) / 1.8;
                choice = 2;
            }
            else if (select == 2 && choice == 3){
                temperature -= 273.15;
                choice = 2;
            }
            else if (select == 1 && choice == 2){
                temperature = temperature * 1.8 + 32;
                choice = 1;
            }
            else if (select == 1 && choice == 3){
                temperature = (temperature - 273.15) * 1.8 + 32;
                choice = 1;
            }
            else if (select == 3 && choice == 1){
                temperature = (temperature - 32) / 1.8 + 273.15;
                choice = 3;
            }
            else if (select == 3 && choice == 2){
                temperature += 273.15;
                choice = 3;
            }


            System.out.println("Новая температура: " + temperature);
        }
    }
}
