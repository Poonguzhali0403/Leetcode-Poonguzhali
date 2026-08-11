// Last updated: 8/11/2026, 8:51:03 PM
1class Solution {
2    public int countPrimes(int n) {
3        if (n <= 2) return 0;
4
5        boolean[] isPrime = new boolean[n];
6        Arrays.fill(isPrime, true);
7        isPrime[0] = false;
8        isPrime[1] = false;
9
10        for (int i = 2; i * i < n; i++) {
11            if (isPrime[i]) {
12                for (int j = i * i; j < n; j += i) {
13                    isPrime[j] = false;
14                }
15            }
16        }
17
18        int count = 0;
19        for (int i = 2; i < n; i++) {
20            if (isPrime[i]) count++;
21        }
22
23        return count;
24    }
25}
26