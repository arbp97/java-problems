package codewars;

public class MissingLetter {
    public static char findMissingLetter(char[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] != (array[i] + 1))
                return Character.toChars(array[i] + 1)[0];
        }
        return ' ';
    }
}
