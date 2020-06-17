package com.company;

import java.util.*;

import static com.company.Solution.*;

public class Main {

    public static void main(String[] args) throws Exception {
        List<String> a = Arrays.asList(new String[]{"ab", "abc", "abcde", "aabbcd", "cceaeaebc"});
        List<String> b = Arrays.asList(new String[]{"aa", "cab", "bcdea", "cbdaba", "ccceacacb"});
        //reading txt line by line
        List first = readingFile("C:\\Users\\Melih Sancak\\Desktop\\anagram.txt");
        Iterator<String> itr = first.iterator();
        String str1 = null;
        String str2 = null;
        int count = 0;
        while (itr.hasNext()) {
            if (count == 0) {
                str1 = (itr.next());
                count++;
            }
            if (count == 1) {
                str2 = itr.next();
                count++;
            }
        }

        //String to list
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1 = stringToList(str1);
        list2 = stringToList(str2);
        List<String> result = anagrams(list1, list2);

        result.forEach(System.out::println);
    }

    {
        // write your code here
    }
}
