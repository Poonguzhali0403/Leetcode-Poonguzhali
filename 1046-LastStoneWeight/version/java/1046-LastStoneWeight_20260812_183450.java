// Last updated: 8/12/2026, 6:34:50 PM
1import java.util.PriorityQueue;
2import java.util.Collections;
3
4class Solution {
5    public int lastStoneWeight(int[] stones) {
6        // Max heap to always get the heaviest stones
7        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
8        
9        for (int stone : stones) {
10            maxHeap.add(stone);
11        }
12        
13        while (maxHeap.size() > 1) {
14            int y = maxHeap.poll(); // heaviest
15            int x = maxHeap.poll(); // second heaviest
16            
17            if (y != x) {
18                maxHeap.add(y - x);
19            }
20        }
21        
22        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
23    }
24}
25