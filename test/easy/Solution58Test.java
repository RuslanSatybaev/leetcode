package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution58Test {

    @Test
    public void lengthOfLastWord() {
        assertEquals(5, new Solution58().lengthOfLastWord("Hello World"));
        assertEquals(4, new Solution58().lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, new Solution58().lengthOfLastWord("luffy is still joyboy"));
        assertEquals(1, new Solution58().lengthOfLastWord("a"));
        assertEquals(3, new Solution58().lengthOfLastWord("    day"));
    }
}