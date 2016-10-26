package L6_Enum;

import java.util.ArrayList;

public class Film {

    private String name;
    private int year;
    private ArrayList<String> actors = new ArrayList<>();
    private Genre genre;

    public Film() {
    }

    public Film(String name, int year, Genre genre) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }
    public Film addActors(String ac){
        actors.add(ac);
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", actors=" + actors +
                ", genre=" + genre +
                '}';
    }
}
