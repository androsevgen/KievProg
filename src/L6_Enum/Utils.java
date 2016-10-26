package L6_Enum;


import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<Film> findGender(List<Film> films, Genre genre) {
        List<Film> fil = new ArrayList<>();
        for (Film film :
                films) {
            if (film.getGenre().equals(genre)) {
                fil.add(film);
            }
        }
        return fil;
    }

    public static List<Film> findYear(List<Film> films, long start, long stop) {
        List<Film> list = new ArrayList<>();
        for (Film film :
                films) {
            if (film.getYear() >= start && film.getYear() <= stop) {
                list.add(film);
            }
        }
        return list;
    }

}
