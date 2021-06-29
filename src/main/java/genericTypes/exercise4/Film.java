package genericTypes.exercise4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Film extends Media {
    private String director;

    public Film(String title, String director) {
        super(title);
        this.director = director;
    }

    @Override
    public String toString() {
        return "Film{" +
                "director='" + director + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
