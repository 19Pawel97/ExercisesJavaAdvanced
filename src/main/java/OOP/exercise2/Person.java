package OOP.exercise2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Person {
    protected String name, address;

    @Override
    public String toString() {
        return String.format("%s,%s", name, address);
    }
}
