package OOP.exercise7;

import lombok.AllArgsConstructor;
import lombok.ToString;

import static java.lang.Math.PI;

@AllArgsConstructor
@ToString
public class Circle implements GeometricObject {
    protected double radius;

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }
}
