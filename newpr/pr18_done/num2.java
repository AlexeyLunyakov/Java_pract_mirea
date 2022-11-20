package ru.mirea.newpr.pr18_done;

import java.util.Scanner;

public class num2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        // Задание 3
        /*catch (Exception ignored){
            //Добавление общего catch Exception приводит к тому, что
        //остальные catch не нужны и они не будут никогда отрабатывать
            System.out.println("Exception");
        }*/
        catch (ArithmeticException ignored){
            System.out.println("Division by zero");
        }
        catch ( NumberFormatException ignored){
            System.out.println("Not an Int-type");
        }
        // задание 4
        finally {
            // Блок finally всегда будет отрабатываться: и при исключении, и без них.
            System.out.println("finally-part");
        }
    }

    public static void main(String [] args){
        num2 a = new num2();
        a.exceptionDemo();
    }
}
