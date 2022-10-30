package Pr2.Pr2Task4;

public class Pc {
    private String cpu;
    private String gpu;
    private int ram;

    @Override
    public String toString() {
        return "Pc{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram=" + ram +
                '}';
    }

    public Pc(String cpu, String gpu, int ram) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
