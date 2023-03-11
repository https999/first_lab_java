package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Film {
    private String title;
    private String director;
    private int year;
    private int rating;
    private int marks;
    private static Film defaultFilm = new Film();

    public static Film getInstance() {
        return defaultFilm;
    }

    public void rate() {
        if (rating < 1) {
            rating = 1;
        } else if (rating > 10) {
            rating = 10;
        }
        this.rating += rating;
        marks++;
    }

    public double getCurrentRating() {
        System.out.print("Середній рейтинг фільму: ");
        return (double) rating / marks;
    }

    public static void main(String[] args) {
        Film[] films = new Film[3];

        films[0] = new Film();
        films[1] = new Film("Бійцівський Клуб", "Девід Фінчер", 1999, 66, 8);
        films[2] = getInstance();

        films[1].rate();
        System.out.println(films[1].getCurrentRating());

        for (Film film:films){
            System.out.println(film.toString());
        }
    }

}