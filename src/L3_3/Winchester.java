package L3_3;

public class Winchester extends Computer {
    private int speed;
    private int hd_size;

    public Winchester() {
    }

    public Winchester(String winchester, String drive, String ram, String cpu, int speed, int hd_size) {
        super(winchester, drive, ram, cpu);
        this.speed = speed;
        this.hd_size = hd_size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHd_size() {
        return hd_size;
    }

    public void setHd_size(int hd_size) {
        this.hd_size = hd_size;
    }
    public void findHDsize(){
        System.out.println(hd_size);
    }
}
