// Last updated: 8/11/2026, 2:14:34 PM
class Solution {
    public boolean isThree(int n) {
        int root = (int)Math.sqrt(n);
        
        // Step 1: Check if n is a perfect square
        if (root * root != n) return false;
        
        // Step 2: Check if sqrt(n) is prime
        return isPrime(root);
    }
    
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
