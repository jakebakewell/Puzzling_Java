public class PuzzleJavaTester {
    public static void main(String[] args) {
        PuzzleJava test = new PuzzleJava();
        System.out.println(test.createPrintReturn());
        System.out.println(test.createShuffleReturn());
        test.alphShuffle();
        System.out.println(test.random55To100());
        test.randSort();
        test.createRandString();
        System.out.println(test.arrayRandString());
    }
}
