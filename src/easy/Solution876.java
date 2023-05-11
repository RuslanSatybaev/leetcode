package easy;

public class Solution876 {

    private static ListNode initialise() {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = new ListNode(50);
        listNode.next.next.next.next.next.next = new ListNode(15);
        listNode.next.next.next.next.next.next.next = new ListNode(25);
        return listNode;
    }

    public static void main(String[] args) {
        ListNode middleNode = new Solution876().middleNode(initialise());
        while (middleNode != null) {
            System.out.print(middleNode.val + " ");
            middleNode = middleNode.next;
        }
    }


    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
