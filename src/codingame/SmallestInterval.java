package codingame;

import util.Sort;

public class SmallestInterval {
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
}
