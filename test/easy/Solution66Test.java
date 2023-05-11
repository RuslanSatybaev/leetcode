package easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution66Test {
    final int[] numsExpected = new int[]{1, 2, 4};
    final int[] numsExpected2 = new int[]{4, 3, 2, 2};
    final int[] numsExpected3 = new int[]{1, 0};
    final int[] numsExpected4 = new int[]{9, 0, 0, 0};

    final int[] numsInput = new int[]{1, 2, 3};
    final int[] numsInput2 = new int[]{4, 3, 2, 1};
    final int[] numsInput3 = new int[]{9};
    final int[] numsInput4 = new int[]{8, 9, 9, 9};

    @Test
    public void searchInsert() {
        assertArrayEquals(numsExpected, new Solution66().plusOne(numsInput));
    }

    @Test
    public void searchInsert2() {
        assertArrayEquals(numsExpected2, new Solution66().plusOne(numsInput2));
    }

    @Test
    public void searchInsert3() {
        assertArrayEquals(numsExpected3, new Solution66().plusOne(numsInput3));
    }

    @Test
    public void searchInsert4() {
        assertArrayEquals(numsExpected4, new Solution66().plusOne(numsInput4));
    }
}