import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    private static ArrayList<User> createUsers() {
        ArrayList<User> users1 = new ArrayList<>();
        User m1 = new User("Ivan", "Ivanov", 18);
        users1.add(m1);

        User m2 = new User("Ivanova", "Ivania", 19);
        users1.add(m2);

        User m3 = new User("Ivanko", "Ivanka", 33);
        users1.add(m3);

        User m4 = new User("Ivanovchenko", "Ivanochka", 7);
        users1.add(m4);

        User m5 = new User("Ivanovka", "Ivanina", 51);
        users1.add(m5);

        User m6 = new User("Ivanovova", "Ivanni", 46);
        users1.add(m6);

        User m7 = new User("Ivanovsky", "Ivasia", 27);
        users1.add(m7);

        User m8 = new User("Ivanovikh", "Ivana", 18);
        users1.add(m8);

        User m9 = new User("Ivanovskii", "Ivan", 7);
        users1.add(m9);

        User m10 = new User("Ivan", "Ivanla", 22);
        users1.add(m10);
        return users1;
    }
    public static HashMap<Integer, ArrayList<User>> processMap(ArrayList<User> data){
        ArrayList<Integer> ageD = new ArrayList<>();
        for (User user : data){
            ageD.add(user.getAge());
        }
        HashSet<Integer> ageSet = new HashSet<>(ageD);
        HashMap<Integer, ArrayList<User>> output = new HashMap<>();

        for (Integer age: ageSet) {
            for (User user: data) {
                if (user.getAge().equals(age)) {
                    if (output.containsKey(age)) {
                        ArrayList<User> addUser = new ArrayList<>(output.get(age));
                        addUser.add(user);
                        output.remove(age);
                        output.put(age, addUser);
                    } else {
                        ArrayList<User> addUser = new ArrayList<>();
                        addUser.add(user);
                        output.put(age, addUser);
                    }
                }
            }
        }

        return output;
    }

    public static void printUserMap(HashMap<Integer, ArrayList<User>> map) {
        for (Integer age: map.keySet()) {
            System.out.print(Integer.toString(age) + ":  ");
            for (User user: map.get(age)) {
                System.out.print(user.getFirstName() + " " + user.getSecondName() + "   ");
            }
            System.out.println("  ");
        }
    }

    public static void main (String[] args) {
        printUserMap(processMap(createUsers()));
    }
}
