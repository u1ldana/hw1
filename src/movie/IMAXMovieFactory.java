package movie;

import movie.IMAXMovie;

public class IMAXMovieFactory extends MovieFactory {
    @Override
    public Movie createMovie(String title) {
        return new IMAXMovie(title);  // Creates an IMAX Movie
    }
}