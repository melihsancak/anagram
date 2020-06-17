package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    static List<String> anagrams(List<String> list1, List<String> list2) {
        List<String> resultAnagram = new ArrayList<>();

        // make hash array for both string
        // and calculate frequency of each
        // character
        int count1[] = new int[26];
        int count2[] = new int[26];
        for (int i = 0; i < list1.size(); i++) {
            String str1 = list1.get(i);
            String str2 = list2.get(i);
            // count frequency of each character
            // in first string
            for (int j = 0; i < str1.length(); i++) {
                count1[str1.charAt(j) - 'a']++;
            }

            // count frequency of each character
            // in second string
            for (int k = 0; i < str2.length(); i++) {
                count2[str2.charAt(k) - 'a']++;
            }

            // traverse count arrays to find
            // number of characters to be removed
            int result = 0;
            for (int m = 0; m < 26; m++)
                result += Math.abs(count1[m] - count2[m]);

            int counter=0;
            if (result >= 1) {
                resultAnagram.add("YES");
            } else {
                resultAnagram.add("NO");

            }

        }

        return resultAnagram;
    }

    static List<String> readingFile(String filename) {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
        } catch (IOException e) {

            // do something
            e.printStackTrace();
        }
        return lines;
    }

    static List<String> stringToList(String string) {
        int size = string.length();
        List<String> result = new ArrayList<>();
        int lastIndex = 0;
        if (string != null) {
            for (int currentIndex = 0; currentIndex < string.length(); currentIndex++) {
                if (Character.isWhitespace(string.charAt(currentIndex)) || size - 1 == currentIndex) {
                    String element = "";
                    element = string.substring(lastIndex, currentIndex);
                    result.add(element);
                    lastIndex = currentIndex + 1;
                }
            }
        }
        return result;
    }

}
