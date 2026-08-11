// Last updated: 8/11/2026, 2:14:10 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        // Step 1: Take as many 1s as possible
        int takeOnes = Math.min(k, numOnes);
        int sum = takeOnes;
        k -= takeOnes;
        
        // Step 2: Take zeros (no effect on sum)
        int takeZeros = Math.min(k, numZeros);
        k -= takeZeros;
        
        // Step 3: If still need items, take -1s
        int takeNegOnes = Math.min(k, numNegOnes);
        sum -= takeNegOnes;
        
        return sum;
    }
}
