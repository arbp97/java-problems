package codewars;

public class DuplicateEncoder {
    public static String encode(String word) {

        String aux = "", duplicate = "", encoded = "";

        for (char c : word.toCharArray()) {

            char cLower = Character.toLowerCase(c);

            if (aux.contains("" + cLower)) {
                duplicate += cLower;
            }

            aux += cLower;
        }

        for (char c : aux.toCharArray()) {

            if (duplicate.contains("" + c)) {
                encoded += ")";
            } else {
                encoded += "(";
            }
        }

        return encoded;
    }
    /*
     * BEST SOLUTION
     * static String encode(String word) {
     * word = word.toLowerCase();
     * String result = "";
     * for (int i = 0; i < word.length(); ++i) {
     * char c = word.charAt(i);
     * result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
     * }
     * return result;
     * }
     */
}