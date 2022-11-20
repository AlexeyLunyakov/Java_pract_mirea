package ru.mirea.newpr.pr20_done.num4;

public class MinMax<T extends Comparable<T>> {
    final private T[] array;
    MinMax(T[] newArray){
        array = newArray;
    }
    T getMax(){
        T ans = array[0];
        for (int i = 1; i < array.length; ++i){
            if (ans.compareTo(array[i]) < 0)
                ans = array[i];
        }
        return ans;
    }
    T getMin(){
        T ans = array[0];
        for (int i = 1; i < array.length; ++i){
            if (ans.compareTo(array[i]) > 0)
                ans = array[i];
        }
        return ans;
    }

    public static void main(String [] args){
        Double[] tmp = new Double[5];
        tmp[0] = 25.3;
        tmp[1] = 2.1;
        tmp[2] = 123.8;
        tmp[3] = 42.3;
        tmp[4] = 0.1;
        MinMax<Double> ans = new MinMax<>(tmp);
        System.out.println("Максимальное значение: \t" + ans.getMax() + "\nМинимальное значение: \t" + ans.getMin());
    }
}
