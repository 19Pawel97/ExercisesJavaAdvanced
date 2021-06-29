package JavaIO.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        String path = null; // path from one's pc
        Parser parser = new Parser();
        Path path1 = Paths.get(path);
        List<User> users = new ArrayList<>();
        try {
            List<String> strings = Files.readAllLines(path1);
            for (String string : strings) {
                User user = Parser.fromCSV(string);
                users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(users);
    }
}
