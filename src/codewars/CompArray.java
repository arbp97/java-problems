package codewars;

public class CompArray {
    public static boolean comp(int[] a, int[] b) {
        // doesnt work
        int multiplicities = 0;
        boolean flag;

        for (int i = 0; i < b.length; i++) {
            flag = false;
            for (int j = 0; j < a.length; j++) {
                if (((a[j] * a[j]) == b[i]) && !flag) {
                    flag = true;
                    System.out.println(a[j] + " " + b[i]);
                    multiplicities++;
                }
            }
        }

        if (multiplicities == a.length) {
            return true;
        } else {
            return false;
        }
    }
    /*
     * 'BEST' SOLUTION works
     * public static boolean comp(int[] a, int[] b) {
     * if ((a == null) || (b == null)){
     * return false;
     * }
     * int[] aa = Arrays.stream(a).map(n -> n * n).toArray();
     * Arrays.sort(aa);
     * Arrays.sort(b);
     * return (Arrays.equals(aa, b));
     * 
     * }
     * }
     */
}
