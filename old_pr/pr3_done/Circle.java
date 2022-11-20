package git.old_pr.pr3_done;

public class Circle extends Shape {

    protected double radius;

    public Circle() {
        super();
        radius = 1;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: " + this.radius + ", colour: "
                + this.color + ", filled: " + this.filled;
    }


}
