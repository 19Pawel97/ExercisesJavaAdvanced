package Exceptions.exercise2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {
    private String isbn;
    private String title;
    private String author;
    private Date publishingDate;
}
