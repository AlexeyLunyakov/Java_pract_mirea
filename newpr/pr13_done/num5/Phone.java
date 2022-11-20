package ru.mirea.newpr.pr13_done.num5;

public class Phone {
    final private String country_code, city, triple_num, quad_num;

    public Phone(String number){
        if(number.startsWith("8"))
            country_code = "+7";
        else
            country_code = number.substring(0, number.length()-10);
        city = number.substring(number.length()-10, number.length()-7);
        triple_num = number.substring(number.length()-7, number.length()-4);
        quad_num = number.substring(number.length()-4);
    }

    @Override
    public String toString() {
        return country_code + city + "-" + triple_num + "-" + quad_num;
    }

    public static void main(String [] args){
        System.out.println(new Phone("+131289652211"));

        System.out.println(new Phone("+79115738294"));

        System.out.println(new Phone("89161248912"));
    }
}
