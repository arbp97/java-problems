package codewars;

public class DigPowFind {
    public static long digPow(int n, int p) {

        int count = 0;

        for (char c : String.valueOf(n).toCharArray()) {
            count += Math.pow(Character.getNumericValue(c), p);
            p++;
        }

        return (count / n) * n == count ? (count / n) : -1;
    }
}
