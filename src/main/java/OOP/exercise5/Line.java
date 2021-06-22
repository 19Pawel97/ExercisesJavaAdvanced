package OOP.exercise5;

import OOP.exercise1.Point2D;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Line {
    private Point2D point2Do, point2Dk;

    public Line(float point2Dox, float point2Doy, float point2Dkx, float point2Dky) {
        point2Do = new Point2D(point2Dox, point2Doy);
        point2Dk = new Point2D(point2Dkx, point2Dky);
    }

    public float getLength() {
        return (float) Math.sqrt((Math.pow(point2Dk.getX() - point2Do.getX(), 2) + Math.pow(point2Dk.getY() - point2Do.getY(), 2)));
    }

    public Point2D getMidpoint() {
        return new Point2D((point2Dk.getX() + point2Do.getX()) / 2,(point2Dk.getY() + point2Do.getY()) / 2);
    }
}
