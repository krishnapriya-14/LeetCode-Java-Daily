//19. Remove Nth Node From End of List
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0); dummy.next = head;

        int len = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) len++;

        int steps = len - n;
        ListNode prev = dummy;
        for (int i = 0; i < steps; i++) prev = prev.next;

        prev.next = prev.next.next;
        return dummy.next;
    }
}
