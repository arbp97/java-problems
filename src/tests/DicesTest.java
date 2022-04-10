package tests;

import codewars.Dices;

public class DicesTest {

    public static void main(String[] args) {
        System.out.println(Dices.greedy(new int[] { 5, 1, 3, 4, 1 }));
        System.out.println(Dices.greedy(new int[] { 1, 1, 1, 3, 1 }));
        System.out.println(Dices.greedy(new int[] { 2, 4, 4, 5, 4 }));
    }
}
