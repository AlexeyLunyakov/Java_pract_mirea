package ru.mirea.newpr.pr14_done.num6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    public static boolean checkEmail(String s){
        Matcher m = Pattern.compile(
                "[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }

    public static void main(String [] args){
        System.out.println(checkEmail("user@example.com"));
        System.out.println(checkEmail("myhost@@@com.ru"));
        System.out.println(checkEmail("@my.ru"));
        System.out.println(checkEmail("Julia String."));
    }
}
