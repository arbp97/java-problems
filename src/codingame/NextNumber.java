package codingame;

import java.util.List;
import java.util.stream.Collectors;

public class NextNumber {
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

}
