// Last updated: 8/11/2026, 2:16:38 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq= new PriorityQueue(Collections.reverseOrder());
        for(int ele: nums)
        pq.add(ele);
        for(int i=0;i<k-1;i++)
        pq.poll();
        return pq.poll();
        
    }
}