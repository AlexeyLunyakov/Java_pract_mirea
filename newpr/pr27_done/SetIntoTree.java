package ru.mirea.newpr.pr27_done;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIntoTree {
    public static <T> Set<T> getInstance(Set<T> hashSet) {
        return new TreeSet<T>(hashSet);
    }
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("HFSF");
        hashSet.add("DWIR");
        hashSet.add("MKDE");
        hashSet.add("IRER");
        hashSet.add("PEOR");
        Set<String> treeSet = getInstance(hashSet);
        System.out.println(treeSet);
    }
}
