package string;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String name[] = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, String> map = new HashMap<>();

        for (String str : name) {

            char c[] = str.toCharArray();

            Arrays.sort(c);

            String key = new String(c);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + " " + str);
            } else {
                map.put(key, str);
            }

        }
        System.out.println(map);

    }
}
