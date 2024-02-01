package day17;

public class ChessBoard {
    private ChessPiece[][] board;

    public ChessBoard(ChessPiece[][] board) {
        this.board = board;
    }

    public void print() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == null) {
                    board[i][j] = ChessPiece.EMPTY;
                }
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
