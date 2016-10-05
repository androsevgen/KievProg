package L2_2;


import java.util.ArrayList;
import java.util.List;

public class BookRunner {
    public static void main(String[] args) {

    }

    public static List<Book> ssBooks() {
        List<Book> book = new ArrayList<>();

        book.add(new Book()
                .setId(2)
                .setName("Roza")
                .setAuthor("Rigina")
                .setPublisher("Tomsk")
                .setYear(1998)
                .setNumber(6000)
                .setPrice(266)
                .setTypeofbinding("Machina"));

        book.add(new Book()
                .setId(3)
                .setName("Pola")
                .setAuthor("Rigina")
                .setPublisher("Tomsk")
                .setYear(2000)
                .setNumber(34)
                .setPrice(40)
                .setTypeofbinding("Machina"));

        book.add(new Book()
                .setId(4)
                .setName("Dota")
                .setAuthor("Rigina")
                .setPublisher("Kiev")
                .setYear(2000)
                .setNumber(34)
                .setPrice(25)
                .setTypeofbinding("hand"));

        return book;
    }
}
