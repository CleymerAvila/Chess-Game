package org.chess.model;

import java.awt.*;

public class Board {
    private Piece[][] grid; // Matriz 8x8

    public Board(){
        grid=new Piece[8][8];
        initializePieces();
    }

    private void initializePieces(){
        // Peones
        for(int col = 0; col < 8; col++){
            grid[1][col] = new Pawn(Color.BLACK, 1, col);
            grid[6][col] = new Pawn(Color.BLACK, 6, col);
        }
    }

    public boolean isEmpty(int row, int col){
        return grid[row][col] == null;
    }

    // Mueve una pieza (sin validación)
    public void movePiece(int fromRow, int fromCol, int toRow, int toCol) {
        Piece piece = grid[fromRow][fromCol];
        grid[toRow][toCol] = piece;
        grid[fromRow][fromCol] = null;
        piece.setPosition(toRow, toCol);
    }

    public Piece getPiece(int fromRow, int fromCol){
        return grid[fromRow][fromCol];
    }

    public void display() {
        System.out.println("  a b c d e f g h");
        for (int row = 0; row < 8; row++) {
            System.out.print((8 - row) + " ");
            for (int col = 0; col < 8; col++) {
                Piece piece = grid[row][col];
                String symbol = (piece == null) ? "·" : piece.getSymbol();
                System.out.print(symbol + " ");
            }
            System.out.println((8 - row));
        }
        System.out.println("  a b c d e f g h");
    }
}
