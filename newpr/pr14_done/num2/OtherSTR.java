package ru.mirea.newpr.pr14_done.num2;

import java.util.Scanner;

public class OtherSTR {
    public static boolean isStrangeStr(String s) {
        return s.equals("abcdefghijklmnopqrstuv18340"); // abcdefghijklmnopqrstuv18340
                                                        // abcdefghijklmnoasdfasdpqrstuv18340
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String value = scan.next();
        if (isStrangeStr(value)) {
            System.out.print("Строка действительно является данной");
        }
        else {
            System.out.print("Строка не является данной");
        }
    }
}
