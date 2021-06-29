package JavaIO.exercise6;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repo {
    private final Parser parser = new Parser();
    private static URI path1; // URI from one's pc
    private final static Path PATH = Paths.get(path1);

    public void add(Movie movie) throws IOException {
        Files.write(PATH, Collections.singleton(Parser.toCSV(movie)), StandardOpenOption.APPEND);
    }

    public List<Movie> getAll() throws IOException {
        List<String> lines = Files.readAllLines(PATH);
        List<Movie> movies = new ArrayList<>();
        for (String line : lines) {
            Movie movie = Parser.fromCSV(line);
            movies.add(movie);
        }
        return movies;
    }
}
