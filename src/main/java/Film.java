import lombok.ToString;

@ToString(callSuper = true)
public class Film extends Video {
    private int marks;
    private double rating;

    public Film(String title, String director, int year) {
        super(title, director, year);
        this.marks = 0;
        this.rating = 0;
    }

    public void rate(int mark) {
        if (mark > 10) {
            mark = 10;
        } else if (mark < 1) {
            mark = 1;
        }
        rating = (rating * marks + mark) / (double) (marks + 1);
        marks++;
    }

    public double getCurrentRating() {
        return rating;
    }
}
