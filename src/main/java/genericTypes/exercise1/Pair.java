package genericTypes.exercise1;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Pair <K, V> {
    private K key;
    private V value;
}
