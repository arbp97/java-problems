package codewars;
/**
 * Three 1's => 1000 points
 * Three 6's => 600 points
 * Three 5's => 500 points
 * Three 4's => 400 points
 * Three 3's => 300 points
 * Three 2's => 200 points
 * One 1 => 100 points
 * One 5 => 50 point
 */

public class Dices {
    public static int greedy(int[] dice) {
        int score = 0;
        int[] count = new int[6];

        for (int i : dice)
            count[i - 1]++;

        for (int i = 0; i < count.length; i++) {
            switch (i) {
                case 0:
                    score += (count[i] / 3 * 1000) + (count[i] % 3 * 100);
                    break;
                case 4:
                    score += (count[i] / 3 * 500) + (count[i] % 3 * 50);
                    break;
                case 1:
                    score += (count[i] / 3 * 200);
                    break;
                case 2:
                    score += (count[i] / 3 * 300);
                    break;
                case 3:
                    score += (count[i] / 3 * 400);
                    break;
                case 5:
                    score += (count[i] / 3 * 600);
                    break;
                default:
                    break;
            }
        }

        return score;
    }
}
