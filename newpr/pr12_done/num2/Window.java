package ru.mirea.newpr.pr12_done.num2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Window extends JFrame {
    private final JLabel event;
    private final JLabel picture;
    private final JTextField text;
    private JPanel shapePanel;
    Window(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,500);
        setLayout(null);

        JButton button = new JButton("Enter");
        button.setBounds(435,50,70, 30);

        JLabel input = new JLabel();
        input.setText("JPG path: ");
        input.setBounds(60, 10, 150, 100);
        text = new JTextField();
        text.setBounds(210, 50, 200, 30);

        event = new JLabel();
        event.setBounds(10, 140, 600, 100);

        picture = new JLabel();
        picture.setBounds(100, 150, 500, 300);

        add(event);
        add(text);
        add(input);
        add(button);
        add(picture);
        setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                File exsts = new File(text.getText());
                ImageIcon icon = new ImageIcon(exsts.getPath());
                Image img = icon.getImage();

                Image imgScale = img.getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon res_img = new ImageIcon(imgScale);
                picture.setIcon(res_img);
                if (exsts.exists())
                    event.setText("Your JPG: ");
                else
                    event.setText("Error! No such path or directory!");
            }
        });
    }

}
