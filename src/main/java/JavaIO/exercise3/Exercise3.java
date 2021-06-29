package JavaIO.exercise3;

import java.io.*;

public class Exercise3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String line = "";
        try {
            String path = null; // file path on one's pc
            FileWriter fileWriter = new FileWriter(path, true);
            fileWriter.write("Something");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
