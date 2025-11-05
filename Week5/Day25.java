//25. Reverse Nodes in k-Group
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        for (int i = 0; i < k; i++) {         
            if (cur == null) return head;
            cur = cur.next;
        }
       
        ListNode prev = null, p = head;
        for (int i = 0; i < k; i++) {
            ListNode nxt = p.next;
            p.next = prev;
            prev = p; p = nxt;
        }
        head.next = reverseKGroup(p, k);
        return prev; 
    }

}
