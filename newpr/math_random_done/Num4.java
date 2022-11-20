package ru.mirea.newpr.math_random_done;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Num4 {
    public static boolean isNum(String str) { // проверяем на возможность конвертации в int
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public static int cin_date(String n){ // проверяем входное значение
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите размер массива: ");
            n = sc.next();
            if (isNum(n))
                break;
            else
                System.out.print("Некорректный ввод!\n");
        }
        return Integer.parseInt(n);
    }

    public static void main(String []args){
        String n = "";

        int size = cin_date(n);

        int [] arr = new int[size];
        ArrayList<Integer> new_arrlist = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < size; ++i) {
            arr[i] = rand.nextInt(size + 1);
            if (arr[i] % 2 == 0) // закидываем в массив четных элементов сразу
                new_arrlist.add(arr[i]);
        }

        System.out.print("\nПолучившийся массив: [");
        for (int i = 0; i < size; ++i)
            if (i != size - 1)
                System.out.print(arr[i] + ", ");
            else
                System.out.print(arr[i] + "]\n");

        System.out.print("\nМассив из четных элементов:");
        System.out.print(new_arrlist);
    }
}
