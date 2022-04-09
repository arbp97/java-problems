package tests;

import codewars.Walk;

public class WalkTest {
    public static void main(String[] args) throws Exception {
        System.out.println(Walk.isValid(new char[] { 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }));
        System.out.println(Walk.isValid(new char[] { 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e' }));
        System.out.println(Walk.isValid(new char[] { 'w' }));
        System.out.println(Walk.isValid(new char[] { 'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's' }));
    }
}
