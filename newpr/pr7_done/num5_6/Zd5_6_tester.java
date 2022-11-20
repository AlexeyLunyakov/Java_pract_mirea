package ru.mirea.newpr.pr7_done.num5_6;

import java.util.Scanner;

public class Zd5_6_tester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Исходная строка:\n");
        String new_str = scan.next();

        ProcessStrings ref_str = new ProcessStrings(new_str);

        System.out.print("Символ (подсчет его повторений):\n");
        String tmp = scan.next();

        System.out.println("Количество символов: " + ref_str.countChar(tmp.charAt(0)));

        System.out.println("Строка (нечетные позиции исходной): " + ref_str.odd());

        ref_str.reverse();
        System.out.print("Инвертированная строка: " + ref_str.getCurrent());
    }
}
