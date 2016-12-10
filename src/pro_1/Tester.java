package pro_1;


/*1. Создать аннотацию, которая принимает параметры для метода. Написать код, который вызовет метод,
        помеченный этой аннотацией, и передаст параметры аннотации в вызываемый метод.
@Test(a=2, b=5)
public void test(int a, int b) {…}*/


import java.lang.reflect.Method;

public class Tester {
    public static boolean test(Class<?>... ls) {
        try {
            for (Class<?> cls : ls) {
                Method[] methods = cls.getDeclaredMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(Test.class)) {
                        Boolean b = (Boolean) method.invoke(null, new Object[]{});
                        if (!b)
                            return false;
                    }
                }
            }

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
