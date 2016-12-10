package pro_2_1;

import java.util.Arrays;

public class Person {
    private String name;
    private String surname;
    private String[] phones;
    private Address address;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String[] getPhones() {
        return phones;
    }

    public Address getAddress() {
        return address;
    }
}
