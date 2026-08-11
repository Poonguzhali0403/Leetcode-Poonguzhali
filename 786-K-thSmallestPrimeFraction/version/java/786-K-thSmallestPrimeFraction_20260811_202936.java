// Last updated: 8/11/2026, 8:29:36 PM
1import java.util.*;
2
3class Solution {
4    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
5        int n = arr.length;
6        PriorityQueue<int[]> pq = new PriorityQueue<>(
7            (a, b) -> Double.compare((double)arr[a[0]] / arr[a[1]], (double)arr[b[0]] / arr[b[1]])
8        );
9
10        // Initialize heap with fractions arr[0]/arr[j]
11        for (int j = 1; j < n; j++) {
12            pq.offer(new int[]{0, j});
13        }
14
15        // Pop k-1 smallest fractions
16        for (int count = 0; count < k - 1; count++) {
17            int[] frac = pq.poll();
18            int i = frac[0], j = frac[1];
19            if (i + 1 < j) {
20                pq.offer(new int[]{i + 1, j});
21            }
22        }
23
24        int[] result = pq.poll();
25        return new int[]{arr[result[0]], arr[result[1]]};
26    }
27}
28