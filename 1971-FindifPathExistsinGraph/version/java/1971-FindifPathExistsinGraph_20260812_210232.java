// Last updated: 8/12/2026, 9:02:32 PM
1import java.util.*;
2
3class Solution {
4    public boolean validPath(int n, int[][] edges, int source, int destination) {
5        // Build adjacency list
6        List<List<Integer>> graph = new ArrayList<>();
7        for (int i = 0; i < n; i++) {
8            graph.add(new ArrayList<>());
9        }
10        for (int[] edge : edges) {
11            graph.get(edge[0]).add(edge[1]);
12            graph.get(edge[1]).add(edge[0]);
13        }
14
15        // BFS traversal
16        boolean[] visited = new boolean[n];
17        Queue<Integer> queue = new LinkedList<>();
18        queue.offer(source);
19        visited[source] = true;
20
21        while (!queue.isEmpty()) {
22            int node = queue.poll();
23            if (node == destination) return true;
24
25            for (int neighbor : graph.get(node)) {
26                if (!visited[neighbor]) {
27                    visited[neighbor] = true;
28                    queue.offer(neighbor);
29                }
30            }
31        }
32
33        return false;
34    }
35}
36