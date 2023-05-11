package easy;

import java.util.ArrayList;
import java.util.List;

public class Solution412 {

    public List<String> fizzBuzz(int n) {
        List<String> strings1 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String word;
            if (i % 3 == 0 && i % 5 == 0) {
                word = "FizzBuzz";
            } else if (i % 3 == 0) {
                word = "Fizz";
            } else if (i % 5 == 0) {
                word = "Buzz";
            } else {
                word = Integer.toString(i);
            }
            strings1.add(word);
        }
        return strings1;
    }

    public List<String> fizzBuzz2(int n) {
        List<String> strings1 = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String word = "";
            if (i % 3 == 0) {
                word += "Fizz";
            }
            if (i % 5 == 0) {
                word += "Buzz";
            }
            if (word.isEmpty()) {
                word = String.valueOf(i);
            }
            strings1.add(word);
        }
        return strings1;
    }
}
