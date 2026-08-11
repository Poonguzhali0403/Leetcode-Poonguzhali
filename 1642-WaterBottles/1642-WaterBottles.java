// Last updated: 8/11/2026, 2:14:47 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drank = numBottles;   // total bottles drunk
        int empty = numBottles;   // empty bottles available

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;   // how many new bottles we can get
            drank += newBottles;                    // drink them
            empty = empty % numExchange + newBottles; // leftover empties + new empties
        }

        return drank;
    }
}
