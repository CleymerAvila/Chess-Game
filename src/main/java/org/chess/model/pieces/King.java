package org.chess.model.pieces;

import org.chess.view.Board;

import java.awt.image.BufferedImage;

public class King extends Piece {
    public King(Board board, int col, int row, boolean isWhite) {
        super(board, col, row, isWhite);
        this.name = "King";
        this.isWhite = isWhite;
        this.xPosition = col * board.titleSize;
        this.yPosition = row * board.titleSize;

        this.sprite = sheet.getSubimage(sheetScale , isWhite ? 0 : sheetScale, sheetScale, sheetScale)
                .getScaledInstance(board.titleSize, board.titleSize, BufferedImage.SCALE_SMOOTH);
    }
}
