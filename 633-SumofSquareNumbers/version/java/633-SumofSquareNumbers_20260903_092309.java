// Last updated: 9/3/2026, 9:23:09 AM
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        long a = 0;
4        long b = (long) Math.sqrt(c);
5
6        while (a <= b) {
7            long sum = a * a + b * b;
8            if (sum == c) {
9                return true;
10            } else if (sum < c) {
11                a++;
12            } else {
13                b--;
14            }
15        }
16        return false;
17    }
18}
19