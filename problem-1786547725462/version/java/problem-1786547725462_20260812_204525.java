// Last updated: 8/12/2026, 8:45:25 PM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int left = 0, right = arr.length - 1;
4
5        while (left < right) {
6            int mid = left + (right - left) / 2;
7
8            // If mid is less than next element, peak is on the right
9            if (arr[mid] < arr[mid + 1]) {
10                left = mid + 1;
11            } else {
12                // Peak is at mid or to the left
13                right = mid;
14            }
15        }
16
17        return left; // or right, both point to the peak
18    }
19}
20