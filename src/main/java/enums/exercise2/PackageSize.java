package enums.exercise2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PackageSize {
    SMALL(1, 20, "S"),
    MEDIUM(21, 50, "M"),
    LARGE(51, 100,"L"),
    UNKNOWN((int) Math.random() * -10, (int) Math.random() + 100, "Unknown size");

    private int minSize;
    private int maxSize;
    private String name;

    public static PackageSize getPackageSize(int minSize, int maxSize) {
        if (minSize > 0 && maxSize < 21) {
            return PackageSize.SMALL;
        } else if (minSize > 20 && maxSize < 51) {
            return PackageSize.MEDIUM;
        } else if (minSize > 50 && maxSize < 101) {
            return PackageSize.LARGE;
        } else {
            System.out.println("There is no such size in our offer!");
            return UNKNOWN;
        }
    }
}
