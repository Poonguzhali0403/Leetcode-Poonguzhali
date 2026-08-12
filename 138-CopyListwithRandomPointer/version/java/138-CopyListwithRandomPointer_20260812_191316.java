// Last updated: 8/12/2026, 7:13:16 PM
1class Solution {
2    public Node copyRandomList(Node head) {
3        if (head == null) return null;
4
5        // Step 1: Insert copied nodes after each original node
6        Node curr = head;
7        while (curr != null) {
8            Node copy = new Node(curr.val);
9            copy.next = curr.next;
10            curr.next = copy;
11            curr = copy.next;
12        }
13
14        // Step 2: Assign random pointers for copied nodes
15        curr = head;
16        while (curr != null) {
17            if (curr.random != null) {
18                curr.next.random = curr.random.next;
19            }
20            curr = curr.next.next;
21        }
22
23        // Step 3: Separate original list and copied list
24        curr = head;
25        Node dummy = new Node(0);
26        Node copyCurr = dummy;
27        while (curr != null) {
28            Node copy = curr.next;
29            curr.next = copy.next;
30            copyCurr.next = copy;
31            copyCurr = copy;
32            curr = curr.next;
33        }
34
35        return dummy.next;
36    }
37}
38