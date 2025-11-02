package Model;

public class Laptop extends Product {
    private String ram;
    private String cpu;

    public Laptop() {
    }
    public Laptop( String name, String description, double price,String ram, String cpu) {
        super( name, description, price);
        this.ram = ram;
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    @Override
    public String getInfor(){
        return "\n___LapTop___\n" +
                super.getInfor() +
                "Ram : " + getRam() + "\n" +
                "Cpu : " + getCpu() + "\n";
    }

    @Override
    public String toString() {
        return "Laptop{" +
                super.toString() +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
