// Last updated: 8/12/2026, 6:02:29 PM
1import java.util.*;
2
3class Solution {
4    public int thirdMax(int[] nums) {
5        Long first = null, second = null, third = null;
6
7        for (int num : nums) {
8            long n = num;
9            if ((first != null && n == first) || 
10                (second != null && n == second) || 
11                (third != null && n == third)) {
12                continue;
13            }
14
15            if (first == null || n > first) {
16                third = second;
17                second = first;
18                first = n;
19            } else if (second == null || n > second) {
20                third = second;
21                second = n;
22            } else if (third == null || n > third) {
23                third = n;
24            }
25        }
26
27        return third == null ? first.intValue() : third.intValue();
28    }
29}
30