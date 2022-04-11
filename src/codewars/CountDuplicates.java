package codewars;

import java.util.Arrays;

public class CountDuplicates {
    public static int duplicateCount(String text) {

        int count = 0;
        boolean counted = false;
        char[] sort = text.trim().toLowerCase().toCharArray();

        Arrays.sort(sort);
        String sortedText = new String(sort);

        for (int i = 0; i < sortedText.length() - 1; i++) {

            if (sortedText.charAt(i) == sortedText.charAt(i + 1)) {
                if (!counted) {
                    count++;
                    counted = true;
                }
            } else
                counted = false;
        }

        return count;
    }
    /*
     * BEST
     * public static int duplicateCount(String text) {
     * int ans = 0;
     * text = text.toLowerCase();
     * while (text.length() > 0) {
     * String firstLetter = text.substring(0, 1);
     * text = text.substring(1);
     * if (text.contains(firstLetter))
     * ans++;
     * text = text.replace(firstLetter, "");
     * }
     * return ans;
     * }
     */
}
