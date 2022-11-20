package ru.mirea.newpr.pr20_done.num1_2_3;

public class Ident {
    private final String name;
    private final String kind;
    Ident(){
        name = "Momento-mory";
        kind = "Mamonth";
    }

    @Override
    public String toString() {
        return "Вид: " + kind + ". Имя: " + name;
    }
}
