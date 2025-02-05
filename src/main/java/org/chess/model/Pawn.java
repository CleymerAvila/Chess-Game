package org.chess.model;


import org.chess.view.Board;

import java.awt.image.BufferedImage;

public class Pawn extends Piece{

    public Pawn(Board board, int col, int row, boolean isWhite) {
        super(board, col, row, isWhite);
        this.name = "Pawn";
        this.isWhite = isWhite;
        this.xPosition = col * board.titleSize;
        this.yPosition = row * board.titleSize;

        this.sprite = sheet.getSubimage(5 * sheetScale , isWhite ? 0 : sheetScale, sheetScale, sheetScale)
                .getScaledInstance(board.titleSize, board.titleSize, BufferedImage.SCALE_SMOOTH);
    }
}
