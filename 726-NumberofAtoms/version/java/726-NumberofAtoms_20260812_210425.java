// Last updated: 8/12/2026, 9:04:25 PM
1import java.util.*;
2
3class Solution {
4    public String countOfAtoms(String formula) {
5        Stack<Map<String, Integer>> stack = new Stack<>();
6        stack.push(new HashMap<>());
7        int i = 0, n = formula.length();
8
9        while (i < n) {
10            char c = formula.charAt(i);
11
12            if (c == '(') {
13                stack.push(new HashMap<>());
14                i++;
15            } else if (c == ')') {
16                i++;
17                int start = i;
18                while (i < n && Character.isDigit(formula.charAt(i))) i++;
19                int multiplier = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;
20
21                Map<String, Integer> popped = stack.pop();
22                Map<String, Integer> top = stack.peek();
23                for (String atom : popped.keySet()) {
24                    top.put(atom, top.getOrDefault(atom, 0) + popped.get(atom) * multiplier);
25                }
26            } else {
27                // Parse atom name
28                int start = i++;
29                while (i < n && Character.isLowerCase(formula.charAt(i))) i++;
30                String atom = formula.substring(start, i);
31
32                // Parse number after atom
33                start = i;
34                while (i < n && Character.isDigit(formula.charAt(i))) i++;
35                int count = start < i ? Integer.parseInt(formula.substring(start, i)) : 1;
36
37                Map<String, Integer> top = stack.peek();
38                top.put(atom, top.getOrDefault(atom, 0) + count);
39            }
40        }
41
42        // Final map
43        Map<String, Integer> finalMap = stack.pop();
44        List<String> atoms = new ArrayList<>(finalMap.keySet());
45        Collections.sort(atoms);
46
47        StringBuilder sb = new StringBuilder();
48        for (String atom : atoms) {
49            sb.append(atom);
50            int cnt = finalMap.get(atom);
51            if (cnt > 1) sb.append(cnt);
52        }
53
54        return sb.toString();
55    }
56}
57