package pro1_home1;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Top {
    @Ver(Name = "Andros")
    public static String AA(String Name, String version) {
        return Name + version;
    }

    @Test(a = 2, b = 5)
    public static int sum(int a, int b) {
        return a + b;
    }



    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Top top = new Top();
        Class<?> aClass = Top.class;

        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Ver.class)) {
                Ver ver = method.getAnnotation(Ver.class);
                String res = "";
                res = (String) method.invoke(top, ver.Name(), ver.version());
                System.out.println("Version: " + res);
            }
        }


        for (Method method1 : methods) {
            if (method1.isAnnotationPresent(Test.class)) {
                Test test = method1.getAnnotation(Test.class);
                int res1 = 0;
                res1 = (Integer) method1.invoke(top, test.a(), test.b());
                System.out.println(res1);
            }
        }
    }
}
