// Last updated: 8/27/2026, 12:25:23 PM
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int left = 1, right = n;
7        while (left < right) {
8            int mid = left + (right - left) / 2; // avoid overflow
9            if (isBadVersion(mid)) {
10                right = mid; // bad version, move left
11            } else {
12                left = mid + 1; // good version, move right
13            }
14        }
15        return left; // or right, both are same here
16    }
17}
18