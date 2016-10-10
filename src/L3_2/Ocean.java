package L3_2;

public class Ocean extends Planet {
    private String Atlantic;
    private String Quiet;
    private String Marsic;

    public Ocean() {
    }

    public Ocean(String earth, String mars, String jupiter, String atlantic, String quiet, String marsic) {
        super(earth, mars, jupiter);
        Atlantic = atlantic;
        Quiet = quiet;
        Marsic = marsic;
    }

    public String getAtlantic() {
        return Atlantic;
    }

    public void setAtlantic(String atlantic) {
        Atlantic = atlantic;
    }

    public String getQuiet() {
        return Quiet;
    }

    public void setQuiet(String quiet) {
        Quiet = quiet;
    }

    public String getMarsic() {
        return Marsic;
    }

    public void setMarsic(String marsic) {
        Marsic = marsic;
    }

    public void findPlanet(){
        if (Atlantic == "Atlantic")
            System.out.println(Earth);
        else System.out.println("ERROR");
    }

}
