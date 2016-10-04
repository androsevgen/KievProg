package L2_3_blinov.pak;

public class Animal {
    private String name;
    private String voice;
    private String run;
    private String bite;

    public Animal(String name, String voice, String run, String bite) {
        this.name = name;
        this.voice = voice;
        this.run = run;
        this.bite = bite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getBite() {
        return bite;
    }

    public void setBite(String bite) {
        this.bite = bite;
    }
}
