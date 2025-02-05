package org.chess.model;

import org.chess.view.Board;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Piece {
    protected int col;
    protected int row;
    protected int xPosition, yPosition;
    protected String name;
    protected boolean isWhite;
    protected int value;

    public Piece(Board board, int col, int row, boolean isWhite ){
        this.board = board;
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
