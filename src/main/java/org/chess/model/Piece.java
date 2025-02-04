package org.chess.model;

import java.awt.*;

public abstract class Piece {
    private Color color;
    private int row;
    private int col;

    public Piece(Color color, int row, int col){
        this.color = color;
        this.row = row;
        this.col = col;
    }

    // Método abstracto para validar movimientos
    public abstract boolean isValidMove(int targetRow, int targetCol, Board board);

    public abstract String getSymbol();

    // Getters y Setters
    public Color getColor() {return color;};
    public int getRow(){return row;};
    public int getCol(){return col;};
    public void setPosition(int row, int col){
        this.row= row;
        this.col = col;
    }
}
