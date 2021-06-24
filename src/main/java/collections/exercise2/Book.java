package collections.exercise2;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Book {
    private String title;
    private double price;
    private int releaseDate;
    private List<Author> authors;
    private Genre genre;
}
