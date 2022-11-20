package git.old_pr.pr1_done;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(2, "Желтый");
        Ball b2 = new Ball(4, "Зеленый");
        Ball b3 = new Ball();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println("Диаметр первого шара = " + b1.getDiameter());
        System.out.println("Диаметр второго шара = " + b2.getDiameter());

    }
}
