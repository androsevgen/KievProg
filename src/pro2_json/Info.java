package pro2_json;

import java.util.Arrays;

/**
 * Created by admin on 18.12.2016.
 */
public class Info {
    private String name;
    private String surname;
    private Object[] phones;
    private Object[] sites;

    public Info() {
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phones=" + Arrays.toString(phones) +
                ", sites=" + Arrays.toString(sites) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Object[] getPhones() {
        return phones;
    }

    public void setPhones(Object[] phones) {
        this.phones = phones;
    }

    public Object[] getSites() {
        return sites;
    }

    public void setSites(Object[] sites) {
        this.sites = sites;
    }
}
