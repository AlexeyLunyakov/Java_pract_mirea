package git.old_pr.pr6_done;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        // заполнение массива Student элементами
        Student[] students = new Student[]{
            new Student(1, 2), new Student(14, 5),
                new Student(324, 123), new Student(2, 3)
        };
        // Вывод неотсортированных элементов
        System.out.println("Вывод элементов, без сортировки: ");
        for (Student s : students) {
            System.out.println(s);
        }

        // Сортировка массива вставками
        /*System.out.println();
        System.out.println("Вывод элементов, сортировка вставками: ");
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];

            int j;
            for(j = i - 1; j >= 0 && current.compareTo(students[j]) < 0; j--) { // вызываем функцию сравнения класса Comparable
                students[j + 1] = students[j];
            }
            students[j + 1] = current;
        }
        for (Student s : students) {
            System.out.println(s);
        }*/

        // Быстрая сортировка по GPA
        System.out.println();
        System.out.println("Вывод элементов, быстрая сортировка: ");
        qSort(students, students.length - 1, 0); // вызов функции qsort
        for (Student s : students) {
            System.out.println(s);
        }

    }

    private  static StudentComp comp = new StudentComp();

    public static void qSort(Object[] array, int high, int low){

        // проверка на неправильное условие \ выход из сортировки
        if(array == null || array.length == 0) return;
        if(high <= low) return;

        Object middle = array[(low + high)/2]; // серединный элемент

        // разделение на три подмассива
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>(); // массив эквивалентых серединному

        for(int i = low; i <= high; i++){
            // запись значений в зависимости от сравнения с центральным значением
            if(comp.compare(array[i], middle) > 0){
                right.add(array[i]);
            }
            else if (comp.compare(array[i], middle) < 0)
                left.add(array[i]);
            else eq.add(array[i]);
        }

        Object[] leftArr;
        Object[] rightArr;
        if(left.size()>0) {
            leftArr = left.toArray();
            qSort(leftArr, left.size() - 1, 0); // рекурсивная сортировка подмассива
            System.arraycopy(leftArr, 0, array, low, left.size()); // через статический метод копируем элементы из исходного в целевой
        }

        System.arraycopy(eq.toArray(), 0, array, low+left.size(), eq.size());

        if(right.size() > 0) {
            rightArr = right.toArray();
            qSort(rightArr, right.size() - 1, 0);
            System.arraycopy(rightArr, 0, array, low+left.size() + eq.size(), right.size());

        }

    }
}


