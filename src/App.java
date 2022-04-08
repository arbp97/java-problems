import codingame.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("next " + NextNumber.next(654321));

        int[] array = { 1, 5, 3, 7, 11 };

        System.out.println("interval " + SmallestInterval.smallestInterval(array));
    }
}
