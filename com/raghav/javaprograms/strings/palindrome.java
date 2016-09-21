/*
 * Copyright (c) Raghav(RG)
 */

package com.raghav.javaprograms.strings;

        import java.util.*;

/**
 * Created by RaghavendraKulkarni on 9/21/2016.
 */

/**
 * @author Raghavendra kulkarni
 * A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia).
 * Problem Description:-
 * Difficulty: Easy
 * Given a string , print Yes if it is a palindrome, print No otherwise.
 * Constraints
 * will consist at most  lower case english letters.
 * Sample Input
 * madam
 * Sample Output
 * Yes
 */

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] arr = A.toCharArray();
        int i = 0, arrLength = arr.length, max = arrLength / 2;
        while (i <= max) {
            if (arr[i] != arr[arrLength - i - 1]) {
                System.out.println("No");
                return;
            }
            i = i + 1;
        }
        System.out.println("Yes");

        //alternate solution
        //System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
    }
}
