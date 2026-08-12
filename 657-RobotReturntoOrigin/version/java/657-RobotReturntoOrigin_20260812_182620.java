// Last updated: 8/12/2026, 6:26:20 PM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int x = 0, y = 0;
4        for (char c : moves.toCharArray()) {
5            if (c == 'U') y++;
6            else if (c == 'D') y--;
7            else if (c == 'L') x--;
8            else if (c == 'R') x++;
9        }
10        return x == 0 && y == 0;
11    }
12}
13