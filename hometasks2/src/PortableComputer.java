public abstract class PortableComputer extends ComputerImpl {
    String monitor;
    String keyboard;
    public PortableComputer(String maker, String model, String cpu, String ram, String disk, String monitor, String keyboard) {
        super(maker, model, cpu, ram, disk);
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
    @Override
    public String toString() {
        return "maker - " + this.maker + ";" + " model - " + this.model + ";" + " cpu - " + this.cpu + ";" + " ram - " + this.ram + ";" + " disk - " + this.disk + ";" + " monitor - " + this.monitor + ";" + " keyboard" + this.keyboard;
    }
}
