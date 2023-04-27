public class Board
{
    private boolean[][] board;

    public Board(int n)
    {
        board = new boolean[n][n];
    }

    public int getSize()
    {
        return board.length;
    }

    public void placeQueen(int row, int col)
    {
        board[row][col] = true;
    }

    public void removeQueen(int row, int col)
    {
        board[row][col] = false;
    }

    public boolean isSafe(int row, int col)
    {
        return isSafeRow(row) && isSafeCol(col) && isSafeDiag(row, col);
    }

    private boolean isSafeRow(int row)
    {
        for (int col = 0; col < board.length; col++)
            if (board[row][col])
                return false;

        return true;
    }

    private boolean isSafeCol(int col)
    {
        for (int row = 0; row < board.length; row++)
            if (board[row][col])
                return false;

        return true;
    }

    private boolean isSafeDiag(int row, int col)
    {
        for (int i = 0; i < board.length; i++)
        {
            if (row + i < board.length && col + i < board.length)
                if (board[row + i][col + i])
                    return false;

            if (row - i >= 0 && col - i >= 0)
                if (board[row - i][col - i])
                    return false;

            if (row + i < board.length && col - i >= 0)
                if (board[row + i][col - i])
                    return false;

            if (row - i >= 0 && col + i < board.length)
                if (board[row - i][col + i])
                    return false;
        }

        return true;
    }

    public String toString()
    {
        String result = "";

        for (int row = 0; row < board.length; row++)
        {
            for (int col = 0; col < board.length; col++)
                result += board[row][col] ? "Q " : ". ";

            result += "\n";
        }

        return result;
    }
}
