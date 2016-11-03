package L7_Comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparing {
    private List<String> names = new ArrayList<>();

    public Comparing(List<String> names) {
        this.names = names;
    }

    public Comparing() {
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }


    @Override
    public String toString() {
        return "Comparing{" +
                "names=" + names +
                '}';
    }

    public void sortAlfavit() {
        Collections.sort(names);
        System.out.println("Отсортировать имена в алфавитном порядке: " + names);
    }

    public void sortAlfavitREVERS() {
        names.sort(Collections.reverseOrder());
        System.out.println("Отсортировать имена в алфавитном порядке по убыванию: " + names);
    }

    public void sort3() {
        System.out.println("Найти наименьшее имя в алфавитном порядке: " + Collections.min(names));
    }

    public void sort4() {
        Collections.sort(names, new Sort());
        System.out.println("Отсортировать имена по количеству букв: " + names);
    }


}
