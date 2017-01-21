package pro1_home3;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.InvalidParameterException;

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
    public static <T> T deze (String s, Class<T> tClass) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        T res = (T) tClass.newInstance();
        String[] s1 = s.split(";");

        for (String s2 :
                s1) {
            String[] ss = s2.split("=");
            if (ss.length !=2)
                throw new InvalidParameterException(s);
            String name = ss[0];
            String value = ss[1];
            Field field = tClass.getDeclaredField(name);

            if (Modifier.isPrivate(field.getModifiers()))
                field.setAccessible(true);
            if (field.isAnnotationPresent(Save.class)) {
                if (field.getType() == String.class){
                    field.set(res, value);
                }
            }
        }
        return res;
    }
}
