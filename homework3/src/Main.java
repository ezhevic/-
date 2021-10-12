import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> parseNum(String args) throws IncorrectException {
        String[] splitData = args.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        if (splitData.length != 20) {
            throw new IncorrectException("Incorrect data: " + args);
        }
        else {
            for (int i = 0; i <= 19; i++) {
                try {
                    list.add(Integer.parseInt(splitData[i]));
                }
                catch (NumberFormatException ex) {
                    throw new IncorrectException("Incorrect data: " + args);
                }
                //finally
            }
        }
        return list;
    }

    public static void main(String[] args) throws IncorrectException {
        ArrayList<Integer> numThree = new ArrayList<>();
        ArrayList<Integer> numTwo = new ArrayList<>();
        ArrayList<Integer> numOther = new ArrayList<>();
        String line = (new Scanner(System.in)).nextLine();
        ArrayList<Integer> listMain = parseNum(line);
        for (int i = 0; i <= 19; i++) {
            if (listMain.get(i) % 3 == 0) {
                numThree.add(listMain.get(i));
            }
            if (listMain.get(i) % 2 == 0) {
                numTwo.add(listMain.get(i));
                continue;
            }
            numOther.add(listMain.get(i));
        }
    }
    public static void printList(ArrayList<Integer> list) {
        for (Integer x: list) {
            System.out.println(x);
        }
    }
}
