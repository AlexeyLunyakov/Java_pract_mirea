package ru.mirea.newpr.pr7_done.num4;

import static java.lang.Math.*;

public class MathFunc implements MathCalculable{
    private double x, y, phi;
    MathFunc(double new_x, double new_y){
        x = new_x;
        y = new_y;
        phi = atan2(y, x);
    }

    public void set_x(double x) {
        this.x = x;
    }
    public void set_y(double y) {
        this.y = y;
    }

    @Override
    public double absComplex() {
        return sqrt(x*x + y*y);
    }

    @Override
    public void powComplex(int k) {
        double absValue = pow(absComplex(), k);
        double first = cos(k*phi);
        double second = sin(k*phi);
        set_x(absValue*first);
        set_y(absValue*second);
    }

    @Override
    public String toString() {
        if (y > 0)
            return "Комплексное число: " + x + " + " + y + "i";
        else if (y < 0)
            return "Комплексное число: " + x + " " + y + "i";
        else return "Комплексное число: " + x;
    }
}
