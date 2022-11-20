package ru.mirea.newpr.pr15_done;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    JTextField jta1 = new JTextField(15);
    JTextField jta2 = new JTextField(15);
    JButton plus_btn = new JButton(" Add them up");
    JButton min_btn = new JButton(" Subtract them up");
    JButton multi_btn = new JButton(" Multiply them up");
    JButton div_btn = new JButton(" Divide them up");

    Font fnt = new Font("Times new roman",Font.BOLD,24);
    Calculator(){
        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        setSize(300,300);

        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);

        add(plus_btn);
        add(min_btn);
        add(multi_btn);
        add(div_btn);
        plus_btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!",
                            "alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        min_btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!",
                            "alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        multi_btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!",
                            "alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        div_btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2),
                            "Alert",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog( null, "Error in Numbers!",
                            "alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[]args){
        new Calculator();
    }
}
