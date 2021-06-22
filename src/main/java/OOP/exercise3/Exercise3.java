package OOP.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        Shape shape = new Shape("white", true);
        System.out.println(shape);
        System.out.println(shape.getColor());
        System.out.println(shape.isFilled);

        Shape circle = new Circle("green", true, 22);
        System.out.println(circle);
        System.out.println(((Circle) circle).getRadius());
        System.out.println(((Circle) circle).getArea());
        System.out.println(((Circle) circle).getPerimeter());

        Shape rectangle = new Rectangle("blue", true, 2.3, 3.2);
        System.out.println(rectangle);
        System.out.println(((Rectangle) rectangle).getLength());
        System.out.println(((Rectangle) rectangle).getWidth());
        System.out.println(((Rectangle) rectangle).getArea());
        System.out.println(((Rectangle) rectangle).getPerimeter());

        Shape square = new Square("black", false, 88.8);
        System.out.println(square);
        System.out.println(rectangle);
        System.out.println(((Square) square).getLength());
        System.out.println(((Square) square).getWidth());
        System.out.println(((Square) square).getArea());
        System.out.println(((Square) square).getPerimeter());
    }
}
