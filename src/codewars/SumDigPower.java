package codewars;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {

        List<Long> newList = new ArrayList<>();

        if (a > b)
            return newList;

        for (long i = a; i <= b; i++) {

            char[] aux = String.valueOf(i).toCharArray();
            long sum = 0;
            System.out.println(aux);
            for (int j = 0; j < aux.length; j++) {
                sum += Math.pow(Character.getNumericValue(aux[j]), j + 1);
            }

            if (sum == i)
                newList.add(i);
        }

        return newList;
    }
}