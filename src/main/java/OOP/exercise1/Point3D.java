package OOP.exercise1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] coordinates = new float[]{x, y, z};
        return coordinates;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("(%f,%f,%f)", x, y, z);
    }
}
