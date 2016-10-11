package L3_3;

public class Runner {
    public static void main(String[] args) {
        Winchester winchester = new Winchester();
        winchester.setWinchester("WD");
        winchester.setHd_size(1000);
        winchester.setSpeed(7200);

        winchester.ON();
        winchester.OFF();
        winchester.checkvirus();
        winchester.findHDsize();

    }
}
