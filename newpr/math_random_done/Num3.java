package ru.mirea.newpr.math_random_done;

import java.util.Random;

public class Num3 {

    public static void main(String []args){
        Random rand = new Random();
        int [] arr = new int[4];

        for (int i = 0; i < 4; ++i)
            arr[i] = rand.nextInt(99);

        System.out.println("Массив: ");
        for (int i = 0; i < 4; ++i)
            System.out.print(arr[i] + " ");

        if (arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3])
            System.out.println("\nПоследовательность строго возрастает");
        else
            System.out.println("\nПоследовательность не строго возрастает");
    }
}
