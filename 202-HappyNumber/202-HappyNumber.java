// Last updated: 8/11/2026, 2:16:53 PM
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquares(slow);                 // moves 1 step
            fast = sumOfSquares(sumOfSquares(fast));   // moves 2 steps
        } while (slow != fast);

        return slow == 1;
    }

    private int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
