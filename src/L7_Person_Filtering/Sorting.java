package L7_Person_Filtering;

import java.util.ArrayList;
import java.util.List;

public class Sorting {
    private List<Person> persons = new ArrayList<>();

    @Override
    public String toString() {
        return "Sorting{" +
                "persons=" + persons +
                '}';
    }

    public Sorting(List<Person> persons) {
        this.persons = persons;
    }

    public Sorting() {

    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;

    }

    public void setPersons(Person name) {
        persons.add(name);
    }

    public void setPersonsAge(Person age) {
        persons.add(age);
    }
}
