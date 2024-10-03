package schedule;

import movie.Movie;
import schedule.MovieSchedule;

public class StandardSchedule implements MovieSchedule {
    private Movie movie;
    private String time;

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public MovieSchedule clone() {
        try {
            return (MovieSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}