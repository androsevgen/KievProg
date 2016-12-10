package pro_1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test1 {

@TTT(a= 3)

    @Test(a=2, b=5)
    public static  int sum(int a, int b) {
            return a+ b;
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Class<?> cls = Test1.class;

        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(Test.class)) {

                Test test = m.getAnnotation(Test.class);
                int res = (Integer)m.invoke(null, test.a(), test.b());
                System.out.println(res);
            }
        }
    }
}


