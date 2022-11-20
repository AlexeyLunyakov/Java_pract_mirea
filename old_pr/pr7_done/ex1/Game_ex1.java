package git.old_pr.pr7_done.ex1;

import java.util.Stack;

public class Game_ex1 {
    Stack<Integer> first_pl, second_pl;

    public Game_ex1(String first_pl, String second_pl) {
        this.first_pl = new Stack<>();
        this.second_pl = new Stack<>();
        for(int i = 4; i >= 0; i --){
            // так как используем Stack, вызываем функцию push
            this.first_pl.push(Integer.parseInt(first_pl.substring(i, i+1)));
            this.second_pl.push(Integer.parseInt(second_pl.substring(i, i+1)));
        }
    }

    // реализуем функцию pushback
    private void pushBack(Stack<Integer> stack, Integer item){
        Stack<Integer> newstack = new Stack<>();
        while (!stack.isEmpty()) {
            newstack.push(stack.pop());
        }
        stack.push(item);
        while (!newstack.isEmpty()) {
            stack.push(newstack.pop());
        }
    }

    public String play(){
        int moves = 0;
        while(!first_pl.isEmpty() && !second_pl.isEmpty() && moves <= 106){ // проверка на количество ходов
            if(first_pl.peek() > second_pl.peek() && second_pl.peek() != 0) { // возвращаем без удаления, для сравнения
                    pushBack(first_pl, first_pl.pop());
                    pushBack(first_pl, second_pl.pop());
            }
            else {
                pushBack(second_pl, first_pl.pop());
                pushBack(second_pl, second_pl.pop());
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
        System.out.println("Пьяница, используем Stack: ");
        System.out.println(new Game_ex1("13579", "24680").play());
        System.out.println(new Game_ex1("74980", "16235").play());
        System.out.println(new Game_ex1("13029", "42685").play());
    }

}
