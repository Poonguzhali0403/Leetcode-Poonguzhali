// Last updated: 8/11/2026, 2:15:40 PM
class Solution {
    public int findComplement(int num) {
     int length = Integer.toBinaryString(num).length();
        
        // Step 2: Create mask with all 1s of that length
        int mask = (1 << length) - 1;
        
        // Step 3: XOR with mask to flip bits
        return num ^ mask;
    }   
    }
