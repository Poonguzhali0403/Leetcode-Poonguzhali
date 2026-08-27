// Last updated: 8/27/2026, 12:23:36 PM
1import java.util.*;
2
3class Solution {
4    public String removeDuplicateLetters(String s) {
5        int[] freq = new int[26]; // frequency of each char
6        boolean[] inStack = new boolean[26]; // track if char is in stack
7
8        for (char c : s.toCharArray()) {
9            freq[c - 'a']++;
10        }
11
12        Stack<Character> stack = new Stack<>();
13
14        for (char c : s.toCharArray()) {
15            freq[c - 'a']--;
16
17            if (inStack[c - 'a']) continue; // skip if already in stack
18
19            while (!stack.isEmpty() && stack.peek() > c && freq[stack.peek() - 'a'] > 0) {
20                inStack[stack.pop() - 'a'] = false;
21            }
22
23            stack.push(c);
24            inStack[c - 'a'] = true;
25        }
26
27        StringBuilder result = new StringBuilder();
28        for (char c : stack) {
29            result.append(c);
30        }
31
32        return result.toString();
33    }
34}
35