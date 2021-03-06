package pro2_home3_1;

import L3_1.Sentence;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by admin on 14.12.2016.
 */
public class Runner {
    private ArrayList<Top> tops = new ArrayList<Top>();

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchFieldException, InstantiationException {
        Top top = new Top("Test", 12, "Lara");
            Runner runner = new Runner();
        runner.tops.add(top);
        Class<?> aClass = top.getClass();

        if (!aClass.isAnnotationPresent(WriteInFile.class)) {
            System.out.println("Error");
        }

        WriteInFile writeInFile = aClass.getAnnotation(WriteInFile.class);
        String path = writeInFile.patch();
        Method[] methods = aClass.getDeclaredMethods();

        for (Method method :
                methods) {
            if (method.isAnnotationPresent(Save.class)) {

                method.invoke(top, path);
                break;

            }

        }
        System.out.println("Write OK");
        String seria = Serialize.serA(top);

        Serialize.ser();
        Serialize.dez();
        System.out.println("");
        System.out.println(Serialize.serA(top));

    };

}


