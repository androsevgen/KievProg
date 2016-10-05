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
       /* book.setId(1);
        book.setName("Name1");
        book.setAuthor("Popov");
        book.setPublisher("Sokol");
        book.setYear(2000);
        book.setNumber(200);
        book.setPrice(20);
        book.setTypeofbinding("Stroka");*/
        String s = book.toString();
        System.out.println(s);
    }
}
