package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1342Test {

    @Test
    public void numberOfSteps() {
        assertEquals(6, new Solution1342().numberOfSteps(14));
        assertEquals(4, new Solution1342().numberOfSteps(8));
        assertEquals(12, new Solution1342().numberOfSteps(123));
        assertEquals(0, new Solution1342().numberOfSteps(0));
    }
}