// Last updated: 8/11/2026, 9:07:53 PM
1import java.util.*;
2
3class Solution {
4    public boolean checkIfExist(int[] arr) {
5        Set<Integer> seen = new HashSet<>();
6        
7        for (int num : arr) {
8            if (seen.contains(2 * num) || (num % 2 == 0 && seen.contains(num / 2))) {
9                return true;
10            }
11            seen.add(num);
12        }
13        
14        return false;
15    }
16}
17