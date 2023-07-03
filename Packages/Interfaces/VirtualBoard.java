package TicTacToe.Packages.Interfaces;

public interface VirtualBoard {
    public void printBoard();
    public void setvBoardVal(int row, int column, int n);
    public boolean boxAlreadyPlayed(int row, int column);
}
