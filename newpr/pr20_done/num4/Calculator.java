package ru.mirea.newpr.pr20_done.num4;

public class Calculator {
    public static <T extends Number, V extends Number> void Summa(T first, V second){
        System.out.println(first.doubleValue() + second.doubleValue());
    }
    public static <T extends Number, V extends Number> void Subst(T first, V second){
        System.out.println(first.doubleValue() - second.doubleValue());
    }
    public static <T extends Number, V extends Number> void Multi(T first, V second){
        System.out.println(first.doubleValue() * second.doubleValue());
    }
    public static <T extends Number, V extends Number> void Div(T first, V second){
        System.out.println(first.doubleValue() / second.doubleValue());
    }

    public static void main(String [] args){
        Integer first = 5;
        Double second = 5.3;
        String chisla = "Числа: ";
        String iint = "\nint ";
        String ddouble = "\ndouble ";
        System.out.println(String.format("%s %s %s %s %s", chisla, iint, first, ddouble, second));

        System.out.println("Сумма (строки): ");
        System.out.println(first + second);

        System.out.println("Сумма (калькулятор): ");
        Calculator.Summa(first, second);

        System.out.println("Произведение: ");
        Calculator.Multi(first, second);

        System.out.println("Частное: ");
        Calculator.Div(first, second);

        System.out.println("Разность: ");
        Calculator.Subst(first, second);
    }
}
