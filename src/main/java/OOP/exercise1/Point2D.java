package OOP.exercise1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Point2D {
    protected float x, y;

    public float[] getXY() {
        float[] coordinates = new float[]{this.x, this.y};
        return coordinates;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%f,%f)", x, y);
    }
}
