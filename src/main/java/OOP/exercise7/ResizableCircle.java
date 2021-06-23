package OOP.exercise7;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(float percentage) {
        if (percentage < 100) {
            radius = radius * (1 + (percentage / 100));
        } else {
            radius = radius * (percentage / 100);
        }
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }
}
