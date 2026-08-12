// Last updated: 8/12/2026, 8:45:00 PM
1import java.util.PriorityQueue;
2
3class Solution {
4    public ListNode mergeKLists(ListNode[] lists) {
5        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
6
7        for (ListNode node : lists) {
8            if (node != null) {
9                pq.offer(node);
10            }
11        }
12
13        ListNode dummy = new ListNode(0);
14        ListNode curr = dummy;
15
16        while (!pq.isEmpty()) {
17            ListNode node = pq.poll();
18            curr.next = node;
19            curr = curr.next;
20            if (node.next != null) {
21                pq.offer(node.next);
22            }
23        }
24
25        return dummy.next;
26    }
27}
28