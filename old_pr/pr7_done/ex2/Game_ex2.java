package git.old_pr.pr7_done.ex2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Game_ex2 {
    Queue<Integer> first_pl, second_pl;

    public Game_ex2(String first_pl, String second_pl) {
        this.first_pl = new ArrayDeque<>();
        this.second_pl = new ArrayDeque<>();
        for(int i = 0; i < 5; i ++){
            // используем Queue, вызываем функцию add
            this.first_pl.add(Integer.parseInt(first_pl.substring(i, i + 1)));
            this.second_pl.add(Integer.parseInt(second_pl.substring(i, i + 1)));
        }
    }

    public String play(){
        int moves = 0;
        while(!first_pl.isEmpty() && !second_pl.isEmpty() && moves < 106){
            if(first_pl.peek() > second_pl.peek() && second_pl.peek() != 0){ // аналогично с Stack с помощью peek возвращаем элемент из головы очереди
                // используем add для добавления в конец Queue
                first_pl.add(first_pl.remove());
                first_pl.add(second_pl.remove());
            }
            else{
                second_pl.add(first_pl.remove());
                second_pl.add(second_pl.remove());
            }
            moves++;
        }

        String res = "";
        if(first_pl.isEmpty()) {
            res += "second ";
        }
        else {
            res += "first ";
        }
        res += moves;
        if(moves >= 106) {
            res = "botva (>= 106)";
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Пьяница, используем Deque: ");
        System.out.println(new Game_ex2("13579", "24680").play());
        System.out.println(new Game_ex2("12345", "67890").play());
        System.out.println(new Game_ex2("74980", "16235").play());
    }

}
