package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution383Test {

    @Test
    public void canConstruct() {
        Solution383 solution383 = new Solution383();
        assertFalse(solution383.canConstruct("a", "b"));
        assertFalse(solution383.canConstruct("aa", "ab"));
        assertTrue(solution383.canConstruct("aa", "aab"));
        assertTrue(solution383.canConstruct("aab", "baa"));
        assertTrue(solution383.canConstruct("aab", "aabcc"));
        assertFalse(solution383.canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"));
    }
}