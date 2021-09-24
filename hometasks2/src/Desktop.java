public class Desktop extends ComputerImpl {
    String videocard;
    public Desktop (String maker, String model, String cpu, String ram, String disk, String videocard) {
        super(maker, model, cpu, ram, disk);
        this.videocard = videocard;
    }
    @Override
    public String toString() {
        return "maker - " + this.maker + ";" + " model - " + this.model + ";" + " cpu - " + this.cpu + ";" + " ram - " + this.ram + ";" + " disk - " + this.disk + ";" + " videocard - " + this.videocard;
    }
}
