package functionalProgramming.exercise1;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@AllArgsConstructor
public class Video {
    public String title;
    public String url;
    public VideoType videoType;
}
