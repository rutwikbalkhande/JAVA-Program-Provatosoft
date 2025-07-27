package com.provatosoft.assignment;

import java.util.*;

public class AnagramGroup {
    /*
    Input: strs = ["eat","tea","tan","ate","nat","bat"]
	Output: strs = [["eat","tea","ate"],["bat"],["tan","nat"]]
     */
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> grouped = groupAnagrams(strs);
        System.out.println(grouped);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Convert word to char array and sort it
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); // Sorted word as key

            // Add to the corresponding group
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}


