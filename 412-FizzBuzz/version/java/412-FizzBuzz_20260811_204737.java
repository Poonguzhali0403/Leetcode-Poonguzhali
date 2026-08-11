// Last updated: 8/11/2026, 8:47:37 PM
1import java.util.*;
2
3class Solution {
4    public List<String> fizzBuzz(int n) {
5        List<String> result = new ArrayList<>();
6        
7        for (int i = 1; i <= n; i++) {
8            if (i % 3 == 0 && i % 5 == 0) {
9                result.add("FizzBuzz");
10            } else if (i % 3 == 0) {
11                result.add("Fizz");
12            } else if (i % 5 == 0) {
13                result.add("Buzz");
14            } else {
15                result.add(String.valueOf(i));
16            }
17        }
18        
19        return result;
20    }
21}
22