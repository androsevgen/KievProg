package L2_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookUtils {
    private BookUtils() {

    }

    public static List<Book> findAuthor(List<Book> books, String Author) {
        Args.notNull(books, "Author");

        List<Book> results = new ArrayList<>();
        for (Book student : books) {
            if (Objects.equals(student.getAuthor(), Author)) {
                results.add(student);
            }
        }
        return results;
    }


    public static List<Book> findPublisher(List<Book> books, String Publisher) {
        Args.notNull(books, "Publisher");

        List<Book> results = new ArrayList<>();
        for (Book student : books) {
            if (Objects.equals(student.getPublisher(), Publisher)) {
                results.add(student);
            }
        }
        return results;
    }

    public static List<Book> findYear(List<Book> books, int year) {
        Args.notNull(books, "year");

        List<Book> results = new ArrayList<>();
        for (Book student : books) {
            if (student.getYear() >= year) {
                results.add(student);
            }
        }
        return results;
    }

}
