package codewars;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {

                    result[0] = j;
                    result[1] = i;
                    found = true;
                    break;
                }
            }

            if (found)
                break;
        }

        return result;
    }
}
