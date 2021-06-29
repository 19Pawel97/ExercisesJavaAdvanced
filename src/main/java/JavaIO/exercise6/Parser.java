package JavaIO.exercise6;

public class Parser {
    private static final String SEPARATOR = ",";

    public static Movie fromCSV(String line) {
        String[] data = line.split(SEPARATOR);
        return new Movie(data[0], data[1], data[2], Integer.parseInt(data[3]));
    }

    public static String toCSV(Movie movie) {
        return new StringBuilder().append(movie.getTitle())
                .append(SEPARATOR)
                .append(movie.getGenre())
                .append(SEPARATOR)
                .append(movie.getDirector())
                .append(SEPARATOR)
                .append(movie.getReleaseYear())
                .append("\n")
                .toString();
    }
}
