package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1672Test {
    final Solution1672 solution1672 = new Solution1672();
    final int[][] arrays = {{1, 2, 3}, {3, 2, 1}};
    final int[][] arrays2 = {{1, 5}, {7, 3}, {3, 5}};
    final int[][] arrays3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

    @Test
    public void maximumWealth() {
        assertEquals(6, solution1672.maximumWealth(arrays));
        assertEquals(10, solution1672.maximumWealth(arrays2));
        assertEquals(17, solution1672.maximumWealth(arrays3));
    }
}