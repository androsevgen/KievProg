package pro1_home3;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Serial {
    public static String seriale(Object o) {


        Class<?> aClass = o.getClass();
        StringBuilder builder = new StringBuilder();

        Field[] fieldelds = aClass.getDeclaredFields();

        for (Field field :
                fieldelds) {
            if (!field.isAnnotationPresent(Save.class))
                continue;
            if (Modifier.isPrivate(field.getModifiers()))
                field.setAccessible(true);
            builder.append(field.getName()+"+");
            if (field.getType().equals(String.class));
            builder.append(";");
        }
        return builder.toString();
    }
}
