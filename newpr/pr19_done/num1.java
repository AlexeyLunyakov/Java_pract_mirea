package ru.mirea.newpr.pr19_done;

import java.util.Scanner;
import java.util.regex.Pattern;

public class num1 {
    private static final Pattern innPatter = Pattern.compile("\\d{12}");
    public static boolean isValidINN(String inn) {
        inn = inn.trim();
        return innPatter.matcher(inn).matches();
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String name = scan.next();
        System.out.println("Введите ИНН пользователя: ");
        // 12 символов
        String inn = scan.next();
        try {
            boolean ans = isValidINN(inn);
            if (ans)
                System.out.println("Покупка прошла. ");
            else throw new ArithmeticException();

        }
        catch(ArithmeticException ignored){
            System.out.println("Вы ввели неправильный ИНН! ");
        }
    }
}
