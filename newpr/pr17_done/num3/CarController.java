package ru.mirea.newpr.pr17_done.num3;

import javax.swing.*;

public class CarController {
    private Car model;
    private CarView view;

    CarController(Car model, CarView view){
        this.model = model;
        this.view = view;
        initView();
    }

    private void initView(){
        view.getTextName().setText(model.getName());
        view.getTextSpeed().setText(String.valueOf(model.getSpeed()));
        view.getTextDisplacement().setText(String.valueOf(model.getSpaceDisplacement()));
    }

    public void initController(){
        view.getButtonName().addActionListener(e -> setCarName());
        view.getButtonSpeed().addActionListener(e -> setCarSpeed());
        view.getButtonDisplacement().addActionListener(e -> setCarDamage());
        view.getButtonShow().addActionListener(e -> printDetails());
    }

    public void setCarName(){
        model.setName(view.getTextName().getText());
        JOptionPane.showMessageDialog(null, "Имя авто сохранено","", JOptionPane.INFORMATION_MESSAGE);
    }
    public void setCarSpeed(){
        model.setSpeed(Integer.parseInt(view.getTextSpeed().getText()));
        JOptionPane.showMessageDialog(null, "Максимальная скорость авто сохранена","", JOptionPane.INFORMATION_MESSAGE);
    }
    public void setCarDamage(){
        model.CarDamage(Integer.parseInt(view.getTextDisplacement().getText()));
        JOptionPane.showMessageDialog(null, "Урон полученный авто сохранен","", JOptionPane.INFORMATION_MESSAGE);
    }

    public void printDetails(){
        JOptionPane.showMessageDialog(null,
                "Машина: " + model.getName() + ", Максимальная скорость: " + model.getSpeed() + ", Полученный урон: " + model.getSpaceDisplacement(),"", JOptionPane.INFORMATION_MESSAGE);
    }
}
