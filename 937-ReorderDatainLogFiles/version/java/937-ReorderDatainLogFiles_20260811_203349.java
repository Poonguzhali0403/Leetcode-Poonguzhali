// Last updated: 8/11/2026, 8:33:49 PM
1import java.util.*;
2
3class Solution {
4    public String[] reorderLogFiles(String[] logs) {
5        List<String> letterLogs = new ArrayList<>();
6        List<String> digitLogs = new ArrayList<>();
7
8        for (String log : logs) {
9            String[] parts = log.split(" ", 2);
10            if (Character.isDigit(parts[1].charAt(0))) {
11                digitLogs.add(log);
12            } else {
13                letterLogs.add(log);
14            }
15        }
16
17        Collections.sort(letterLogs, (a, b) -> {
18            String[] partsA = a.split(" ", 2);
19            String[] partsB = b.split(" ", 2);
20            int cmp = partsA[1].compareTo(partsB[1]);
21            if (cmp == 0) {
22                return partsA[0].compareTo(partsB[0]);
23            }
24            return cmp;
25        });
26
27        String[] result = new String[logs.length];
28        int idx = 0;
29        for (String log : letterLogs) result[idx++] = log;
30        for (String log : digitLogs) result[idx++] = log;
31
32        return result;
33    }
34}
35