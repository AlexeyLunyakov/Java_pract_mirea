package ru.mirea.newpr.pr16_done.num1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessingGame extends JFrame {
    private int tmp_count = 3;
    GuessingGame(){
        Random rand = new Random();
        int ansNumber = rand.nextInt(15);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(500, 250);
        setLayout(new BorderLayout());

        JLabel labelTitle = new JLabel("16-ая практика", SwingConstants.CENTER);
        JLabel labelDown = new JLabel("16-ая практика", SwingConstants.CENTER);

        JLabel labelText = new JLabel("     Введите число:         ");

        JTextArea text = new JTextArea();

        JButton button = new JButton("  Проверить число  ");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tmp_count > 1){
                    if (Integer.parseInt(text.getText()) > ansNumber)
                        JOptionPane.showMessageDialog(null, "Загаданное число меньше","" , JOptionPane.WARNING_MESSAGE);
                    else if (Integer.parseInt(text.getText()) < ansNumber)
                        JOptionPane.showMessageDialog(null, "Загаданное число больше","" , JOptionPane.WARNING_MESSAGE);
                    else JOptionPane.showMessageDialog(null, "Вы угадали число","Winner!" , JOptionPane.WARNING_MESSAGE);
                    tmp_count--;
                }
                else JOptionPane.showMessageDialog(null, "Попытки кончились. Загаданное число: " + ansNumber,"" , JOptionPane.WARNING_MESSAGE);
            }
        });
        labelTitle.addMouseListener(new MyMouse("ЦАО", this));
        labelText.addMouseListener(new MyMouse("ЗАО", this));
        text.addMouseListener(new MyMouse("ЮАО", this));
        button.addMouseListener(new MyMouse("САО", this));
        labelDown.addMouseListener(new MyMouse("ВАО", this));
        add(labelTitle, BorderLayout.NORTH);
        add(labelText, BorderLayout.WEST);
        add(text, BorderLayout.CENTER);
        add(button, BorderLayout.EAST);
        add(labelDown, BorderLayout.SOUTH);
        setVisible(true);
    }


    public static void main(String [] args){
        new GuessingGame();
    }
}
