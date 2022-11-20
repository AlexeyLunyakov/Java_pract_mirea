package ru.mirea.newpr.pr10_done;

public class SortingStudentByField {
    public int compare(Object o1, Object o2, String field) {
        if (!(o1 instanceof Student && o2 instanceof Student)){
            throw new IllegalArgumentException("Объекты не являются студентами!");
        }
        switch (field) {
            case "name":
                String name1 = ((Student) o1).getName();
                String name2 = ((Student) o2).getName();
                return name1.compareTo(name2);
            case "surname":
                String surname1 = ((Student) o1).getSurname();
                String surname2 = ((Student) o2).getSurname();
                return surname1.compareTo(surname2);
            case "job":
                String job1 = ((Student) o1).getJob();
                String job2 = ((Student) o2).getJob();
                return job1.compareTo(job2);
            case "grade":
                return ((Student) o1).getGrade() - ((Student) o2).getGrade();
            case "group":
                String gr1 = ((Student) o1).getGroup();
                String gr2 = ((Student) o2).getGroup();
                return gr1.compareTo(gr2);
            default:
                throw new IllegalArgumentException("Был введено некорректное название поля");
        }
    }

}
