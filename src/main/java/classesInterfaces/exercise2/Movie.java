package classesInterfaces.exercise2;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Movie {
    private String title, director, releaseDate, genre, producer;

    static class MovieCreator {
        private String title, director, releaseDate, genre, producer;

        public MovieCreator setTitle(String title) {
            this.title = title;
            return this;
        }

        public MovieCreator setDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieCreator setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
             return this;
        }

        public MovieCreator setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public MovieCreator setProducer(String producer) {
            this.producer = producer;
            return this;
        }

        public Movie createMovie() {
            Movie movie = new Movie(title, director, releaseDate, genre, producer);
            return movie;
        }
    }
}
