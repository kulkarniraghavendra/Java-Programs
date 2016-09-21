/*
 * Copyright (c) Raghav(RG)
 */

package com.raghav.javaprograms.strings;

import java.util.*;

/**
 * @author Raghavendra kulkarni
 * PROBLEM DESCRIPTION:-
 * Input Format
 * First line will consist a string containing english alphabets which has at most 1000 characters. 2nd line will consist an integer .
 * Output Format
 * In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.
 * Sample Input
 * welcometojava
 * 3
 * Sample Output
 * ava
 * wel
 * Explanation
 * Here is the list of all substrings of length :
 * wel,elc,lco,com,ome,met,eto,toj,oja,jav,ava
 * Among them ava is the smallest and wel is the largest.
 */

public class lexicographicallySmallestAndLargestSubstring {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named lexicographicallySmallestAndLargestSubstring. */
        Scanner scanner = new Scanner(System.in);
        try {
            String inputString = scanner.nextLine().replace(" ", "");
            Integer delimiterVal = scanner.nextInt();
            List<String> subStrings = new ArrayList<>();
            if (inputString.length() <= delimiterVal) {
                subStrings.add(inputString);
            } else {
                for (int i = 0, max = inputString.length(); i <= max - delimiterVal; i = i + 1) {
                    subStrings.add(inputString.substring(i, i + delimiterVal));
                }
            }
            String smallerSubString;
            String largerSubString;
            smallerSubString = largerSubString = subStrings.get(0);
            if (subStrings.size() > 1) {
                for (int i = 0, max = subStrings.size(); i < max - 1; i = i + 1) {
                    smallerSubString = smallerSubString.compareTo(subStrings.get(i + 1)) < 0 ? smallerSubString : subStrings.get(i + 1);
                    largerSubString = largerSubString.compareTo(subStrings.get(i + 1)) > 0 ? largerSubString : subStrings.get(i + 1);
                }
            }
            System.out.println(smallerSubString + "\n" + largerSubString);
        } finally {
            scanner.close();
        }
    }
}