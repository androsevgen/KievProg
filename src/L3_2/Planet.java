package L3_2;

public class Planet {
    protected String Earth;
    protected String Mars;
    protected String Jupiter;

    public Planet() {
    }

    public Planet(String earth, String mars, String jupiter) {
        Earth = earth;
        Mars = mars;
        Jupiter = jupiter;
    }

    public String getEarth() {
        return Earth;
    }

    public void setEarth(String earth) {
        Earth = earth;
    }

    public String getMars() {
        return Mars;
    }

    public void setMars(String mars) {
        Mars = mars;
    }

    public String getJupiter() {
        return Jupiter;
    }

    public void setJupiter(String jupiter) {
        Jupiter = jupiter;
    }
}
