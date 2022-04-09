package tests;

import codewars.CompArray;

public class CompArrayTest {
    public static void main(String[] args) {
        int[] a = new int[] { 2, 2, 3 };
        int[] b = { 4, 9, 9 };

        System.out.println(CompArray.comp(a, b));
    }
}
