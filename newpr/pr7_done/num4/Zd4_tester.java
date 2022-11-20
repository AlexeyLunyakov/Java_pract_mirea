package ru.mirea.newpr.pr7_done.num4;

import java.util.Scanner;

public class Zd4_tester {
    public static void main(String [] args){
        System.out.print("Действительная часть комплексного числа: ");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();

        System.out.print("Мнимая часть комплексного числа: ");
        double y = scan.nextDouble();
        MathFunc func = new MathFunc(x, y);

        System.out.print("Степень комплексного числа: ");
        int k = scan.nextInt();
        func.powComplex(k);

        System.out.print("Новое (возведенное в степень) комплексное число: " + func);
    }
}
