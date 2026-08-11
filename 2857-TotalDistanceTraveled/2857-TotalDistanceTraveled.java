// Last updated: 8/11/2026, 2:13:56 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        
        while (mainTank >= 5) {
            // Consume 5 liters
            distance += 50;
            mainTank -= 5;
            
            // Transfer from additional tank if possible
            if (additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        }
        
        // Consume remaining fuel
        distance += mainTank * 10;
        
        return distance;
    }
}
