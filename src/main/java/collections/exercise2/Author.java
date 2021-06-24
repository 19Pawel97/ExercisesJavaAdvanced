package collections.exercise2;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Author {
    private String name;
    private String Surname;
    private Gender gender;
}
