public class NQueens
{
    private Board board;

    public static String solve(int n)
    {
        Board board = new Board(n);

        if (!solve(board, 0))
            return "No solution found.";

        return board.toString();
    }

    private static boolean solve(Board board, int col)
    {
        if (col >= board.getSize())
            return true;

        for (int row = 0; row < board.getSize(); row++)
            if (board.isSafe(row, col))
            {
                board.placeQueen(row, col);

                if (solve(board, col + 1))
                    return true;

                board.removeQueen(row, col);
            }

        return false;
    }
}
