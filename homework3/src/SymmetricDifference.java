import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class SymmetricDifference {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> setOne = new HashSet<T>(set1);
        setOne.addAll(set2);
        Set<T> setTwo = new HashSet<T>(set1);
        setTwo.retainAll(set2);
        setOne.removeAll(set2);
        return setOne;
    }
}
