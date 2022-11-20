package ru.mirea.newpr.pr16_done;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class num3 extends JFrame {
    JLabel service_lbl, user_name_lbl, passwd_lbl;
    JTextArea service_txt, user_name_txt, passwd_txt;
    num3(){
        setTitle("Password application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(500, 220);
        setLayout(null);
        Border brdr = BorderFactory.createLineBorder(Color.BLACK, 1);

        service_lbl = new JLabel("Service:");
        service_lbl.setBounds(50, 20, 100, 20);

        user_name_lbl = new JLabel("User name:");
        user_name_lbl.setBounds(50, 50, 100, 20);

        passwd_lbl = new JLabel("Password:");
        passwd_lbl.setBounds(50, 80, 100, 20);

        service_txt = new JTextArea();
        service_txt.setBounds(120, 20, 300, 20);
        service_txt.setBorder(brdr);

        user_name_txt = new JTextArea();
        user_name_txt.setBounds(120, 50, 300, 20);
        user_name_txt.setBorder(brdr);

        passwd_txt = new JTextArea();
        passwd_txt.setBounds(120, 80, 300, 20);
        passwd_txt.setBorder(brdr);

        add(service_txt);
        add(service_lbl);
        add(user_name_lbl);
        add(user_name_txt);
        add(passwd_lbl);
        add(passwd_txt);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                titleAlign();
            }
        });
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void titleAlign() {

        Font font = getFont();

        String currentTitle = getTitle().trim();
        FontMetrics tmp_fm = getFontMetrics(font);
        int frameWidth = getWidth();
        int titleWidth = tmp_fm.stringWidth(currentTitle);
        int spaceWidth = tmp_fm.stringWidth(" ");
        int centerPos = (frameWidth / 2) - (titleWidth / 2);
        int spaceCount = centerPos / spaceWidth;
        String pad = "";
        pad = String.format("%" + (spaceCount - 14) + "s", pad);
        setTitle(pad + currentTitle);
    }

    public static void main(String [] args){
        new num3();
    }
}
