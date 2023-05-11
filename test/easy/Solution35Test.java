package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution35Test {
    final int[] nums = new int[]{1, 3, 5, 6};

    @Test
    public void searchInsert() {
        assertEquals(2, new Solution35().searchInsert(nums, 5));
    }

    @Test
    public void searchInsert2() {
        assertEquals(1, new Solution35().searchInsert(nums, 2));
    }

    @Test
    public void searchInsert3() {
        assertEquals(4, new Solution35().searchInsert(nums, 7));
    }
}