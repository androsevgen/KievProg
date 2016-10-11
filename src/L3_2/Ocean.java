package L3_2;

public class Ocean extends Planet {
    private String Atlantic;
    private final String Quiet = "Quiet";
    private final String Marsic = "Marsic";

    public Ocean() {
    }

    public Ocean(String earth, String mars, String jupiter, String atlantic) {
        super(earth, mars, jupiter);
        Atlantic = atlantic;
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


    public String getMarsic() {
        return Marsic;
    }

    public void findPlanet(){
        if (Atlantic == "Atlantic")
            System.out.println(Earth);
        if (Quiet == Quiet)
            System.out.println(Quiet);
        else System.out.println("ERROR");
    }

}
