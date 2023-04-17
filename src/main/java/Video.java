import lombok.ToString;

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

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }
}




