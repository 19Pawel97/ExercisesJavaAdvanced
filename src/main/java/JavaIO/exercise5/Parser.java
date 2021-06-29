package JavaIO.exercise5;

public class Parser {
    public static User fromCSV(String csvLine) {
        String[] data = csvLine.split(",");
        return new User(data[0], data[1],Integer.parseInt(data[2]));
    }
}
