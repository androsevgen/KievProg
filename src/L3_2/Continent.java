package L3_2;

public class Continent extends Planet {
    private String Eurasia;
    private String Africa;
    private String MarsAfrica;
    private String JupiterEurasia;

    public Continent() {
    }

    public Continent(String earth, String mars, String jupiter, String eurasia, String africa, String marsAfrica, String jupiterEurasia) {
        super(earth, mars, jupiter);
        Eurasia = eurasia;
        Africa = africa;
        MarsAfrica = marsAfrica;
        JupiterEurasia = jupiterEurasia;
    }

    public String getEurasia() {
        return Eurasia;
    }

    public void setEurasia(String eurasia) {
        Eurasia = eurasia;
    }

    public String getAfrica() {
        return Africa;
    }

    public void setAfrica(String africa) {
        Africa = africa;
    }

    public String getMarsAfrica() {
        return MarsAfrica;
    }

    public void setMarsAfrica(String marsAfrica) {
        MarsAfrica = marsAfrica;
    }

    public String getJupiterEurasia() {
        return JupiterEurasia;
    }

    public void setJupiterEurasia(String jupiterEurasia) {
        JupiterEurasia = jupiterEurasia;
    }
public void findCon(){
    if (Earth == "Earth")
        System.out.println(Eurasia+ " " + Africa);
    if (Mars == "Mars")
        System.out.println(MarsAfrica);
    if (Jupiter == "Jupiter")
        System.out.println(JupiterEurasia);
    else System.out.println("ERROR");
}
}
