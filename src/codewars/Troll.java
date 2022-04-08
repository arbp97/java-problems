package codewars;

public class Troll {

    private static boolean isVowel(char c) {

        char aux = Character.toLowerCase(c);

        if (aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u') {
            return true;
        } else
            return false;
    }

    public static String disemvowel(String str) {

        String newStr = "";

        for (char c : str.toCharArray()) {
            if (!isVowel(c)) {
                newStr += c;
            }
        }

        return newStr;
    }

    /*
     * BEST SOLUTION
     * public static String disemvowel(String Z) {
     * return Z.replaceAll("(?i)[aeiou]", "");
     * }
     */
}
