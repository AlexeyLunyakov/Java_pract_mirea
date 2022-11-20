package ru.mirea.newpr.pr14_done.num3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Curren {

    public static ArrayList<String> findRubEurUsd(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }
// 1239.98 USD
// 9472 ERR, 00123 EU
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String value = scan.nextLine();
        ArrayList<String> ans = findRubEurUsd(value);
        if (ans.size() == 0) {
            System.out.println("\nНеправильные значения");
        }
        else {
            System.out.println(ans);
        }

    }
}
