package pro1_home2;


/*2. Написать класс TextContainer, который содержит в себе строку. С помощью механизма аннотаций указать
        1) в какой файл должен сохраниться текст 2) метод, который выполнит сохранение. Написать класс Saver,
        который сохранит поле класса TextContainer в указанный файл.
@SaveTo(path=“c:\\file.txt”)
class Container {
    String text = “…”;
    @Saver
    public void save(..) {…}
}*/

import java.io.FileWriter;
import java.io.IOException;


@SaveTo(path = "C:\\temp\\file.txt")
public class TextContainer {

    private String line = "Test Writer OK";


    @Saver
    public void save(String path) {
        try {

            FileWriter writer = new FileWriter(path);

            try {
                writer.write(line);
            } finally {
                writer.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


