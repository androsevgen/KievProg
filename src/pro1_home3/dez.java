package pro1_home3;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.InvalidParameterException;
import java.util.HashMap;

public class dez {
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
