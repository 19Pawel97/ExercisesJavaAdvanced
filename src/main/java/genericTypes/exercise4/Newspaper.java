package genericTypes.exercise4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Newspaper extends Media {
    private String editor;

    public Newspaper(String title, String editor) {
        super(title);
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "title='" + title + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}
