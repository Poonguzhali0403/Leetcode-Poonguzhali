// Last updated: 8/12/2026, 8:24:44 PM
1public class Solution {
2    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
3        if (headA == null || headB == null) return null;
4
5        ListNode pA = headA;
6        ListNode pB = headB;
7
8        // Traverse both lists; when one pointer reaches the end, redirect it to the other list's head
9        while (pA != pB) {
10            pA = (pA == null) ? headB : pA.next;
11            pB = (pB == null) ? headA : pB.next;
12        }
13
14        return pA; // Either intersection node or null
15    }
16}
17