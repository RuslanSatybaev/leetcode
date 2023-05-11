package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution28Test {

    @Test
    public void strStr() {
        assertEquals(0, new Solution28().strStr("sadbutsad", "sad"));
        assertEquals(-1, new Solution28().strStr("leetcode", "leeto"));
    }
}