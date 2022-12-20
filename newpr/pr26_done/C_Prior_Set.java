package ru.mirea.newpr.pr26_done;
import java.util.PriorityQueue;

public class C_Prior_Set {
    public static void main(String[] args) {
        PriorityQueue<Integer> a = new PriorityQueue<>();
        for (int i = 0; i < 10; ++i)
            a.add(10 - i);
        System.out.println(a.poll());
        System.out.println(a.poll());
        System.out.println(a.poll());
    }
}
