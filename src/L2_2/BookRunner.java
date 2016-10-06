package L2_2;


import java.util.ArrayList;
import java.util.List;

public class BookRunner {
    public static void main(String[] args) {
        List<Book> books = ssBooks();

        List<Book> booksfrom = BookUtils.findAuthor(books, "Rigina");
        System.out.println("Author = " + booksfrom);
        System.out.println();
        List<Book> booksfromPublisher = BookUtils.findPublisher(books, "Tomsk");
        System.out.println("Publisher = " + booksfromPublisher);
        System.out.println();
        List<Book> booksYear = BookUtils.findYear(books, 2030);
        System.out.println("Year =  " + booksYear);

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
                .setPublisher("Kozarovuchu")
                .setYear(2050)
                .setNumber(34)
                .setPrice(40)
                .setTypeofbinding("Machina"));

        book.add(new Book()
                .setId(4)
                .setName("Dota")
                .setAuthor("Polina")
                .setPublisher("Kiev")
                .setYear(2000)
                .setNumber(34)
                .setPrice(25)
                .setTypeofbinding("hand"));

        return book;
    }

}
