package ru.mirea.newpr.math_random_done;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Num1 {

    public static void random_Rand(double [] arr){
        Random rand = new Random();
        System.out.println("Способ 1:");
        for (int i = 0; i < arr.length; ++i)
            arr[i] = rand.nextDouble();
    }

    public static void random_Math(double [] arr){
        System.out.println("Способ 2:");
        for (int i = 0; i < arr.length; ++i)
            arr[i] = Math.random();
    }

    public static void printArr(double []arr){
        for (int i = 0; i < arr.length; ++i)
            System.out.println("    " + arr[i] + " ");
        System.out.println();
    }
    public static void print(double [] arr){
        System.out.println("Неотсортированный массив: ");
        printArr(arr);
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: ");
        printArr(arr);
    }



    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Введите размер массива: ");
        n = scan.nextInt();
        double [] arr = new double[n];
        random_Rand(arr);
        print(arr);
        random_Math(arr);
        print(arr);
    }
}
