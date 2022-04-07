import java.util.List;
import java.util.stream.Collectors;

import util.Sort;

public class App {

    /**
     * returns the smallest superior number possible
     * without using numbers already present
     * in given array.
     * fix: if given all possible numbers in array, error
     * 
     * @param n int
     * @return next int
     */
    public static int next(int n) {

        List<Integer> numbersAsList = String.valueOf(n).chars().mapToObj(c -> Character.getNumericValue(c))
                .collect(Collectors.toList());
        String next = "";
        int superior = 0, smallestNotRepeated = 0;

        // get biggest number
        for (int number : numbersAsList) {
            if (number > superior) {

                superior = number;
            }
        }

        // get smallest n not in original array

        while (numbersAsList.contains(smallestNotRepeated)) {
            smallestNotRepeated++;
        }

        // fill next string
        next = String.valueOf(superior + 1);

        for (int i = 1; i < numbersAsList.size(); i++) {
            next = next + String.valueOf(smallestNotRepeated);
        }

        return Integer.valueOf(next);
    }

    /**
     * returns smallest interval between two numbers in array
     * 
     * @param numbers int[]
     * @return interval int
     */
    public static int smallestInterval(int[] numbers) {

        Sort sort = new Sort();
        int interval = 999999;

        sort.mergeSort(numbers, 0, numbers.length - 1);

        for (int i = 0; i < numbers.length - 1; i++) {
            int aux = 0;
            if ((aux = (numbers[i + 1] - numbers[i])) < interval) {
                interval = aux;
            }
        }

        return interval;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("next " + next(654321));

        int[] array = { 1, 5, 3, 7, 11 };

        System.out.println("interval " + smallestInterval(array));
    }
}
