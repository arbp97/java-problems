package codewars;

public class Walk {

    public static boolean isValid(char[] walk) {

        // STARTING POSITION
        int X = 0, Y = 0;

        if (walk.length > 10)
            return false;

        for (char c : walk) {
            switch (c) {
                case 'n':
                    Y++;
                    break;
                case 's':
                    Y--;
                    break;
                case 'e':
                    X++;
                    break;
                case 'w':
                    X--;
                    break;
                default:
                    break;
            }
        }

        if (X == 0 && Y == 0)
            return true;
        else
            return false;
    }
}
