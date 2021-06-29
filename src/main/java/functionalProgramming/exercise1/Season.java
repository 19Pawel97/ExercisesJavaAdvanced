package functionalProgramming.exercise1;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@AllArgsConstructor
class Season {
    public String seasonName;
    public int seasonNumber;
    List<Episode> episodes;
}
