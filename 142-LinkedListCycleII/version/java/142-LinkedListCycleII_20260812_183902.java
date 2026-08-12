// Last updated: 8/12/2026, 6:39:02 PM
1public class Solution {
2    public ListNode detectCycle(ListNode head) {
3        if (head == null || head.next == null) return null;
4
5        ListNode slow = head;
6        ListNode fast = head;
7
8        // Step 1: Detect if a cycle exists
9        while (fast != null && fast.next != null) {
10            slow = slow.next;
11            fast = fast.next.next;
12
13            if (slow == fast) { // cycle detected
14                // Step 2: Find the cycle start
15                ListNode ptr1 = head;
16                ListNode ptr2 = slow;
17                while (ptr1 != ptr2) {
18                    ptr1 = ptr1.next;
19                    ptr2 = ptr2.next;
20                }
21                return ptr1; // cycle start node
22            }
23        }
24        return null; // no cycle
25    }
26}
27