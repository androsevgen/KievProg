package L3_1;

public class Sentence extends Text {

    private String d;

    public Sentence() {
        super();
    }

    public Sentence(String a, String b, String c, String d) {
        super(a, b, c);
        this.d = d;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public void metod1(){
         System.out.println(a + b + c + d);
    }

}
