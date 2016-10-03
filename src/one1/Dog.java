package one1;

/**
 * Created by admin on 02.10.2016.
 */
public class Dog {
    private String name;
    private int age;
    private  String mane = "to OK";

     Dog(String name, int age) {

        this.name = name;
        this.age = age;
    }

     void gav(){
        System.out.println("Name: "+ name+ "   " + "Age: " + age);
    }

    void bigL(String name, int age){
        System.out.println(name.toUpperCase() + " " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMane() {
        return mane;
    }

    public void setMane(String mane) {
        this.mane = mane;
    }

    @Override
    public String toString() {
        return mane;
    }
}
