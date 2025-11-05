//24. Swap Nodes in Pairs
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head), prev = dummy;
        while (prev.next != null && prev.next.next != null) {
            ListNode a = prev.next, b = a.next;
            // rewire: prev -> b -> a -> next
            a.next = b.next;
            b.next = a;
            prev.next = b;
            // advance
            prev = a;
        }
        return dummy.next;
    }
}
