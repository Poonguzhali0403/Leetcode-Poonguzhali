// Last updated: 8/11/2026, 2:17:56 PM
class Solution {
    List<List<String>> res = new ArrayList<>();
    String[][] board;

    public List<List<String>> solveNQueens(int n) {
        board = new String[n][n];
        for (String[] row : board) {
            Arrays.fill(row, ".");
        }
        backtrack(0, n);
        return res;
    }

    private void backtrack(int row, int n) {
        if (row == n) {
            // Convert board to list of strings
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(String.join("", board[i]));
            }
            res.add(temp);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(row, col, n)) {
                board[row][col] = "Q";
                backtrack(row + 1, n);
                board[row][col] = "."; // backtrack
            }
        }
    }

    private boolean isValid(int row, int col, int n) {
        // check column
        for (int i = 0; i < row; i++) {
            if (board[i][col].equals("Q")) return false;
        }

        // check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j].equals("Q")) return false;
        }

        // check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j].equals("Q")) return false;
        }

        return true;
    }
}

