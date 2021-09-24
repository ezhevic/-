public class Main {
    public static void main(String[] args){
        Computer[] comp = new Computer[6];
        comp[0] = new Server("hp", "envy", "intel5", "16", "256");
        comp[1] = new Netbook("asus", "zenbook", "intel7", "16", "512", "15d", "light");
        comp[2] = new Desktop("lenovo", "yoga", "intel3", "8", "128", "nVidia");
        comp[3] = new Laptop("MAC", "pro", "m1", "32", "1024", "16", "light");
        comp[4] = new Monoblock("Dell", "Inspiron", "intel5", "8", "128", "24");
        comp[5] = new Nettop("acer", "swift", "intel7", "16", "256");
        for (Computer computer: comp){
            System.out.println(computer.turnOn());
            System.out.println(computer.connect());
            System.out.println(computer.turnOff());
        }
    }
}
