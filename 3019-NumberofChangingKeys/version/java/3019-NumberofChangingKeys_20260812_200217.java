// Last updated: 8/12/2026, 8:02:17 PM
1class Solution {
2    public int countKeyChanges(String s) {
3        int changes = 0;
4        
5        for (int i = 1; i < s.length(); i++) {
6            // Compare ignoring case
7            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i - 1))) {
8                changes++;
9            }
10        }
11        
12        return changes;
13    }
14}
15