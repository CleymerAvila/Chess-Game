package org.chess.model;

import org.chess.view.Board;

import java.awt.image.BufferedImage;

public class Rook extends Piece{

    public Rook(Board board, int col, int row, boolean isWhite) {
        super(board, col, row, isWhite);
        this.isWhite = isWhite;
        this.name = "Rook";
        this.xPosition = col * board.titleSize;
        this.yPosition = row * board.titleSize;

        this.sprite = sheet.getSubimage(4 * sheetScale , isWhite ? 0 : sheetScale, sheetScale, sheetScale)
                .getScaledInstance(board.titleSize, board.titleSize, BufferedImage.SCALE_SMOOTH);
    }
}
