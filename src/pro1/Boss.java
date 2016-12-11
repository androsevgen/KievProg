package pro1;

public class Boss {

    @Version(name = "Test", version = 1)
    public static void main(String[] args) {
        Class<?> aClass = Boss.class;
        aClass.getClass();
//        System.out.println(aClass.getName());
        System.out.println("");
        Class<?> aClass1 = Op.class;

    }
}


 class Op{
private String a = "OK";
}

