package org.chess.model.pieces;

import org.chess.view.Board;

import java.awt.image.BufferedImage;

public class Queen extends Piece{
    public Queen(Board board, int col, int row, boolean isWhite) {
        super(board, col, row, isWhite);
        this.name = "Queen";
        this.isWhite = isWhite;
        this.xPosition = col * board.titleSize;
        this.yPosition = row * board.titleSize;
        this.sprite = sheet.getSubimage(0, isWhite ? 0 : sheetScale, sheetScale, sheetScale)
                .getScaledInstance(board.titleSize, board.titleSize, BufferedImage.SCALE_SMOOTH);
    }
}
