package ru.mirea.newpr.pr11_done;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Zd11_tester {

    public static ArrayList<Integer> createArrayList(){
        ArrayList<Integer> ans = new ArrayList<>(10);
        for (int i = 0; i < 10; ++i)
            ans.add(i, i + 1);
        return ans;
    }

    public static LinkedList<Integer> createLinkedList(){
        LinkedList<Integer> ans = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; ++i)
            ans.add(i + 1);
        return ans;
    }

    public static void main(String [] args) throws ParseException {
//Задание 1
        Date dateBegin = new Date(122, Calendar.SEPTEMBER, 23, 12, 40); // set(year + 1900, month, date, hrs, min)
        Date dateEnd = new Date();
        System.out.print("Задание 1\nЛуняков Алексей Александрович:\n    Дата получения работы: " + dateBegin.toString()
                + "\n    Дата завершения работы: " + dateEnd.toString() + "\n");
//Задание 2
        System.out.print("\nЗадание 2\nВведите дату (в таком формате 2002-12-31): ");
        Scanner scan = new Scanner(System.in);
        String stringDate = scan.next();
        Date personDate = new SimpleDateFormat("y-M-d").parse(stringDate);
        Date now = new Date();
        if (now.getTime() - personDate.getTime() < 86400000 && now.getTime() - personDate.getTime() > 0)
            System.out.print("\n! Введенные данные совпадают\n");
        else if (now.getTime() - personDate.getTime() > 86400000)
            System.out.print("\n! Эта дата была в прошлом\n");
        else System.out.print("\n! Эта дата будет в будущем\n");
//Задание 3
        Scanner scan2 = new Scanner(System.in);
        System.out.print("\nЗадание 3\nВведите имя студента: ");
        String name = scan2.next();
        System.out.print("Введите дату (в таком формате 2017-9-11): ");
        String stringDate2 = scan2.next();
        Date personDate2 = new SimpleDateFormat("y-M-d").parse(stringDate2);
        System.out.print(personDate2);
        Student ans = new Student(name, personDate2);
        System.out.print("\nФорматы даты (можно выбрать только один):\n" +
                "1 - год (4 знака).месяц (2 знака).день (2 знака)\n" +
                "2 - день (2 знака), месяц (2 знака), год (2 знака)\n" +
                "3 - сокр. день недели, день, месяц (название), год (4 знака)\n" +
                "Ваш выбор: ");
        int choice = scan2.nextInt();
        System.out.print(ans.toString(choice));
//Задание 4
        Scanner scan3 = new Scanner(System.in);
        System.out.print("\nЗадание 4\nВведите дату (в таком формате 05-09-2018 13:01): ");
        String stringDate3 = scan3.nextLine();
        Date personDate3 = new SimpleDateFormat("dd-MM-yyyy HH:mm").parse(stringDate3);
        System.out.print(personDate3);

//Задание 5
        System.out.println("\nЗадание 5\n");
        long start = System.nanoTime();
        ArrayList<Integer> first = createArrayList();
        long timeWorkCode = System.nanoTime() - start;
        System.out.println("Время добавления 10 элементов в ArrayList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        LinkedList<Integer> second = createLinkedList();
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время добавления 10 элементов в LinkedList: " + timeWorkCode + " наносекунд"); // почему долго
        start = System.nanoTime();
        first.remove(4);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время удаления в ArrayList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        second.remove(4);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время удаления в LinkedList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        first.add(1, 100);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время вставки в ArrayList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        second.add(1, 100);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время вставки в LinkedList: " + timeWorkCode + " наносекунд");
    }
}
