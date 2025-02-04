package org.chess.model;

import java.awt.*;

public class Pawn extends Piece{

    public Pawn(Color color, int row, int col){
        super(color, row, col);
    }
    @Override
    public boolean isValidMove(int targetRow, int targetCol, Board board) {
        int direction = (getColor() ==Color.WHITE) ? -1 : 1; // direccion según el color de la pieza
        int startRow = getRow();

        if (targetCol == getCol() && targetRow == startRow + direction){
            return board.isEmpty(targetRow, targetCol);
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return (getColor() == Color.WHITE) ? "♙" : "♟";
    }


}
