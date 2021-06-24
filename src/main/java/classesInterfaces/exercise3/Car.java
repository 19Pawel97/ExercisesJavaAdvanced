package classesInterfaces.exercise3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
    String name, type;
    Engine engine;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
        engine = new Car.Engine();
        engine.setEngine(type);
    }

    @ToString
    class Engine {
        String engineType;

        public void setEngine(String type) {
            if (type.equals("economy")) {
                engineType = "diesel";
            } else if (type.equals("luxury")) {
                engineType = "electric";
            } else {
                engineType = "petrol";
            }
        }
    }
}
