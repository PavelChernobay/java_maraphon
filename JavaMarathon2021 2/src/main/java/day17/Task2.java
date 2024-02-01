package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] board = new ChessPiece[8][8];

        board[0][0] = ChessPiece.ROOK_BLACK;
        board[0][5] = ChessPiece.ROOK_BLACK;
        board[0][6] = ChessPiece.KING_BLACK;

        board[1][1] = ChessPiece.ROOK_WHITE;
        board[1][4] = ChessPiece.PAWN_BLACK;
        board[1][5] = ChessPiece.PAWN_BLACK;
        board[1][7] = ChessPiece.PAWN_BLACK;

        board[2][0] = ChessPiece.PAWN_BLACK;
        board[2][2] = ChessPiece.KNIGHT_BLACK;
        board[2][6] = ChessPiece.PAWN_BLACK;

        board[3][0] = ChessPiece.QUEEN_BLACK;
        board[3][3] = ChessPiece.BISHOP_WHITE;

        board[4][3] = ChessPiece.BISHOP_BLACK;
        board[4][4] = ChessPiece.PAWN_WHITE;

        board[5][4] = ChessPiece.BISHOP_WHITE;
        board[5][5] = ChessPiece.PAWN_WHITE;

        board[6][0] = ChessPiece.PAWN_WHITE;
        board[6][3] = ChessPiece.QUEEN_WHITE;
        board[6][5] = ChessPiece.PAWN_WHITE;
        board[6][7] = ChessPiece.PAWN_WHITE;

        board[7][5] = ChessPiece.ROOK_WHITE;
        board[7][6] = ChessPiece.KING_WHITE;

        ChessBoard chessBoard = new ChessBoard(board);
        chessBoard.print();
    }
}
