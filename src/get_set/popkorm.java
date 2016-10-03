package get_set;

/**
 * Created by admin on 03.10.2016.
 */
public class popkorm {
    private  String name;
    private static int id ;
    private long age;
    private String  status;
    static String  all;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        popkorm.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
