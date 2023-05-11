package easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution412Test {
    final Solution412 solution412 = new Solution412();

    @Test
    public void fizzBuzz() {

        List<String> actual = solution412.fizzBuzz(3);
        List<String> expected = Arrays.asList("1", "2", "Fizz");
        assertEquals(expected, actual);

        List<String> actual2 = solution412.fizzBuzz(5);
        List<String> expected2 = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
        assertEquals(expected2, actual2);

        List<String> actual3 = solution412.fizzBuzz(15);
        List<String> expected3 = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz",
                "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(expected3, actual3);
    }
}