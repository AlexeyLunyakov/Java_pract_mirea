package ru.mirea.newpr.pr7_done.num7_8;

//import num5_6.ProcessStrings;

public class Magazine implements Printable{
    private String name;
    private int issue;
    Magazine(String name, int issue){
        this.name = name;
        this.issue = issue;
    }

    public static void printMagazines(Printable[] printable){
        System.out.print("Журналы: ");
        for (Printable el: printable){
            if (el instanceof Magazine)
                System.out.print(((Magazine) el).getName() + " ");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Параметры журнала:\n    Название: " + name + "\n    Цена: " + issue);
    }
}
