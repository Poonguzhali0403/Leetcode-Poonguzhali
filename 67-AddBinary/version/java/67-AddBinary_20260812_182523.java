// Last updated: 8/12/2026, 6:25:23 PM
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder sb = new StringBuilder();
4        int i = a.length() - 1, j = b.length() - 1, carry = 0;
5
6        while (i >= 0 || j >= 0 || carry > 0) {
7            int x = (i >= 0) ? a.charAt(i) - '0' : 0;
8            int y = (j >= 0) ? b.charAt(j) - '0' : 0;
9
10            int sum = x + y + carry;
11            sb.append(sum % 2);   // binary digit
12            carry = sum / 2;      // update carry
13
14            i--;
15            j--;
16        }
17
18        return sb.reverse().toString();
19    }
20}
21