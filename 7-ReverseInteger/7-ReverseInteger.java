// Last updated: 8/11/2026, 2:18:15 PM
class Solution {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int d = x % 10;   // extract last digit
            x = x / 10;       // remove last digit

            // Check for overflow before multiplying/adding
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0; // overflow
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0; // underflow
            }

            ans = ans * 10 + d;
        }
        return ans;
    }
}
