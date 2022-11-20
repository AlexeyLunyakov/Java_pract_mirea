package ru.mirea.newpr.pr6_done.part10;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    ArrayList<Computer> computers;
    Shop(){
        computers = new ArrayList<>();
    }

    public void addComputer(Computer newComputer){
        computers.add(newComputer);
    }
    public void removeComputer(){
        computers.remove(findComputer());
    }
    public void printAllComputers(){
        if (computers.size() != 0) {
            System.out.println("Все товары в наличии: \n");
            for (int i = 0; i < computers.size(); ++i)
                System.out.println((i + 1) + ". " + computers.get(i) + "\n");
        }
        else System.out.println("Магазин пуст");
    }
    public Computer findComputer(){

        Computer comp_ = null;
        Processor processor_ = null;
        Memory memo_ = null;
        Monitor monitor_ = null;
        Company company_ = null;

        Scanner scanner = new Scanner(System.in);
        int count;
        System.out.print("Количество параметров выбора:\n(от 1 до 4): ");
        count = scanner.nextInt();

        for (int i = 0; i < count; ++i){
            int param;
            System.out.print("Выберите параметр подбора:\n(1 - процессор, 2 - память, 3 - монитор, 4 - марка): ");
            param = scanner.nextInt();
            if (param == 1)
                processor_ = new Processor();
            else if (param == 2)
                memo_ = new Memory();
            else if (param == 3)
                monitor_ = new Monitor();
            else {
                System.out.print("Марка: \n1 - MSI, 2 - Lenono, 3 - Honor: ");
                int choice = scanner.nextInt();
                if (choice == 1)
                    company_ = Company.MSI;
                else if (choice == 2)
                    company_ = Company.Lenono;
                else company_ = Company.Honor;
            }
        }
        for (Computer element: computers){
            if(element.isComputer(processor_, memo_, monitor_, company_))
                comp_ = element;
        }
        if (comp_ == null)
            System.out.println("Товара нет в наличии");
        return comp_;
    }



}
