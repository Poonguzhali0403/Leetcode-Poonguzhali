// Last updated: 9/3/2026, 9:05:22 AM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int left = 1;
4        int right = 0;
5        for (int pile : piles) {
6            right = Math.max(right, pile);
7        }
8
9        int result = right;
10        while (left <= right) {
11            int mid = left + (right - left) / 2;
12            if (canFinish(piles, h, mid)) {
13                result = mid;
14                right = mid - 1; // try smaller speed
15            } else {
16                left = mid + 1; // need faster speed
17            }
18        }
19        return result;
20    }
21
22    private boolean canFinish(int[] piles, int h, int speed) {
23        long hours = 0;
24        for (int pile : piles) {
25            hours += (pile + speed - 1) / speed; // ceil(pile/speed)
26            if (hours > h) return false;
27        }
28        return hours <= h;
29    }
30}
31