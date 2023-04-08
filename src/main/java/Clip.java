import lombok.ToString;

@ToString(callSuper = true)
public class Clip extends Video {
    private String songTitle;
    private String artist;
    private String label;
    private int likes;
    private int views;

    public Clip(String title, String director, int year, String songTitle, String artist, String label) {
        super(title, director, year);
        this.songTitle = songTitle;
        this.artist = artist;
        this.label = label;
        this.likes = 0;
        this.views = 0;
    }

    public void like() {
        likes++;
    }

    public void view() {
        views++;
    }

    public double getCurrentRating() {
        return (double) likes / views;
    }
}
