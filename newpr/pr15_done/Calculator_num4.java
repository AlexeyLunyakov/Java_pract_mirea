package ru.mirea.newpr.pr15_done;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Stack;

public class Calculator_num4 extends JFrame {
    private JTextField text;

    Calculator_num4(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(400, 350);
        setLayout(null);
        text = new JTextField();
        text.setBounds(20, 70, 320, 20);
        JButton[] buttons = new JButton[16];
        JLabel label = new JLabel("Калькулятор");
        label.setBounds(150, 20, 150, 20);
        JLabel label2 = new JLabel("Введите ваши числа в поле ниже:");
        label2.setBounds(90, 45, 250, 20);

        buttons[0] = new JButton("1");
        buttons[1] = new JButton("2");
        buttons[2] = new JButton("3");
        buttons[3] = new JButton("/");

        buttons[4] = new JButton("4");
        buttons[5] = new JButton("5");
        buttons[6] = new JButton("6");
        buttons[7] = new JButton("*");

        buttons[8] = new JButton("7");
        buttons[9] = new JButton("8");
        buttons[10] = new JButton("9");
        buttons[11] = new JButton("-");

        buttons[12] = new JButton("0");
        buttons[13] = new JButton(".");
        buttons[14] = new JButton("=");
        buttons[15] = new JButton("+");

        for (JButton el: buttons){
            el.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (!Objects.equals(el.getText(), "=")){
                        if (!Objects.equals(el.getText(), "+") && !Objects.equals(el.getText(), "-") && !Objects.equals(el.getText(), "*") && !Objects.equals(el.getText(), "/"))
                            text.setText(text.getText() + el.getText());
                        else text.setText(text.getText() + " " + el.getText() + " ");
                    }
                    else {
                        String [] parse = text.getText().split(" ");

                        text.setText(String.valueOf(calc_btns(OPN(parse))));
                    }
                }
            });
        }
        for (int i = 0; i < 16; ++i){
            buttons[i].setBounds(40 + (i % 4) * 75, 110 + i / 4 * 40, 50, 30);
            add(buttons[i]);
        }
        add(label);
        add(label2);
        add(text);
        setVisible(true);
    }

    public double calc_btns(String[] tokens) {
        double a, b;
        Stack<Double> S = new Stack<Double>();
        for (String s : tokens) {
            switch (s) {
                case "+" -> S.add(S.pop() + S.pop());
                case "/" -> {
                    b = S.pop();
                    a = S.pop();
                    S.add(a / b);
                }
                case "*" -> S.add(S.pop() * S.pop());
                case "-" -> {
                    b = S.pop();
                    a = S.pop();
                    S.add(a - b);
                }
                default -> S.add(Double.parseDouble(s));
            }
        }
        return S.pop();
    }
    public int getPriority(String el){
        if (Objects.equals(el, "+") || Objects.equals(el, "-"))
            return 1;
        else return 2;
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public String[] OPN(String [] tokens){
        String rpn = "";
        Stack<String> stack = new Stack<>();
        for (String el :tokens){
            if (isNumeric(el))
                rpn += el + " ";
            else{
                if (!stack.isEmpty() && getPriority(el) <= getPriority(stack.peek())) {
                    rpn += stack.pop() + " ";
                }
                stack.push(el);
            }
        }
        while (!stack.isEmpty()) {
            rpn += stack.pop() + " ";
        }
        return rpn.split(" ");
    }

    public static void main(String [] args){
        new Calculator_num4();
    }
}
