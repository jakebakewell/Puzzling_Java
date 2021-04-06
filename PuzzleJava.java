import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public PuzzleJava(){
    }
    public ArrayList<Integer> createPrintReturn() {
        int sum = 0;
        ArrayList<Integer> greaterThan10 = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        y.add(3);
        y.add(5);
        y.add(1);
        y.add(2);
        y.add(7);
        y.add(9);
        y.add(8);
        y.add(13);
        y.add(25);
        y.add(32);
        for (int i = 0; i < y.size(); i++) {
            sum += y.get(i);
            if (y.get(i) > 10) {
                greaterThan10.add(y.get(i));
            }
        }
        System.out.println(sum);
        return greaterThan10;
    }
    public ArrayList<String> createShuffleReturn() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        ArrayList<String> namesLongerThan10Chars = new ArrayList<String>();
        Collections.shuffle(names);
        for (int i = 0; i < 5; i++) {
            System.out.println(names.get(i));
            if (names.get(i).length() > 5) {
                namesLongerThan10Chars.add(names.get(i));
            }
        }
        return namesLongerThan10Chars;
    }
    public void alphShuffle() {
        ArrayList<String> alphabet = new ArrayList<String>();
        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");
        alphabet.add("d");
        alphabet.add("e");
        alphabet.add("f");
        alphabet.add("g");
        alphabet.add("h");
        alphabet.add("i");
        alphabet.add("j");
        alphabet.add("k");
        alphabet.add("l");
        alphabet.add("m");
        alphabet.add("n");
        alphabet.add("o");
        alphabet.add("p");
        alphabet.add("q");
        alphabet.add("r");
        alphabet.add("s");
        alphabet.add("t");
        alphabet.add("u");
        alphabet.add("v");
        alphabet.add("w");
        alphabet.add("x");
        alphabet.add("y");
        alphabet.add("z");
        ArrayList<String> vowels = new ArrayList<String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        vowels.add("y");
        Collections.shuffle(alphabet);
        System.out.println(alphabet.get(alphabet.size() - 1));
        System.out.println(alphabet.get(0));
        for (int i = 0; i < vowels.size(); i++) {
            if (alphabet.get(0) == vowels.get(i)) {
                System.out.println("The first shuffled letter is a vowel");
            }
        }
    }
    public ArrayList<Integer> random55To100() {
        Random rand = new Random();
        ArrayList<Integer> randArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            randArray.add(rand.nextInt(101 - 54) + 54);
        }
        return randArray;
    }
    public void randSort() {
        Random rand = new Random();
        ArrayList<Integer> randArray = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            randArray.add(rand.nextInt(101 - 54) + 54);
        }
        Collections.sort(randArray);
        int max = randArray.get(0);
        int min = randArray.get(randArray.size() - 1);
        for (int i = 0; i < randArray.size(); i++) {
            System.out.println(randArray.get(i));
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
    public void createRandString() {
        ArrayList<String> alphabet = new ArrayList<String>();
        Random rand = new Random();
        String randString = "";
        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");
        alphabet.add("d");
        alphabet.add("e");
        alphabet.add("f");
        alphabet.add("g");
        alphabet.add("h");
        alphabet.add("i");
        alphabet.add("j");
        alphabet.add("k");
        alphabet.add("l");
        alphabet.add("m");
        alphabet.add("n");
        alphabet.add("o");
        alphabet.add("p");
        alphabet.add("q");
        alphabet.add("r");
        alphabet.add("s");
        alphabet.add("t");
        alphabet.add("u");
        alphabet.add("v");
        alphabet.add("w");
        alphabet.add("x");
        alphabet.add("y");
        alphabet.add("z");
        for (int i = 0; i < 5; i++) {
            randString += alphabet.get(rand.nextInt(26));
        }
        System.out.println(randString);
    }
    public ArrayList<String> arrayRandString() {
        ArrayList<String> alphabet = new ArrayList<String>();
        ArrayList<String> arrayOfRandStr = new ArrayList<String>();
        Random rand = new Random();
        String randString = "";
        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");
        alphabet.add("d");
        alphabet.add("e");
        alphabet.add("f");
        alphabet.add("g");
        alphabet.add("h");
        alphabet.add("i");
        alphabet.add("j");
        alphabet.add("k");
        alphabet.add("l");
        alphabet.add("m");
        alphabet.add("n");
        alphabet.add("o");
        alphabet.add("p");
        alphabet.add("q");
        alphabet.add("r");
        alphabet.add("s");
        alphabet.add("t");
        alphabet.add("u");
        alphabet.add("v");
        alphabet.add("w");
        alphabet.add("x");
        alphabet.add("y");
        alphabet.add("z");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                randString += alphabet.get(rand.nextInt(26));
            }
            arrayOfRandStr.add(randString);
            randString = "";
        }
        return arrayOfRandStr;
    }
}
