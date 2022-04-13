package codewars;

import java.util.Arrays;

public class OddInt {

    public static int findIt(int[] a) {

        int count = 1, odd = 0;

        Arrays.sort(a);

        for (int i = 0; i < a.length - 1; i++) {

            while (a[i] == a[i + 1]) {
                count++;
                i++;
            }

            if (count % 2 != 0) {
                odd = a[i];
                return odd;
            }

            count = 1;
        }

        return a[a.length - 1];
    }

    public static int findItXor(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor = xor ^ A[i];
        }
        return xor;
    }
}