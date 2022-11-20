package git.old_pr.pr3_done;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String colour, boolean filled){
        super(side, side, colour, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side){
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(length);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "Shape: square, width: " + this.width + ", length: " + this.length +
                ", colour: " + this.color + ", filled: " + this.filled;

    }

}
