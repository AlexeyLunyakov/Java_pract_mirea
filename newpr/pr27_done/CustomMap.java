package ru.mirea.newpr.pr27_done;

import java.util.HashMap;
import java.util.Map;

public class CustomMap {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            map.put("Surname"+i%10, "Name"+i%3);
        }
        return map;
    }
    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name))
                count++;
        }
        return count;
    }
    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(familiya))
                count++;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(createMap());
        System.out.println(getCountTheSameFirstName(createMap(), "Name2"));
        System.out.println(getCountTheSameLastName(createMap(), "Surname1"));
        System.out.println(getCountTheSameLastName(createMap(), "Name1"));
    }
}
