package genericTypes.exercise5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class House<T extends Animal> {
    List<T> animals;
}
