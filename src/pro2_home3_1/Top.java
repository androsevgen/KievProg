package pro2_home3_1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

/**
 * 3. Написать код, который сериализирует и десериализирует в/из файла все значения полей класса, которые
 * отмечены аннотацией @Save.
 */

@WriteInFile(patch = "C:\\temp\\file.txt")
public class Top implements Serializable {


    @Save
    private String name;
    private int age;
    private String fild;

@Save
public void met(String path) throws IOException {
    FileWriter fileWriter = new FileWriter(path);
    fileWriter.write(name + ";" + age +";"+ fild);
    fileWriter.close();
}


    public Top() {
    }

    @Override
    public String toString() {
        return
                name + " " +
                 age + " "
                  +fild
                ;
    }

    public Top(String name, int age, String fild) {
        this.name = name;
        this.age = age;
        this.fild = fild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFild() {
        return fild;
    }

    public void setFild(String fild) {
        this.fild = fild;
    }
}
