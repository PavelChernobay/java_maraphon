package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;

        for (int i = 0; i < 4; i++) {
            System.out.print(pawnWhite + " ");
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(rookBlack + " ");
        }
    }
}