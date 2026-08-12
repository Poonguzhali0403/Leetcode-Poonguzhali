// Last updated: 8/12/2026, 7:11:03 PM
1class Solution {
2    public ListNode swapPairs(ListNode head) {
3        // Dummy node to simplify edge cases
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6        ListNode prev = dummy;
7
8        while (head != null && head.next != null) {
9            // Identify nodes to swap
10            ListNode first = head;
11            ListNode second = head.next;
12
13            // Perform swap
14            prev.next = second;
15            first.next = second.next;
16            second.next = first;
17
18            // Move pointers forward
19            prev = first;
20            head = first.next;
21        }
22
23        return dummy.next;
24    }
25}
26