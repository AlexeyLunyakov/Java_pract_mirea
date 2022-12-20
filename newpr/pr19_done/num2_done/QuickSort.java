package ru.mirea.newpr.pr19_done.num2_done;

import java.util.Objects;
import java.util.Scanner;

public class QuickSort {
    private static SortingStudentsByGPA comparator = new SortingStudentsByGPA();
    public static void quickSort(Student[] array, int low, int high){
        if(array == null || array.length == 0) {
            return;
        }
        if(high <= low) {
            return;
        }
        Student middle = array[(low + high)/2];
        int i = low;
        int j = high;
        while (i <= j){
            while (comparator.compare(middle, array[i]) < 0) {
                i++;
            }
            while (comparator.compare(middle, array[j]) > 0) {
                j--;
            }
            if (i <= j) {
                Student tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(array, low, j);
        }
        else if (high > i) {
            quickSort(array, i, high);
        }
    }

    public static Student findStudent(Student[] all, String name) throws StudentNotFoundException {
        for (Student el: all) {
            if (Objects.equals(el.getName(), name)) {
                return el;
            }
        }
        throw new StudentNotFoundException("Такого студента нет");
    }

    public static void main(String []args) throws StudentNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int size = scan.nextInt();
        Student [] iDNumber = new Student[size];
        for (int i = 0; i < size; ++i) {
            System.out.print("\nВведите имя студента: ");
            String name = scan.next();
            if (Objects.equals(name, "")) {
                try {
                    throw new EmptyStringException("Введена пустая строка");
                } catch (EmptyStringException e) {
                    System.out.println("Ввели пустое имя. Попробуйте снова");
                    i--;
                    continue;
                }
            }
            System.out.print("Введите средний балл студента " + name + ": ");
            String GPA_str = scan.next();
            try {
                int GPA = Integer.parseInt(GPA_str);
                iDNumber[i] = new Student(name, GPA);
            }
            catch(NumberFormatException ignored) {
                System.out.println("Ввели некорректное число. Попробуйте снова");
                i--;
            }
        }
        System.out.println("\nСортировка...\n");
        quickSort(iDNumber, 0, iDNumber.length - 1);
        for (Student s : iDNumber) {
            System.out.println(s);
        }
        String name;
        while (true){
            System.out.print("Введите имя студента, которого хотите найти: ");
            name = scan.next();
            if (Objects.equals(name, "")){
                try {
                    throw new EmptyStringException("Введена пустая строка");
                }
                catch (EmptyStringException e) {
                    System.out.println("Ввели пустое имя. Попробуйте снова");
                }
            }
            else {
                break;
            }
        }
        Student ans = findStudent(iDNumber, name);
        System.out.println(ans);
    }
}