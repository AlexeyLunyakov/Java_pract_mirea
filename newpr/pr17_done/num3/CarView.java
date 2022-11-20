package ru.mirea.newpr.pr17_done.num3;

import javax.swing.*;
import java.awt.*;

public class CarView extends JFrame {

    private TextField textName;
    private TextField textSpeed;
    private TextField textDisplacement;
    private JButton buttonName;
    private JButton buttonSpeed;
    private JButton buttonDisplacement;

    private JButton buttonShow;
    CarView(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(550, 220);
        setLayout(null);

        setTitle("        ЗАДАЙТЕ ПАРАМЕТРЫ ВАШЕГО АВТОМТОБИЛЯ!");

        JLabel CarName = new JLabel("Введите имя: ");
        CarName.setBounds(20, 20, 120, 20);
        setTextName(new TextField());
        getTextName().setBounds(260, 20, 100, 20);

        JLabel speed = new JLabel("Введите максимальную скорость: ");
        speed.setBounds(20, 50, 240, 20);
        setTextSpeed(new TextField());
        getTextSpeed().setBounds(260, 50, 100, 20);

        JLabel CarDamage = new JLabel("Введите полученный урон:");
        CarDamage.setBounds(20, 80, 160, 20);
        setTextDisplacement(new TextField());
        getTextDisplacement().setBounds(260, 80, 100, 20);

        setButtonName(new JButton("Сохранить"));
        getButtonName().setBounds(400, 18, 100, 24);

        setButtonSpeed(new JButton("Сохранить"));
        getButtonSpeed().setBounds(400, 48, 100, 24);

        setButtonDisplacement(new JButton("Сохранить"));
        getButtonDisplacement().setBounds(400, 78, 100, 24);

        setButtonShow(new JButton("Показать параметры машины"));
        getButtonShow().setBounds(150, 130, 250, 30);

        setLocationRelativeTo(null);

        add(CarName);
        add(speed);
        add(CarDamage);
        add(getTextName());
        add(getTextSpeed());
        add(getTextDisplacement());
        add(getButtonName());
        add(getButtonSpeed());
        add(getButtonDisplacement());
        add(getButtonShow());
        setVisible(true);
    }

    public TextField getTextName() {
        return textName;
    }

    public void setTextName(TextField textName) {
        this.textName = textName;
    }

    public TextField getTextSpeed() {
        return textSpeed;
    }

    public void setTextSpeed(TextField textSpeed) {
        this.textSpeed = textSpeed;
    }

    public TextField getTextDisplacement() {
        return textDisplacement;
    }

    public void setTextDisplacement(TextField textDisplacement) {
        this.textDisplacement = textDisplacement;
    }

    public JButton getButtonName() {
        return buttonName;
    }

    public void setButtonName(JButton buttonName) {
        this.buttonName = buttonName;
    }

    public JButton getButtonSpeed() {
        return buttonSpeed;
    }

    public void setButtonSpeed(JButton buttonSpeed) {
        this.buttonSpeed = buttonSpeed;
    }

    public JButton getButtonDisplacement() {
        return buttonDisplacement;
    }

    public void setButtonDisplacement(JButton buttonDisplacement) {
        this.buttonDisplacement = buttonDisplacement;
    }

    public JButton getButtonShow() {
        return buttonShow;
    }

    public void setButtonShow(JButton buttonShow){
        this.buttonShow = buttonShow;
    }
}
