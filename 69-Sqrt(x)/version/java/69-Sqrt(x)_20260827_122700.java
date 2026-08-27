// Last updated: 8/27/2026, 12:27:00 PM
1class Solution {
2    public int mySqrt(int x) {
3        if (x < 2) return x; // sqrt(0)=0, sqrt(1)=1
4
5        int left = 1, right = x / 2; // sqrt(x) <= x/2 for x >= 2
6        int result = 0;
7
8        while (left <= right) {
9            int mid = left + (right - left) / 2;
10            long square = (long) mid * mid; // avoid overflow
11
12            if (square == x) {
13                return mid;
14            } else if (square < x) {
15                result = mid; // candidate
16                left = mid + 1;
17            } else {
18                right = mid - 1;
19            }
20        }
21
22        return result;
23    }
24}
25