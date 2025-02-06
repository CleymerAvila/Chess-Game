package org.chess.model;

import org.chess.view.Board;

import java.awt.image.BufferedImage;

public class Bishop extends Piece{
    public Bishop(Board board, int col, int row, boolean isWhite) {
        super(board, col, row, isWhite);
        this.name = "Bishop";
        this.isWhite = isWhite;
        this.xPosition = col * board.titleSize;
        this.yPosition = row * board.titleSize;
        this.sprite = sheet.getSubimage(2*sheetScale , isWhite ? 0 : sheetScale, sheetScale, sheetScale)
                .getScaledInstance(board.titleSize, board.titleSize, BufferedImage.SCALE_SMOOTH);
    }
}
