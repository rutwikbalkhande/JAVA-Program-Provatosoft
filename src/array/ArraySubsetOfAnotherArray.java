package array;

import java.util.HashMap;

public class ArraySubsetOfAnotherArray {

    public static void main(String[] args) {
        long[] a1 = {11, 1, 13, 21, 3, 7};
        long[] a2 = {11, 3, 7, 1};

        String result = isSubset(a1, a2, a1.length, a2.length);
        System.out.println("Using isSubset(): " + result);

        String resultOld = isSubsetOld(a1, a2, a1.length, a2.length);
        System.out.println("Using isSubsetOld(): " + resultOld);
    }

    public static String isSubset(long a1[], long a2[], long n, long m) {
        HashMap<Long, Integer> freqMap = new HashMap<>();
        for (long element : a1) {
            freqMap.put(element, freqMap.getOrDefault(element, 0) + 1);
        }

        for (long element : a2) {
            if (freqMap.getOrDefault(element, 0) > 0) {
                freqMap.put(element, freqMap.get(element) - 1);
            } else {
                return "No";
            }
        }
        return "Yes";
    }

    public static String isSubsetOld(long a1[], long a2[], long n, long m) {
        HashMap<Long, Integer> freqMap = new HashMap<>();
        for (long element : a1) {
            freqMap.put(element, freqMap.getOrDefault(element, 0) + 1);
        }

        for (long element : a2) {
            if (freqMap.containsKey(element) && freqMap.get(element) > 0) {
                freqMap.put(element, freqMap.get(element) - 1);
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
