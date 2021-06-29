package JavaIO.exercise6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Movie {
    private String title, genre, director;
    private int releaseYear;
}
