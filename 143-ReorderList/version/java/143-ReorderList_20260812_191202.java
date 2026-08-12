// Last updated: 8/12/2026, 7:12:02 PM
1class Solution {
2    public void reorderList(ListNode head) {
3        if (head == null || head.next == null) return;
4
5        // Step 1: Find the middle of the list
6        ListNode slow = head, fast = head;
7        while (fast != null && fast.next != null) {
8            slow = slow.next;
9            fast = fast.next.next;
10        }
11
12        // Step 2: Reverse the second half
13        ListNode second = reverse(slow.next);
14        slow.next = null; // cut the list into two halves
15
16        // Step 3: Merge two halves
17        ListNode first = head;
18        while (second != null) {
19            ListNode temp1 = first.next;
20            ListNode temp2 = second.next;
21
22            first.next = second;
23            second.next = temp1;
24
25            first = temp1;
26            second = temp2;
27        }
28    }
29
30    private ListNode reverse(ListNode head) {
31        ListNode prev = null, curr = head;
32        while (curr != null) {
33            ListNode next = curr.next;
34            curr.next = prev;
35            prev = curr;
36            curr = next;
37        }
38        return prev;
39    }
40}
41