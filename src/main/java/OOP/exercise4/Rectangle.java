package OOP.exercise4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle extends Shape {
    protected double length, width;

    public Rectangle() {
        color = "unknown";
        isFilled = false;
        length = 1;
        width = 1;
    }

    public Rectangle(String color, boolean isFilled, double length, double width) {
        super(color, isFilled);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width = %f and length = %f which is a subclass of %s", width, length, super.toString());
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }
}
