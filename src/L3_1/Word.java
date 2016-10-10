package L3_1;

public class Word extends Text {
    private String f;
    private String h;
    private String k;

    public Word() {
    }

    public Word(String a, String b, String c, String f, String h, String k) {
        super(a, b, c);
        this.f = f;
        this.h = h;
        this.k = k;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public void Metod2() {
        setA(" one ");
        setB("Word");
        System.out.println(a + " " + getB());
    }

    public void metod3() {
        setA("privet ");
        setB(" vsem ");
        System.out.println(a + b + f);
    }

}
