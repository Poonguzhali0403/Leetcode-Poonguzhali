// Last updated: 9/3/2026, 9:51:36 AM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3    HashMap<Integer,Integer>first=new HashMap<>();
4    HashMap<Integer,Integer>last=new HashMap<>();
5    HashMap<Integer,Integer>count=new HashMap<>();
6        for(int i=0;i<nums.length;i++){
7            int x=nums[i];
8            if(!first.containsKey(x))
9            first.put(x,i);
10            last.put(x,i);
11            count.put(x,count.getOrDefault(x,0)+1);
12        }
13        int ans=0;
14        for(int x:count.keySet()){
15            int occurances=count.get(x);
16            int blockLength=last.get(x)-first.get(x)+1;
17            if(occurances==blockLength)
18            ans++;
19        }
20        return ans;
21    }
22}