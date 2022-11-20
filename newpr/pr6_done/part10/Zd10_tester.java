package ru.mirea.newpr.pr6_done.part10;

import java.util.Scanner;

public class Zd10_tester {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        while (true){
            System.out.println("Операции для выполения:\n(1 - добавить позицию, 2 - удалить позицию, 3 - найти позицию, 4 - показать список позиций, 5 - выход из магазина)");
            int choice;
            choice = scanner.nextInt();
            if (choice == 1){
                Processor processor = new Processor();
                Memory memory = new Memory();
                Monitor monitor = new Monitor();
                Computer new_comp = new Computer(processor, memory, monitor);
                shop.addComputer(new_comp);
                System.out.println("Позиция добавлена!");
            }
            else if (choice == 2) {
                shop.removeComputer();
                System.out.println("Позиция удалена!");
            }
            else if (choice == 3) {
                Computer ans = shop.findComputer();
                System.out.println(ans);
            }
            else if (choice == 4) {
                shop.printAllComputers();
            }
            else break;
        }
    }
}
