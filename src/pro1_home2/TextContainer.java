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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


@SaveTo(path = "c:\\file.txt")
public class TextContainer {

    private String line = "Test";


    @Saver
    public void save(String path) {
        try {

            FileWriter writer = new FileWriter(path);
 /*           File file = new File("C:\\w\\");
            file.mkdirs();*/

           try{
            writer.write(line);
           } finally {
               writer.close();
               writer.flush();
           }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


