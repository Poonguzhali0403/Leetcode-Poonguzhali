// Last updated: 8/12/2026, 7:07:16 PM
1class Solution {
2    public ListNode rotateRight(ListNode head, int k) {
3        if (head == null || head.next == null || k == 0) return head;
4
5        // Step 1: Find length of list
6        int length = 1;
7        ListNode tail = head;
8        while (tail.next != null) {
9            tail = tail.next;
10            length++;
11        }
12
13        // Step 2: Make it circular
14        tail.next = head;
15
16        // Step 3: Normalize k
17        k = k % length;
18        int stepsToNewHead = length - k;
19
20        // Step 4: Find new head
21        ListNode newTail = tail;
22        while (stepsToNewHead-- > 0) {
23            newTail = newTail.next;
24        }
25
26        // Step 5: Break the circle
27        ListNode newHead = newTail.next;
28        newTail.next = null;
29
30        return newHead;
31    }
32}
33