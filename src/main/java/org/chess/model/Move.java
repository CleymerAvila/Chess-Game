package org.chess.model;

import org.chess.model.pieces.Piece;
import org.chess.view.Board;

public class Move {

    public int fromCol, fromRow;
    public int toCol, toRow;

    public Piece piece;
    public Piece capture;

    public Move (Board board, Piece piece, int toCol, int toRow){
        this.fromCol = piece.col;
        this.fromRow = piece.row;
        this.toCol = toCol;
        this.toRow = toRow;
        this.piece = piece;
        this.capture = board.getPiece(toCol, toRow);
    }
}
