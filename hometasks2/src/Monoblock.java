public class Monoblock extends ComputerImpl {
    String monitor;
    public Monoblock (String maker, String model, String cpu, String ram, String disk, String monitor) {
        super(maker, model, cpu, ram, disk);
        this.monitor = monitor;
    }
    @Override
    public String toString() {
        return "maker - " + this.maker + ";" + " model - " + this.model + ";" + " cpu - " + this.cpu + ";" + " ram - " + this.ram + ";" + " disk - " + this.disk + ";" + " monitor - " + this.monitor;
    }
}
