package pro1_home2;

import java.io.FileDescriptor;
import java.io.FileWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Top {
    public static void main(String[] args) {
        TextContainer textContainer = new TextContainer();
        Class<?> aClass = textContainer.getClass();

        if (! aClass.isAnnotationPresent(SaveTo.class))
        {
            System.out.println("ERROR");
            return;
        }

        SaveTo saveTo = aClass.getAnnotation(SaveTo.class);
        String path = saveTo.path();
        Method[] methods = aClass.getDeclaredMethods();

        for (Method method :
                methods) {
            if (method.isAnnotationPresent(SaveTo.class)){
                try {
                    method.invoke(textContainer, path);
                    break;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Write OK");

    }



}
