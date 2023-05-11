package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution876Test {
    final Solution876 solution876 = new Solution876();
    final ListNode listNode = new ListNode();

    @Test
    public void middleNode() {
        ListNode actual = solution876.middleNode(listNode);
        ListNode expected = new ListNode(3);
        assertEquals(expected, actual);
    }

}