import java.util.Objects;

public class Vector {
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return this.length() == vector.length() && this.cos(vector) == 1.0;
    }

    @Override
    public int hashCode() {
        int res = 0;
        long x = Double.doubleToLongBits(this.x);
        res += 29*(int)(x^(x >>> 32));
        long y = Double.doubleToLongBits(this.y);
        res += 29*(int)(y^(y >>> 32));
        long z = Double.doubleToLongBits(this.z);
        res += 29*(int)(z^(z >>> 32));
        return res;
    }

        // Длина вектора. Корень из суммы квадратов
    double length(){
        return Math.sqrt(x * x + y*y + z*z);
    }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector){
        return (x*vector.x + y*vector.y + z*vector.z);
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){
        return new Vector(y*vector.z - z*vector.y, z*vector.x - x*vector.z, x*vector.y - y*vector.x);
    }

    // Косинус между двумя векторами
    double cos(Vector vector){
        return (scalarProduct(vector) / (length() *vector.length() ));
    }

    // Сумма двух векторов
    Vector add(Vector vector){
        return new Vector (x + vector.x, y + vector.y, z + vector.z);
    }

    // Разность двух веторов
    Vector subtract(Vector vector){
        return new Vector (x - vector.x, y - vector.y, z - vector.z);
    }
}

