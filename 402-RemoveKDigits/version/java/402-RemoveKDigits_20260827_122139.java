// Last updated: 8/27/2026, 12:21:39 PM
1class Solution {
2    public String removeKdigits(String num, int k) {
3        if (k == num.length()) return "0";
4
5        StringBuilder stack = new StringBuilder();
6
7        for (char c : num.toCharArray()) {
8            while (k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > c) {
9                stack.deleteCharAt(stack.length() - 1);
10                k--;
11            }
12            stack.append(c);
13        }
14
15        // If k still > 0, remove from the end
16        stack.setLength(stack.length() - k);
17
18        // Remove leading zeros
19        int i = 0;
20        while (i < stack.length() && stack.charAt(i) == '0') {
21            i++;
22        }
23
24        String result = stack.substring(i);
25        return result.isEmpty() ? "0" : result;
26    }
27}
28