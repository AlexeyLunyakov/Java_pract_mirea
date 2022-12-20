package ru.mirea.newpr.pr21_done;

import java.io.File;
import java.nio.file.Paths;
import java.util.*;

public class AllWork {
    //Задание 1 Конвертация массива строк\чисел в список
    public static <T> ArrayList<T> arrayToList(T[] arr){
        if(arr == null) {
            throw new IllegalArgumentException("Ошибка! Пустой массив..");
        }
        ArrayList<T> newArr = new ArrayList<>(arr.length);
        Collections.addAll(newArr, arr);
        return newArr;
    }

    //Задание 3 Метод для возвращения запрашиваемого элемента по индексу
    public static <T> T get(T[] arr, int i){
        if (i < 0 || i >= arr.length) {
            throw new IndexOutOfBoundsException("Ошибка! Размер массива: " + arr.length + ", Позиция символа: " + i);
        }
        return arr[i];
    }

    //Задание 4 Сохранение содержимого каталога в списке + вывод первых пяти элементов на экран
    public static ArrayList<File> DirectoryRead(String path){
        File f = new File(path);
        if (!f.exists() || !f.isDirectory()) {
            throw new IllegalArgumentException("Ошибка! Некорректный путь..");
        }
        ArrayList<File> lf = new ArrayList<File>();
        Collections.addAll(lf, Objects.requireNonNull(f.listFiles()));
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(lf.get(i).getName());
            }
        } catch (Exception e) {
            System.out.println("Ошибка! В данном каталоге меньше 5 файлов..");
        }
        return lf;
    }

    public static void main(String[] args) {
        // Создаем массив из 15 чисел
        ArrayClass<Integer> tmp1 = new ArrayClass<>(8);
        for(int i = 0; i < 13; i++) {
            tmp1.add(i);
        }
        System.out.println(tmp1);
        // убрали один элемент
        tmp1.remove(5);
        System.out.println(tmp1);
        //  выводим пятый элемент массива
        System.out.println("\tПятый элемент массива: " + tmp1.get(5) + "\n");
        // создаем пустой массив
        ArrayClass<String> tmp2 = new ArrayClass<>(11);
        System.out.println(tmp2);
        // заполняем путой массив
        for (int i = 0; i < 10; i++) {
            tmp2.add("elem " + (i+1));
        }
        System.out.println(tmp2 + "\n");
        // создаем массив из предыдущего
        ArrayClass<String> tmp3 = new ArrayClass<>(tmp2);
        System.out.println(tmp3);
        // убираем пятый элемент
        tmp3.remove(5);
        // выводим из старого и нового пятый элемент
        System.out.println("\tПятый элемент старого массива: " + tmp2.get(5));
        System.out.println("\tПятый элемент нового массива: " + tmp3.get(5));
        // перевод массива в строки
        tmp3.sort(String::compareTo);
        System.out.println(tmp3 + "\n");
        // вывод элемента тестового массива по индексу
        // сам массив
        String[] a = new String[]{"Test", "mass", "is", "cool"};
        ArrayList<String> l = arrayToList(a);
        System.out.println(l + "\n");
        // элементы
        System.out.println("Элементы массива: \n");
        System.out.println("0: "+get(a, 0));
        System.out.println("2: "+get(a, 2));
        // вывод пяти элементов каталога
        System.out.println("Каталоги директории: \n");
        ArrayList<File> files = DirectoryRead(Paths.get("").toAbsolutePath().toString());
        System.out.println();
        System.out.println(files + "\n");
    }
}
