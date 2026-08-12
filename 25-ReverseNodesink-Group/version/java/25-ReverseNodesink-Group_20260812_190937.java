// Last updated: 8/12/2026, 7:09:37 PM
1class Solution {
2    public ListNode reverseKGroup(ListNode head, int k) {
3        if (head == null || k == 1) return head;
4
5        // Dummy node to simplify edge cases
6        ListNode dummy = new ListNode(0);
7        dummy.next = head;
8
9        ListNode prevGroupEnd = dummy;
10
11        while (true) {
12            // Step 1: Find the kth node
13            ListNode kth = getKthNode(prevGroupEnd, k);
14            if (kth == null) break; // not enough nodes left
15
16            ListNode groupStart = prevGroupEnd.next;
17            ListNode nextGroupStart = kth.next;
18
19            // Step 2: Reverse the group
20            ListNode prev = kth.next;
21            ListNode curr = groupStart;
22            while (curr != nextGroupStart) {
23                ListNode temp = curr.next;
24                curr.next = prev;
25                prev = curr;
26                curr = temp;
27            }
28
29            // Step 3: Connect reversed group
30            prevGroupEnd.next = kth;
31            prevGroupEnd = groupStart;
32        }
33
34        return dummy.next;
35    }
36
37    private ListNode getKthNode(ListNode curr, int k) {
38        while (curr != null && k > 0) {
39            curr = curr.next;
40            k--;
41        }
42        return curr;
43    }
44}
45