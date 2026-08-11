// Last updated: 8/11/2026, 8:46:21 PM
1class Solution {
2    public boolean isUgly(int n) {
3        if (n <= 0) return false;
4
5        int[] primes = {2, 3, 5};
6        for (int p : primes) {
7            while (n % p == 0) {
8                n /= p;
9            }
10        }
11
12        return n == 1;
13    }
14}
15