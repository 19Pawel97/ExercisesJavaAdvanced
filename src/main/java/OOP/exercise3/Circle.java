package OOP.exercise3;

import lombok.Getter;
import lombok.Setter;

import static java.lang.Math.PI;

@Getter
@Setter
public class Circle extends Shape {
    private double radius;

    public Circle() {
        color = "unknown";
        isFilled = false;
        radius = 1;
    }

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius = %f which is a subclass of %s", radius, super.toString());
    }
}
