package one;

/**
 * Created by admin on 01.10.2016.
 */
public  class Dog {
    private String name ;
    private String ownerName;

    public Dog(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }
    public void bark(){
        System.out.println(name +" "+ ownerName +" "+ "Gav-Gav");

    }
    public String test(){
        String f = "OK";
        System.out.println(f);
        return f;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
