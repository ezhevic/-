/*
* Pair is a private class which contains
* a couple of elements of different types
* and does not prohibit elements from taking the value
* @param <T>
* @param <S>
 */
public class Pair<T, S> {
    private T t1;
    private S t2;
/*
*A class Pair constructor which contains
* two parameters types T and S
* @param t1
* @param t2
 */
    private Pair(T t1, S t2){
        this.t1 = t1;
        this.t2 = t2;
    }
    /*
    *Getter
    * @return value of first parameter
    */
    public T getFirst () {
        return t1;
    }
    /*
     *Getter
     * @return value of second parameter
     */
    public S getSecond() {
        return t2;
    }
    /*
    *Method creates Pair class pair which consist two parameters
     */
    public static Pair of(Object value, Object valuee) {
        return new Pair(value, valuee);
    }
    /*
    *Shows if object is "equal to" this Pair
    * Object is equal if it is a Pair
    * or both have no value present
    * or present values are "equal to" each other
    * @param ok
    * @return Returns equal value of the present values
     */
    @Override
    public boolean equals(Object ok) {
        if (this == ok)
            return true;
        if (ok == null)
            return false;
        if (getClass() != ok.getClass())
            return false;
        Pair pair = (Pair) ok;
        if (getFirst() == null) {
            if (pair.getFirst() != null)
                return false;
        }
        else if (!getFirst().equals(pair.getFirst()))
            return false;
        if (getSecond() == null) {
            if (pair.getSecond() != null)
                return false;
        }
        else if (!getSecond().equals(pair.getSecond()))
            return false;
        return true;

       // public static <T, S> Pair<T, S> of(T t1, S t2) {
       //     return new Pair<>(t1, t2);
       // }
    }
    /*
    *@return Returns hashcode value of the present value
     */
    @Override
    public int hashCode() {
        int res = 1;
        res = 31 * res + ((t1 == null) ? 0 : t1.hashCode());
        res = 31 * res + ((t2 == null) ? 0 : t2.hashCode());
        return res;
    }
    /*
    *Method changes Pair class object to String class object
     */
    public String toString() {
        return this.t1 + ", " + this.t2;
    }
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); //true!
    }
}
