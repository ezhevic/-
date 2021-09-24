public abstract class ComputerImpl implements Computer {
    String maker;
    String model;
    String cpu;
    String ram;
    String disk;

    public ComputerImpl(String maker, String model, String cpu, String ram, String disk) {
        this.maker = maker;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.disk = disk;
    }

    //так мы избавляемся от дублирующего кода
    //в дальнейшем, все что нам нужно - переопределить метод toString
    public String turnOn() {
        return "Turn on " + getClass().getSimpleName() + " " + toString();
    }

    public String turnOff() {
        return "Turn off " + getClass().getSimpleName() + " " + toString();
    }

    public String connect() {
        return "Connect to internet " + getClass().getSimpleName() + " " + toString();
    }

    @Override
    public String toString() {
        return "maker - " + this.maker + ";" + " model - " + this.model + ";" + " cpu - " + this.cpu + ";" + " ram - " + this.ram + ";" + " disk - " + this.disk;
    }
}
