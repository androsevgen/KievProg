package pro1_home3;



public class Topic {
    public static void main(String[] args) throws Exception {
        Top top = new Top();
        top.setA("Bla-Bla");
        top.setB("Bla-Bla-Bla");
        String s = Serial.seriale(top);
        System.out.println(s);

        top = Serial.deze(s, Top.class);
        System.out.println(top.getA() + " " + top.getD());
    }

}
