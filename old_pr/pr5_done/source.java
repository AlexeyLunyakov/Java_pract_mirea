package git.old_pr.pr5_done;

public class source {
    // 6 Проверка числа на простоту;
    /*
    Дано натуральное число n>1. Проверьте, является ли оно простым.
    Программа должна вывести слово YES, если число простое и NO, если число составное.
     */
    private static void isPrime(int number) {
        isPrime(number, 2);
    }
    private static void isPrime(int number, int del){
        if (number == 2) {
            System.out.println("YES");
            return;
        }
        if(number % del == 0) {
            System.out.println("NO");
            return;
        }
        if(del > Math.sqrt(number)){
            System.out.println("YES");
            return;
        }
        isPrime(number, del + 1);
    }

    // ------------------------------------------------------------------------------------
    // 8 Палиндром
    /*
    Дано слово, состоящее только из строчных латинских букв.
    Проверьте, является ли это слово палиндромом. Выведите YES или NO.
     */
    private static void palindr_num(String s){
        if(s.length() == 1){
            System.out.println("YES"); return;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            System.out.println("NO"); return;
        }
        if(s.length()==2){
            System.out.println("YES"); return;
        }
        palindr_num(s.substring(1, s.length()-1));
    }


    // ------------------------------------------------------------------------------------
    // 10 Разворот числа
    /*
    Дано число n, десятичная запись которого не содержит нулей.
    Получите число, записанное теми же цифрами, но в противоположном порядке.
     */

    private static int revers_num(int num, int rev){
        if(num == 0) {
            return rev;
        }
        return revers_num(num/10, 10*rev + num%10);
    }

    // ------------------------------------------------------------------------------------
    // 7 Разложение на множители
    /*
    Дано натуральное число n>1.
    Выведите все простые множители этого числа в порядке не убывания с учетом кратности.
     */
    private static boolean isNumPrime(int number){
        return isNumPrime(number, 2);
    }
    private static boolean isNumPrime(int number, int div){
        if(number == 2) return true;
        if(number % div == 0) {
            return false;
        }
        if(div > Math.sqrt(number)){
            return true;
        }
        return isNumPrime(number, div+1);
    }

    private static void factorization(int number) {factorization(number, 2);}
    private static void factorization(int number, int div){
        if(number == 2) {
            System.out.println("2");
            return;
        }
        if(number <= 1) return;
        if(!isNumPrime(div)) {
            factorization(number, div+1);
            return;
        }
        if(number % div == 0){
            System.out.print(div +", ");
            factorization(number / div, div);
        }else factorization(number, div+1);
    }
    // ------------------------------------------------------------------------------------




    public static void main(String[] args) {
        System.out.println("Тестирование упражнений 6, 7, 8, 10");
        //Тестирование 6
        System.out.println("Эти числа простые?");
        System.out.println("2: "); isPrime(2);
        System.out.println("1238: "); isPrime(1238);
        System.out.println("1151: "); isPrime(1151); // Простое

        //Тестирование 7
        System.out.println("\nРазложение чисел на множители: ");
        System.out.println("525: "); factorization(525);
        System.out.println();
        System.out.println("1340: "); factorization(1340);
        System.out.println();
        System.out.println("320: "); factorization(320);
        System.out.println();
        System.out.println("4: "); factorization(4);

        //Тестирование 8
        System.out.println("\nПалиндром: ");
        System.out.println("hellolleh: "); palindr_num("hellolleh");
        System.out.println("qwerty: "); palindr_num("qwerty");
        System.out.println("abcdefgfedcba: "); palindr_num("abcdefgfedcba");

        //Тетсирование 10
        System.out.println("\nРазворот чисел: ");
        System.out.println("123: ");
        System.out.println(revers_num(123,0));
        System.out.println("5: ");
        System.out.println(revers_num(5, 0));
        System.out.println("4891: ");
        System.out.println(revers_num(4891, 0));
    }
}
