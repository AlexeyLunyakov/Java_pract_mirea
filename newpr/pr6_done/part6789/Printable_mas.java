package ru.mirea.newpr.pr6_done.part6789;

import java.util.ArrayList;

public class Printable_mas {
    public static void main(String [] args){
        ArrayList<Printable> arr = new ArrayList<>();
        arr.add(new Book("Nex SCP", "Afold Bernington"));
        arr.add(new Book("1990 - year of smth", "Nobble Ring"));
        arr.add(new Shop("Nex SCP", 6932, "01/12/1992"));
        arr.add(new Shop("1990 - year of smth", 2923, "13/04/2020"));
        for (Printable el: arr){
            el.print();
        }
    }
}
