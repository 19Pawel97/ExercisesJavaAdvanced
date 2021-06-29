package JavaIO.exercise6;

import java.io.IOException;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        Movie movie = new Movie("GoldenEye", "Action", "Martin Campbell", 1996);
        Repo repo = new Repo();
        repo.add(movie);
        System.out.println(repo.getAll());
    }
}
