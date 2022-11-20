package ru.mirea.newpr.pr16_done;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class num2 extends JFrame {

    num2(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(500, 200);
        setLayout(null);

        String [] colours = {"Черный", "Красный", "Синий"};
        String [] fonts = {"Times New Roman", "MS Sans Serif", "Courier New"};

        JTextArea text = new JTextArea();
        text.setBounds(220, 30, 200, 100);
        text.setBackground(Color.lightGray);
        text.setFont(new Font(fonts[0], Font.PLAIN, 14));

        JComboBox<String> menuColours = new JComboBox<>(colours);
        menuColours.setBounds(20, 45, 140, 20);

        JComboBox<String> menuFonts = new JComboBox<>(fonts);
        menuFonts.setBounds(20, 70, 140, 20);

        this.getContentPane().setBackground(Color.white);

        menuColours.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (menuColours.getSelectedItem() == "Синий")
                    text.setForeground(Color.BLUE);
                else if (menuColours.getSelectedItem() == "Красный")
                    text.setForeground(Color.RED);
                else text.setForeground(Color.BLACK);
            }
        });
        menuFonts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (menuFonts.getSelectedItem() == fonts[0])
                    text.setFont(new Font(fonts[0], Font.PLAIN, 14));
                else if (menuFonts.getSelectedItem() == fonts[1])
                    text.setFont(new Font(fonts[1], Font.PLAIN, 14));
                else if (menuFonts.getSelectedItem() == fonts[2])
                    text.setFont(new Font(fonts[2], Font.PLAIN, 14));
            }
        });
        add(menuColours);
        add(menuFonts);
        add(text);
        setVisible(true);
    }

    public static void main(String [] args) {
        new num2();
    }
}


