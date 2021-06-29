package functionalProgramming.exercise1;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@AllArgsConstructor
class Episode {
    public String episodeName;
    public int episodeNumber;
    List<Video> videos;
}
