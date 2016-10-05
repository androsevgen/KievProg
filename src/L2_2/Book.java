package L2_2;

import java.util.Objects;

public class Book {

    private int id;
    private String name;
    private String Author;
    private String Publisher;
    private int Year;
    private int number;
    private double price;
    private String typeofbinding;

    public Book() {
    }

    public int getId() {
        return id;
    }

    public Book setId(int id) {
        this.id = id;

        return this;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public String getAuthor() {
        return Author;
    }

    public Book setAuthor(String author) {
        Author = author;
        return this;
    }

    public String getPublisher() {
        return Publisher;
    }

    public Book setPublisher(String publisher) {
        Publisher = publisher;
        return this;
    }

    public int getYear() {
        return Year;
    }

    public Book setYear(int year) {
        Year = year;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Book setNumber(int number) {
        this.number = number;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Book setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getTypeofbinding() {
        return typeofbinding;
    }

    public Book setTypeofbinding(String typeofbinding) {
        this.typeofbinding = typeofbinding;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book book = (Book) obj;
        return Objects.equals(id , book.id) &&
                Objects.equals(name, book.name) &&
                Objects.equals(Author, book.Author) &&
                Objects.equals(Publisher, book.Publisher) &&
                Objects.equals(Year, book.Year) &&
                Objects.equals(number, book.number) &&
                Objects.equals(price, book.price) &&
                Objects.equals(typeofbinding, book.typeofbinding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name, Author,Publisher, Year, number, price, typeofbinding);
    }

    @Override
    public String toString() {
        return " id" + id
                +" name: " + name
                +" Author: " +Author
                +" Publisher: " + Publisher
                +" Year: " + Year
                +" number: "+ number
                +" price: " +price
                +" typeofbinding: " + typeofbinding;
    }
}
