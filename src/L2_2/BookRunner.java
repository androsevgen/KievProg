package L2_2;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookRunner {
    public static void main(String[] args) {
        List<Book> books = ssBooks();

        List<Book> booksfrom = BookUtils.findByFaculty(books, "Rigina");
        System.out.println("booksfrom = " + booksfrom);
//        System.out.println(ssBooks());
//        System.out.println();
//        System.out.println(ssBooks().get(0).getName());

/*
        if (ssBooks().get(0).getId() == 2) {
            System.out.println(ssBooks().get(0));
        } else System.out.println("ERROR");
*/

/*
        if (ssBooks().get(0).getAuthor() == "Rigina") {
            System.out.println(ssBooks().get(0));
        } else System.out.println("ERROR");
*/

/*
        String catname = "";
        for (String item : catnamesList) {
            catname = catname + item + " ";
        }
        editResult.setText("Все коты: " + catname);
*/
/*
            String s = "";
        for (Book ss :
                ssBooks()) {
            s = s + ss;
        }
        if (ssBooks().get(0).getId() == 2) {
            System.out.println(ssBooks().get(0));
        } else System.out.println("ERROR");
*/

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
                .setAuthor("Polina")
                .setPublisher("Kiev")
                .setYear(2000)
                .setNumber(34)
                .setPrice(25)
                .setTypeofbinding("hand"));

        return book;
    }

}
