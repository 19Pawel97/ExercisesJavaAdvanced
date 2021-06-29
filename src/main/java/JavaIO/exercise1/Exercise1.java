package JavaIO.exercise1;

import java.io.File;

public class Exercise1 {
    public static void main(String[] args) {
        String path = null; // path = any path on one's pc
        File file = new File(path);
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
