package org.chess.model.pieces;

import org.chess.view.Board;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Piece {
    public int col;
    public  int row;
    public  int xPosition, yPosition;
    public  String name;
    public  boolean isWhite;
    public int value;

    public Piece(Board board, int col, int row, boolean isWhite ) {
        this.board = board;
        this.col = col;
        this.row = row;
        this.isWhite = isWhite;
    }

    BufferedImage sheet;
    {
        try {
            sheet = ImageIO.read(ClassLoader.getSystemResource("chesspieces.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    Board board;
    Image sprite;
    protected int sheetScale = sheet.getWidth() / 6;

    public void paint(Graphics2D g2d){
      g2d.drawImage(sprite, xPosition, yPosition, null);
    }

}
