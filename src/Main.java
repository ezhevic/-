import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double z1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double z2 = sc.nextDouble();

        sc.close();


        Vector vector1 = new Vector(x1, y1, z1);
        Vector vector2 = new Vector(x2, y2, z2);
        Vector vector3 = vector1.add(vector2);
        Vector vector4 = vector1.subtract(vector2);

        System.out.println(vector1.length());
        System.out.println(vector2.length());
        System.out.println(vector1.scalarProduct(vector2));
        System.out.println(vector1.cos(vector2));
        System.out.println(vector3.getX() + " " + vector3.getY() + " " + vector3.getZ());
        System.out.println(vector4.getX() + " " + vector4.getY() + " " + vector4.getZ());
    }
}
