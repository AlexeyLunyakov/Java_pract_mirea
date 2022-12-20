package ru.mirea.newpr.pr25_done;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class IPv4_check {
    public static void main(String[] args) {
        //192.168.50.1
        boolean main = true;
        while(main) {
            String reg = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$";
            System.out.print("Enter IPv4 (127.0.0.1 - correct) (close prgrm with 0 element): ");
            Scanner scan = new Scanner(System.in);
            String address = scan.next();
            if (Pattern.matches(reg, address)) {
                System.out.println("Корректно");
            } else {
                System.out.println("Некорректно");
            }
            if (Objects.equals(address, "0")) {
                main = false;
            }
        }
    }
}
