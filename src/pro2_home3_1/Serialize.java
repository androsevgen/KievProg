package pro2_home3_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by admin on 15.12.2016.
 */
public class Serialize {


    public static String serA(Object o) throws IllegalAccessException {

        Top top = new Top("Test", 12, "Lara");
        Class<?> aClass = top.getClass();

        Field[] fields = aClass.getDeclaredFields();

        for (Field field :
                fields) {
            if (!field.isAnnotationPresent(Save.class))
                continue;
            if (Modifier.isPrivate(field.getModifiers()))
                field.setAccessible(true);

            if (field.getType() == int.class)
                field.getInt(o);
            else if (field.getType() == String.class)
                field.get(o);

        }
        return top.toString();
    }

    public void ser() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.dat"))) {
            Top p = new Top("Test", 12, "Lara");
            oos.writeObject(p);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }

    public void dez() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.dat"))) {
            Top p = (Top) ois.readObject();
            System.out.print(p.getName() + p.getAge() + p.getFild());
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}

