package ru.mirea.newpr.pr15_done;

import javax.swing.*;
import java.awt.*;

public class Menu_num3 extends JFrame {
    Menu_num3() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(250, 100);
            };
        };

        String [] strFiles = {"Сохранить", "Правка", "Выйти  Alt+F4"};
        String [] strEdit = {"Вырезать", "Вставить", "Копировать"};
        String [] strHelp = {"Справка"};

        JMenu file = createJMenu(strFiles, "File");
        JMenu edit = createJMenu(strEdit, "Edit");
        JMenu help = createJMenu(strHelp, "Help");
        JMenuBar fullMenu = new JMenuBar();

        fullMenu.add(file);
        fullMenu.add(edit);
        fullMenu.add(help);
        setJMenuBar(fullMenu);

        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton button1 = new JButton("BTN 1");
        JButton button2 = new JButton("BTN 2");

        JTextArea text = new JTextArea("This is the area you can write text");
        text.setBounds(500, 15, 100, 100);

        panel.add(button1);
        panel.add(button2);
        panel.add(text);
        add(panel);
        pack();
        setVisible(true);
    }

    private JMenu createJMenu(String [] items, String name){
        JMenu ans = new JMenu(name);
        for (String item : items) ans.add(new JMenuItem(item));
        return ans;
    }

    public static void main(String [] args){
        new Menu_num3();
    }
}
