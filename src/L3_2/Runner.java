package L3_2;

public class Runner {
    public static void main(String[] args) {
        Continent continent = new Continent();
        continent.setEurasia("Eurasia");
        continent.setEarth("Earth");
        continent.setAfrica("Africa");
        continent.setJupiterEurasia("JupiterEurasia");
        continent.setMarsAfrica("MarsAfrica");
        continent.setMars("Mars");
        continent.setJupiter("Jupiter");
        continent.setEarth("Earth");
        continent.findCon();
        System.out.println();

        Ocean ocean = new Ocean();
        ocean.setAtlantic("Atlantic");
        ocean.setEarth("Earth");
        ocean.findPlanet();
        System.out.println();

        continent.findCount();

    }
}
