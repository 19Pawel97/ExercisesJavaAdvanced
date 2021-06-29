package genericTypes.exercise4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book extends Media{
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
