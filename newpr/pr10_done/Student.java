package ru.mirea.newpr.pr10_done;

public class Student {
    private String name;
    private String surname;
    private String job;
    private int grade;
    private String group;

    public Student(String name, String surname, String job, int grade, String group){
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.grade = grade;
        this.group = group;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getJob(){
        return this.job;
    }

    public int getGrade(){
        return this.grade;
    }

    public String getGroup(){
        return this.group;
    }

    public String toString(){
        return getName() + " " + getSurname() + ", который работает по специальности: " + getJob() + ", из группы " + getGroup() + " в классе "
        + getGrade() ;
    }
}
