package genericTypes.exercise5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat extends Animal{
    private int theLengthOfTail;

    public Cat(String name, int theLengthOfTail) {
        super(name);
        this.theLengthOfTail = theLengthOfTail;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", theLengthOfTail=" + theLengthOfTail +
                '}';
    }
}
