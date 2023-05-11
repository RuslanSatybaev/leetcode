package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution26Test {

    @Test
    public void removeDuplicates() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums2 = new int[]{1, 1, 2};
        assertEquals(5, new Solution26().removeDuplicates(nums));
        assertEquals(2, new Solution26().removeDuplicates(nums2));
    }
}