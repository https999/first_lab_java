import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VideoWriter {

    public void writeToFile(List<Video> videos) {
        PrintWriter out;
        try {
            File csvFile = new File("Video.csv");
            out = new PrintWriter(new FileWriter(csvFile));
            for (Video video : videos) {
                out.println(video.getHeaders());
                out.println(video.toCSV());
            }
            out.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
    public static void main(String[] args){
        List<Video> clips = new ArrayList<>();
        clips.add(new Film("The Shawshank Redemption", "Frank Darabont", 1994));
        clips.add(new Clip("Despacito", "Carlos Perez", 2017, "Despacito", "Luis Fonsi ft. Daddy Yankee", "Universal Music Latin"));
        clips.add(new Film("The Godfather", "Francis Ford Coppola", 1972));
        clips.add(new Clip("Shape of You", "Jason Koenig", 2017, "Shape of You", "Ed Sheeran", "Asylum Records"));
        clips.add(new Film("The Dark Knight", "Christopher Nolan", 2008));
        clips.add(new Clip("Baby Shark Dance", "Pinkfong", 2016, "Baby Shark Dance", "Pinkfong", "Smart Study Co."));
        VideoWriter clipWriter = new VideoWriter();

        clipWriter.writeToFile(clips);

    }
}




