package genericTypes.exercise4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Library<T extends Media> {
    private List<T> elements;
}
