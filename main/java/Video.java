import lombok.Getter;
import lombok.ToString;
@Getter
@ToString
public abstract class Video {
    protected String title;
    protected String director;
    protected int year;

    public abstract double getCurrentRating();

    public Video(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public String getHeaders() {
        return "title, director, year";
    }

    public String toCSV() {
        return title + "," +
                director + "," +
                year;
    }
}
