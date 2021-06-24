package classesInterfaces.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Movie movie = new Movie.MovieCreator()
                .setTitle("No Time To Die")
                .setDirector("Cary Fukunaga")
                .setGenre("Action")
                .setReleaseDate("2021")
                .setProducer("Eon Production")
                .createMovie();
        System.out.println(movie);
    }
}
