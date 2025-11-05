//23. Merge k Sorted Lists
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
       if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        for (ListNode h : lists) if (h != null) pq.offer(h);

        ListNode dummy = new ListNode(0), tail = dummy;
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            tail.next = node; tail = tail.next;
            if (node.next != null) pq.offer(node.next);
        }
        return dummy.next; 
    }
}
