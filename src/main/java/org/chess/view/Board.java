package org.chess.view;

import org.chess.model.Pawn;
import org.chess.model.Piece;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Board extends JPanel {
    public int titleSize = 70;
    final int COLS = 8;
    final int ROWS = 8;
    ArrayList<Piece> pieces = new ArrayList<>();

    public Board(){
        this.setPreferredSize(new Dimension(titleSize * COLS, titleSize * ROWS));
        setBackground(new Color(37, 36, 34));
        addPieces();
    }

    public void addPieces(){
        for(int i= 0; i < 8; i++){
            pieces.add(new Pawn(this, i, 1, false));
        }

    }
    @Override
    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        Graphics2D g2d = (Graphics2D) graphics;

        int titleWidth = getWidth() / COLS;
        int titleHeight = getHeight() / ROWS;

        for(int r = 0; r < COLS; r++){
            for(int i= 0; i< ROWS; i++){
                g2d.setColor((r + i) % 2 == 0 ? new Color(176, 137, 104) : new Color(230, 204, 178));
                g2d.fillRect(r * titleSize, i * titleSize, titleSize, titleSize);
            }
        }

        for(Piece piece : pieces){
            piece.paint(g2d);
        }
    }
}
