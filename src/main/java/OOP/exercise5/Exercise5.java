package OOP.exercise5;

import OOP.exercise1.Point2D;

public class Exercise5 {
    public static void main(String[] args) {
        Point2D point2Do = new Point2D(10,10);
        Point2D point2Dk = new Point2D(20,20);
        Line line = new Line(point2Do, point2Dk);

        Line line1 = new Line(10, 20, 30, 40);

        System.out.println(line.getLength());
        System.out.println(line.getMidpoint());
        System.out.println(line1.getLength());
        System.out.println(line1.getMidpoint());
    }
}
