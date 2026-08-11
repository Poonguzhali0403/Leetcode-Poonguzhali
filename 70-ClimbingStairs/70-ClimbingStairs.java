// Last updated: 8/11/2026, 2:17:40 PM
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;  // base cases

        int first = 1;  // ways to reach step 1
        int second = 2; // ways to reach step 2

        for (int i = 3; i <= n; i++) {
            int third = first + second; // ways to reach current step
            first = second;
            second = third;
        }

        return second; // result for step n
    }
}
