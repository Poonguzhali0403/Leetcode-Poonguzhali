// Last updated: 9/3/2026, 9:21:41 AM
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        String[] v1 = version1.split("\\.");
4        String[] v2 = version2.split("\\.");
5
6        int n1 = v1.length, n2 = v2.length;
7        int n = Math.max(n1, n2);
8
9        for (int i = 0; i < n; i++) {
10            int num1 = (i < n1) ? Integer.parseInt(v1[i]) : 0;
11            int num2 = (i < n2) ? Integer.parseInt(v2[i]) : 0;
12
13            if (num1 < num2) return -1;
14            if (num1 > num2) return 1;
15        }
16        return 0;
17    }
18}
19