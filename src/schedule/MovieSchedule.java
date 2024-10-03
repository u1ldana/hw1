package schedule;

public interface MovieSchedule extends Cloneable {
    MovieSchedule clone();
    void setMovie(movie.Movie movie);
}