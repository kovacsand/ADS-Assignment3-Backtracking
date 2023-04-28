import static org.junit.jupiter.api.Assertions.*;

class NQueensTest
{
    private Board board;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        board = new Board(4);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown()
    {
        board = null;
    }

    @org.junit.jupiter.api.Test
    void solve()
    {
        System.out.println(NQueens.solve(4));
    }
}