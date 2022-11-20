package ru.mirea.newpr.pr7_done.num7_8;

public class Zd7_8_tester {

    public static void main(String [] args){
        Printable [] massive = new Printable[5];
        for (int i = 1; i < 5; ++i){
            if (i % 2 != 0) {
                Book tmp = new Book("Kalipso Protocol " + i, "Aizek Clark");
                massive[i] = tmp;
            }
            else {
                Magazine tmp = new Magazine("Komsomol Truth " + i, 120731);
                massive[i] = tmp;
            }
        }
        Magazine.printMagazines(massive);

        System.out.print("\n");

        Book.printBooks(massive);
    }
}
