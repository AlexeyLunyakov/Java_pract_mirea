package ru.mirea.newpr.pr19_done.num2_done;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String errorMessage){
        super(errorMessage);
    }
}