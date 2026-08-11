// Last updated: 8/11/2026, 8:36:27 PM
1class Solution {
2    public void solve(char[][] board) {
3        if (board == null || board.length == 0) return;
4        int m = board.length, n = board[0].length;
5
6        // Step 1: Mark border-connected 'O's
7        for (int i = 0; i < m; i++) {
8            dfs(board, i, 0);
9            dfs(board, i, n - 1);
10        }
11        for (int j = 0; j < n; j++) {
12            dfs(board, 0, j);
13            dfs(board, m - 1, j);
14        }
15
16        // Step 2: Flip captured and restore safe
17        for (int i = 0; i < m; i++) {
18            for (int j = 0; j < n; j++) {
19                if (board[i][j] == 'O') board[i][j] = 'X'; // captured
20                if (board[i][j] == '#') board[i][j] = 'O'; // restore safe
21            }
22        }
23    }
24
25    private void dfs(char[][] board, int i, int j) {
26        int m = board.length, n = board[0].length;
27        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != 'O') return;
28
29        board[i][j] = '#'; // mark safe
30        dfs(board, i + 1, j);
31        dfs(board, i - 1, j);
32        dfs(board, i, j + 1);
33        dfs(board, i, j - 1);
34    }
35}
36