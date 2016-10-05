package L2_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookUtils {
    private BookUtils() {

    }

    public static List<Book> findByFaculty(List<Book> books, String Author) {
        Args.notNull(books, "Author");

        List<Book> results = new ArrayList<>();
        for (Book student : books) {
            if (Objects.equals(student.getAuthor(), Author)) {
                results.add(student);
            }
        }
        return results;
    }
}
