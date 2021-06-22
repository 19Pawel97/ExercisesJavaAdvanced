package OOP.exercise3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Shape {
    protected String color;
    protected boolean isFilled;

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    @Override
    public String toString() {
        String filling = (isFilled) ? "filled" : "not filled";
        return String.format("Shape with color of %s and " + filling, color);
    }
}
