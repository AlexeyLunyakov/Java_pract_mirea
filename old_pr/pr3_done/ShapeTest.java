package git.old_pr.pr3_done;

public class ShapeTest {
    public static void main(String[] args) {
        // Из Circle наверх в Shape (Upcast Circle to Shape)
        Shape s1 = new Circle(5.5, "RED", false);

        // Возвращает методы Circle, определенные в Shape

        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius());   // Нет в классе Shape

        //System.out.println();

        // Понижающее приведение обратно в класс Circle (Downcast back to Circle)
        Circle c1 = (Circle)s1;

        // Возврат методов только класса Circle

        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());


        System.out.println();
        //Shape s2 = new Shape();   // Должен быть абстрактный

        // Повышение до Shape из Rectangle
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        // Возвращает методы Rectangle, определенные в Shape
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); // Не определен в классе Shape

        System.out.println();

        // Понижение в Rectangle
        Rectangle r1 = (Rectangle)s3;
        // Возврат методов только Rectangle
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        System.out.println();

        // Повышение до Shape из Square
        Shape s4 = new Square(6.6);
        // Возврат методов Square, определенных в Shape
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());  // Не определен в классе Rectangle

        System.out.println();

        // Как пишут в методичке, мы приводим тип Shape s4 понижением в Rectangle,
        //  который является надклассом Square, а не самим классом Square
        Rectangle r2 = (Rectangle)s4;
        // Возвращает методы Square, определенные в Rectangle
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());  // Не определен в Rectangle
        System.out.println(r2.getLength());

        System.out.println();

        // Понижение r2 класса Rectangle в класс Square
        Square sq1 = (Square)r2;
        // Возвраты методов Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }
}
