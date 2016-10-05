package L2_2;

public class Runner {
    public static void main(String[] args) {
        Book book = new Book()
                .setId(1)
                .setName("Tom")
                .setAuthor("Tomson")
                .setPublisher("JSP")
                .setYear(2000)
                .setNumber(23)
                .setPrice(50)
                .setTypeofbinding("Nutka");

        String s = book.toString();
        System.out.println(s);
        BookRunner bookRunner = new BookRunner();
        System.out.println(bookRunner.ssBooks());

    }
}
