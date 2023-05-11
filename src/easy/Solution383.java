package easy;

import java.util.HashMap;
import java.util.Map;

public class Solution383 {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineLetters = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);
            int currentCount = magazineLetters.getOrDefault(m, 0);
            magazineLetters.put(m, currentCount + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            int currentCount = magazineLetters.getOrDefault(r, 0);
            if (currentCount == 0) {
                return false;
            }
            magazineLetters.put(r, currentCount - 1);
        }
        return true;
    }

    public boolean canConstruct2(String ransomNote, String magazine) {
        boolean b = false;
        StringBuilder sb = new StringBuilder(magazine);
        for (int i = 0; i < ransomNote.length(); i++) {
            for (int j = 0; j < magazine.length(); j++) {
                if (ransomNote.charAt(i) == magazine.charAt(j)) {
                    b = true;
                    sb.deleteCharAt(j);
                    magazine = sb.toString();
                    break;
                } else {
                    b = false;
                }
            }
        }
        return b;
    }

    public boolean canConstruct1(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            int matchingIndex = magazine.indexOf(r);
            if (matchingIndex == -1) {
                return false;
            }
            magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
        }
        return true;
    }

    public boolean canConstruct3(String ransomNote, String magazine) {
        int[] arr = new int[128];
        for (int i = 0; i < ransomNote.length(); i++)
            arr[ransomNote.charAt(i)]++;
        for (int i = 0; i < magazine.length(); i++)
            if (arr[magazine.charAt(i)] != 0) {
                arr[magazine.charAt(i)]--;
            }
        for (int i = 0; i < ransomNote.length(); i++)
            if (arr[ransomNote.charAt(i)] > 0) {
                return false;
            }
        return true;
    }
}
