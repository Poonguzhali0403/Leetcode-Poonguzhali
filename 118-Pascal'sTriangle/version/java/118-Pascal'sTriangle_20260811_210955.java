// Last updated: 8/11/2026, 9:09:55 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> generate(int numRows) {
5        List<List<Integer>> triangle = new ArrayList<>();
6
7        for (int i = 0; i < numRows; i++) {
8            List<Integer> row = new ArrayList<>();
9            row.add(1); // first element always 1
10
11            for (int j = 1; j < i; j++) {
12                int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
13                row.add(val);
14            }
15
16            if (i > 0) row.add(1); // last element always 1 (except first row)
17            triangle.add(row);
18        }
19
20        return triangle;
21    }
22}
23