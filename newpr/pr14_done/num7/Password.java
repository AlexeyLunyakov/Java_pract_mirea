package ru.mirea.newpr.pr14_done.num7;

import java.util.regex.Pattern;

public class Password {

    public static boolean checkPass(String s){
        return Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(s).find();
    }

    public static void main(String [] args){
        System.out.println();
        System.out.println(checkPass("F032_Password"));
        System.out.println(checkPass("qoejqQWEkmkeq123"));

        System.out.println(checkPass("smart_pass"));
        System.out.println(checkPass("A007"));
    }
}
