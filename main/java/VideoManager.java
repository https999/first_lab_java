import java.util.ArrayList;
import java.util.List;

public class VideoManager {
    public static void main(String[] args) {
        List<Video> videos = new ArrayList<>();
        videos.add(new Film("The Shawshank Redemption", "Frank Darabont", 1994));
        videos.add(new Clip("Despacito", "Carlos Perez", 2017, "Despacito", "Luis Fonsi ft. Daddy Yankee", "Universal Music Latin"));
        videos.add(new Film("The Godfather", "Francis Ford Coppola", 1972));
        videos.add(new Clip("Shape of You", "Jason Koenig", 2017, "Shape of You", "Ed Sheeran", "Asylum Records"));
        videos.add(new Film("The Dark Knight", "Christopher Nolan", 2008));
        videos.add(new Clip("Baby Shark Dance", "Pinkfong", 2016, "Baby Shark Dance", "Pinkfong", "Smart Study Co."));

        for (Video video : videos) {
            System.out.println(video);
            System.out.println("Current rating: " + video.getCurrentRating());
            System.out.println();
        }
    }
}