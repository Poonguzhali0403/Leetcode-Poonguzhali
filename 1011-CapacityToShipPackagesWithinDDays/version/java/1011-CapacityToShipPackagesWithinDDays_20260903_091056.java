// Last updated: 9/3/2026, 9:10:56 AM
1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int left = 0, right = 0;
4        for (int w : weights) {
5            left = Math.max(left, w);   // min capacity must fit largest package
6            right += w;                 // max capacity is sum of all packages
7        }
8
9        int result = right;
10        while (left <= right) {
11            int mid = left + (right - left) / 2;
12            if (canShip(weights, days, mid)) {
13                result = mid;
14                right = mid - 1; // try smaller capacity
15            } else {
16                left = mid + 1;  // need larger capacity
17            }
18        }
19        return result;
20    }
21
22    private boolean canShip(int[] weights, int days, int capacity) {
23        int usedDays = 1;
24        int currentLoad = 0;
25
26        for (int w : weights) {
27            if (currentLoad + w > capacity) {
28                usedDays++;
29                currentLoad = 0;
30            }
31            currentLoad += w;
32            if (usedDays > days) return false;
33        }
34        return true;
35    }
36}
37