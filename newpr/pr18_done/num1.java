package ru.mirea.newpr.pr18_done;

public class num1 {
    public void exceptionDemo() {
        try {
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
        //infinity
    }

    public static void main(String [] args){
        num1 a = new num1();
        a.exceptionDemo();
    }
}
