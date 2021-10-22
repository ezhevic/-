import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Map {

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Ivanov", "Ivan");
        map.put("Petrov", "Ivan");
        map.put("Sidorov", "Egor");
        map.put("Pechorin", "Oleg");
        map.put("Begovikh", "Petr");
        map.put("Isypov", "Gleb");
        map.put("Shagalov", "Oleg");
        map.put("Korotkikh", "Ilia");
        map.put("Alikin", "Alex");
        map.put("Mishin", "Michael");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        ArrayList<String> diffnames = new ArrayList<>(map.values());
        HashMap<String, Integer> number = new HashMap<>();
        for (String s : diffnames){
            if (number.containsKey(s)){
              number.put(s, number.get(s) + 1);
            }
            else{
                number.put(s, 1);
            }
        }
        HashSet<String> repeatedNames = new HashSet<>();
        for (String s1 : diffnames){
            if (number.get(s1) > 1) {
                for (String secondName : map.keySet()) {
                    if (map.get(secondName).equals(s1)){
                        repeatedNames.add(secondName);
                    }
                }
            }
        }
        for (String namesRemove : repeatedNames){
            removeItemFromMapByValue(map, namesRemove);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        map.remove(value);
    }

    public static void printMap(HashMap<String, String> map) {
        System.out.println("         ");
        Set<String> keys = map.keySet();
        int count = 1;

        for (String firstName : keys){
            System.out.print(Integer.toString(count) + ">" + firstName + " ");
            System.out.println(map.get(firstName));
            count += 1;
        }
        System.out.println("          ");
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        printMap(map);
        removeTheFirstNameDuplicates(map);
        printMap(map);
    }
}