package OOP.exercise7;

public class Exercise7 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        System.out.println(circle);

        ResizableCircle resizableCircle = new ResizableCircle(100d);
        resizableCircle.resize(8f);
        System.out.println(resizableCircle);
    }
}
