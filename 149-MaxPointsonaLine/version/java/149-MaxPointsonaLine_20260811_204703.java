// Last updated: 8/11/2026, 8:47:03 PM
1import java.util.*;
2
3class Solution {
4    public int maxPoints(int[][] points) {
5        if (points.length <= 2) return points.length;
6
7        int max = 0;
8
9        for (int i = 0; i < points.length; i++) {
10            Map<String, Integer> slopeMap = new HashMap<>();
11            int overlap = 0;
12            int vertical = 0;
13            int localMax = 0;
14
15            for (int j = i + 1; j < points.length; j++) {
16                int dx = points[j][0] - points[i][0];
17                int dy = points[j][1] - points[i][1];
18
19                if (dx == 0 && dy == 0) {
20                    overlap++;
21                } else if (dx == 0) {
22                    vertical++;
23                    localMax = Math.max(localMax, vertical);
24                } else {
25                    int gcd = gcd(dx, dy);
26                    dx /= gcd;
27                    dy /= gcd;
28
29                    String slope = dx + "/" + dy;
30                    slopeMap.put(slope, slopeMap.getOrDefault(slope, 0) + 1);
31                    localMax = Math.max(localMax, slopeMap.get(slope));
32                }
33            }
34
35            max = Math.max(max, localMax + overlap + 1); // +1 for the base point
36        }
37
38        return max;
39    }
40
41    private int gcd(int a, int b) {
42        if (b == 0) return a;
43        return gcd(b, a % b);
44    }
45}
46