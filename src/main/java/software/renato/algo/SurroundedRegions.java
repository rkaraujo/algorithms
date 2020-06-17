package software.renato.algo;

import java.util.ArrayDeque;
import java.util.Deque;

/*
Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.

Example:

X X X X
X O O X
X X O X
X O X X

After running your function, the board should be:

X X X X
X X X X
X X X X
X O X X

Explanation:

Surrounded regions shouldn’t be on the border, which means that any 'O' on the border of the board are not flipped to 'X'. Any 'O' that is not on the border and it is not connected to an 'O' on the border will be flipped to 'X'. Two cells are connected if they are adjacent cells connected horizontally or vertically.
 */
public class SurroundedRegions {

    public void solve(char[][] board) {
        if (board.length == 0) {
            return;
        }

        boolean[][] visited = new boolean[board.length][board[0].length];

        // check all connected 'O' from border columns
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'O' && !visited[i][0]) {
                checkConnected(i, 0, board, visited);
            }
            int lastColumn = board[0].length - 1;
            if (board[i][lastColumn] == 'O' && !visited[i][lastColumn]) {
                checkConnected(i, lastColumn, board, visited);
            }
        }

        // check all connected 'O' from border rows
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == 'O' && !visited[0][j]) {
                checkConnected(0, j, board, visited);
            }
            int lastRow = board.length - 1;
            if (board[lastRow][j] == 'O' && !visited[lastRow][j]) {
                checkConnected(lastRow, j, board, visited);
            }
        }

        // change all 'O' not visited
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'O' && !visited[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void checkConnected(int x, int y, char[][] board, boolean[][] visited) {
        int[][] steps = { {1, 0}, {0, 1}, {-1, 0}, {0, -1} };

        visited[x][y] = true;

        Deque<Integer[][]> coordinatesToCheck = new ArrayDeque<>();
        coordinatesToCheck.addFirst(new Integer[][] {{x, y}});

        while (!coordinatesToCheck.isEmpty()) {
            Integer[][] coordinates = coordinatesToCheck.removeLast();
            int curX = coordinates[0][0];
            int curY = coordinates[0][1];

            for (int i = 0; i < steps.length; i++) {
                int nextX = curX + steps[i][0];
                int nextY = curY + steps[i][1];

                boolean isNextXInBoard = nextX >= 0 && nextX < board.length;
                boolean isNextYInBoard = nextY >= 0 && nextY < board[0].length;

                if (isNextXInBoard && isNextYInBoard && board[nextX][nextY] == 'O' && !visited[nextX][nextY]) {
                    visited[nextX][nextY] = true;
                    coordinatesToCheck.addFirst(new Integer[][] {{nextX, nextY}});
                }
            }
        }
    }

}
