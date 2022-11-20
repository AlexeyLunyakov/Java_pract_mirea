package ru.mirea.newpr.pr15_done;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JFrame {
    final private JComboBox menu;
    private JLabel labelStart, labelChoose;

    Menu(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 100);
        setLayout(new FlowLayout());
        String [] stringMenu = {"Australia", "China", "England", "Russia"};
        menu = new JComboBox<>(stringMenu);
        menu.setBounds(80, 50, 140, 20);
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (menu.getSelectedItem() == "Australia")
                    labelChoose.setText(" officially the Commonwealth of Australia, is a sovereign country comprising the mainland of the Australian continent, the island of Tasmania, and numerous smaller islands");
                else if (menu.getSelectedItem() == "China")
                    labelChoose.setText(" officially the People's Republic of China, is a country in East Asia. It is the world's most populous country with a population exceeding 1.4 billion people");
                else if (menu.getSelectedItem() == "England")
                    labelChoose.setText(" is a country that is part of the United Kingdom. It shares land borders with Wales to its west and Scotland to its north");
                else labelChoose.setText(" country in Eastern Europe and Northern Asia. Russia is the largest state in the world, its territory within the constitutional boundaries is 17,125,191 km²");
            }
        });
        labelStart = new JLabel("Выберите страну: ");
        labelStart.setBounds(90, 100, 400, 100);
        labelChoose = new JLabel("Страна не выбрана");
        labelChoose.setBounds(90, 100, 400, 100);
        add(labelStart);
        add(menu);
        add(labelChoose);
        setVisible(true);
    }

    public static void main(String [] args){
        new Menu();
    }
}
