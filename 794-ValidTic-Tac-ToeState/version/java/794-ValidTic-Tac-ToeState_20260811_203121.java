// Last updated: 8/11/2026, 8:31:21 PM
1class Solution {
2    public boolean validTicTacToe(String[] board) {
3        int xCount = 0, oCount = 0;
4        for (String row : board) {
5            for (char c : row.toCharArray()) {
6                if (c == 'X') xCount++;
7                if (c == 'O') oCount++;
8            }
9        }
10
11        // Rule 1: Turn order
12        if (oCount > xCount || xCount - oCount > 1) return false;
13
14        boolean xWin = win(board, 'X');
15        boolean oWin = win(board, 'O');
16
17        // Rule 2: Both cannot win
18        if (xWin && oWin) return false;
19
20        // Rule 3: Check counts with winner
21        if (xWin && xCount != oCount + 1) return false;
22        if (oWin && xCount != oCount) return false;
23
24        return true;
25    }
26
27    private boolean win(String[] board, char player) {
28        // Check rows
29        for (int i = 0; i < 3; i++) {
30            if (board[i].charAt(0) == player &&
31                board[i].charAt(1) == player &&
32                board[i].charAt(2) == player) return true;
33        }
34        // Check columns
35        for (int j = 0; j < 3; j++) {
36            if (board[0].charAt(j) == player &&
37                board[1].charAt(j) == player &&
38                board[2].charAt(j) == player) return true;
39        }
40        // Check diagonals
41        if (board[0].charAt(0) == player &&
42            board[1].charAt(1) == player &&
43            board[2].charAt(2) == player) return true;
44
45        if (board[0].charAt(2) == player &&
46            board[1].charAt(1) == player &&
47            board[2].charAt(0) == player) return true;
48
49        return false;
50    }
51}
52