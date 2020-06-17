package software.renato.algo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SurroundedRegionsTest {

    private SurroundedRegions surroundedRegions = new SurroundedRegions();

    @Test
    public void solve_1() {
        char[][] board = {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };
        char[][] expected = {
                {'X','X','X','X'},
                {'X','X','X','X'},
                {'X','X','X','X'},
                {'X','O','X','X'}
        };

        surroundedRegions.solve(board);

        for (int i = 0; i < board.length; i++) {
            assertArrayEquals("row " + i, expected[i], board[i]);
        }
    }

    @Test
    public void solve_2() {
        char[][] board = {
                {'O', 'O'},
                {'O', 'O'}
        };
        char[][] expected = {
                {'O', 'O'},
                {'O', 'O'}
        };

        surroundedRegions.solve(board);

        for (int i = 0; i < board.length; i++) {
            assertArrayEquals("row " + i, expected[i], board[i]);
        }
    }
}