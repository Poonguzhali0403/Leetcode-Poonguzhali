// Last updated: 8/11/2026, 9:05:40 PM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        for (int i = digits.length - 1; i >= 0; i--) {
4            if (digits[i] < 9) {
5                digits[i]++;
6                return digits; // no carry needed
7            }
8            digits[i] = 0; // carry over
9        }
10        
11        // If all digits were 9, we need a new array
12        int[] result = new int[digits.length + 1];
13        result[0] = 1;
14        return result;
15    }
16}
17