class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (char[] row : board) {
            Set<Character> seen = new HashSet<>();
            for (char cell : row) {
                if (cell != '.') {
                    if (seen.contains(cell)) {
                        return false;
                    }
                    seen.add(cell);
                }
            }
        }
        for (int col = 0; col < 9; col++) {
            Set<Character> seen = new HashSet<>();
            for (char[] row : board) {
                char cell = row[col];
                if (cell != '.') {
                    if (seen.contains(cell)) {
                        return false;
                    }
                    seen.add(cell);
                }
            }
        }
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                Set<Character> seen = new HashSet<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        char cell = board[i][j];
                        if (cell != '.') {
                            if (seen.contains(cell)) {
                                return false;
                            }
                            seen.add(cell);
                        }
                    }
                }
            }
        }
        return true;
    }
}