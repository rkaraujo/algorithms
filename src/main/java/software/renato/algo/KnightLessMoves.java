package software.renato.algo;

import java.util.*;

/*
Given a square chessboard of N x N size, the position of Knight and position of a target is given.
We need to find out minimum steps a Knight will take to reach the target position.
 */
public class KnightLessMoves {

    public int solution(int boardSize, int initialRow, int initialColumn, int targetRow, int targetColumn) {
        int[] mvRow = {2, 2, 1, 1, -1, -1, -2, -2};
        int[] mvCol = {1, -1, 2, -2, 2, -2, 1, -1};

        Set<Position> visited = new HashSet<>();

        Deque<Position> posQueue = new ArrayDeque<>();
        posQueue.addFirst(new Position(initialRow, initialColumn, 0));

        while (!posQueue.isEmpty()) {
            Position curPos = posQueue.removeLast();

            if (curPos.row == targetRow && curPos.column == targetColumn) {
                return curPos.moves;
            }

            visited.add(curPos);

            for (int i = 0; i < mvRow.length; i++) {
                int nextRow = curPos.row + mvRow[i];
                int nextColumn = curPos.column + mvCol[i];
                if ((nextRow >= 0 && nextRow < boardSize) && (nextColumn >=0 && nextColumn < boardSize)) {
                    Position nextPos = new Position(nextRow, nextColumn, curPos.moves + 1);
                    if (!visited.contains(nextPos)) {
                        posQueue.addFirst(nextPos);
                    }
                }
            }
        }

        return -1;
    }

    private static class Position {
        int row;
        int column;
        int moves;

        public Position(int row, int column, int moves) {
            this.row = row;
            this.column = column;
            this.moves = moves;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position position = (Position) o;
            return row == position.row &&
                    column == position.column &&
                    moves == position.moves;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, column, moves);
        }
    }

}
