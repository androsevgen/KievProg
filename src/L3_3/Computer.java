package L3_3;

public class Computer {
     protected String Winchester;
     protected String Drive;
     protected String Ram;
     protected String Cpu;

    public Computer() {
    }

    public Computer(String winchester, String drive, String ram, String cpu) {
        Winchester = winchester;
        Drive = drive;
        Ram = ram;
        Cpu = cpu;
    }

    public String getWinchester() {
        return Winchester;
    }

    public void setWinchester(String winchester) {
        Winchester = winchester;
    }

    public String getDrive() {
        return Drive;
    }

    public void setDrive(String drive) {
        Drive = drive;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public String getCpu() {
        return Cpu;
    }

    public void setCpu(String cpu) {
        Cpu = cpu;
    }
    public void ON(){
        System.out.println("PC is ON");
    }
    public void OFF(){
        System.out.println("PC is OFF");
    }
    public void checkvirus(){
        System.out.println("Pc is check");
    }
}
