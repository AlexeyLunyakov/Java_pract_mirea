package git.old_pr.pr3_done;

public class Rectangle extends Shape {

    protected double width, length;

    public Rectangle() {
        super();
        length = 0;
        width = 0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String colour, boolean filled) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
           return "Shape: rectangle, width: " + this.width + ", length: " + this.length +
                ", colour: " + this.color + ", filled: " + this.filled;
    }
}
