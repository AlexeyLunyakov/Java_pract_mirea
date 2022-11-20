package ru.mirea.newpr.pr13_done.num2;

public class Person {
    private String name;
    private final String surname;
    private String patronymic;

    public Person(String surname) {
        this.surname = surname;
    }

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getFio(){
        StringBuilder fio = new StringBuilder(surname);
        if(name != null && ! name.equals(""))
            fio.append(" ").append(name);
        if(patronymic != null && ! patronymic.equals(""))
            fio.append(" ").append(patronymic);
        return fio.toString();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Луняков");
        Person p2 = new Person("Алексей", "Луняков", "");
        Person p3 = new Person("Алексей", "Луняков", "Александрович");
        System.out.println(p1.getFio());
        System.out.println(p2.getFio());
        System.out.println(p3.getFio());
    }
}
