package ru.mirea.newpr.pr6_done.part10;

import java.util.Scanner;

public class Computer {
    private Processor processor;
    private Memory ram;
    private Monitor monitor;
    private Company company;

    public boolean isComputer(Processor processor_, Memory memory_, Monitor monitor_, Company company_){
        boolean result = true;
        if (processor_ != null && !processor.equals(processor_))
            result = false;
        if (memory_ != null && !ram.equals(memory_))
            result = false;
        if (monitor_ != null && !monitor.equals(monitor_))
            result = false;
        else if (company_ != null && company != company_)
            result = false;
        return result;
    }

    Computer(Processor processor_, Memory memory, Monitor monitor_){
        Scanner scanner = new Scanner(System.in);
        processor = processor_;
        ram = memory;
        monitor = monitor_;
        System.out.print("Выберите название марки компьютера (1 - MSI, 2 - Lenovo, 3 - Honor: ");
        int count = scanner.nextInt();
        if (count == 1)
            company = Company.MSI;
        else if (count == 2)
            company = Company.Lenono;
        else company = Company.Honor;
    }

    public String getStringMark(){
        String markString = "Марка: ";
        if (company == Company.MSI)
            markString += "MSI";
        else if (company == Company.Lenono)
            markString += "Lenovo";
        else
            markString += "Honor";
        return markString;
    }

    @Override
    public String toString() {
        return "Computer: \n" + processor + ram + monitor + getStringMark() + "\n";
    }
}
