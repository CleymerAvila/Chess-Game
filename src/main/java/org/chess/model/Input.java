package org.chess.model;

import org.chess.model.pieces.Piece;
import org.chess.view.Board;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Input extends MouseAdapter {

    public Board board;

    public Input(Board board){
        this.board = board;
    }

    @Override
    public void mousePressed(MouseEvent e){
        int col = e.getX() / board.titleSize;
        int row = e.getY() / board.titleSize;

        Piece pieceXY = board.getPiece(col, row);

        if (pieceXY != null){
            System.out.println("Pieza seleccionada: "+ pieceXY.name + " Columna y Fila: "+ pieceXY.col +" " + pieceXY.row);
            board.selectedPiece = pieceXY;
        }
        System.out.println("Funciona mouse Presionado");

    }

    @Override
    public void mouseDragged(MouseEvent e){
        if (board.selectedPiece != null){
            board.selectedPiece.xPosition = e.getX() - board.titleSize / 2;
            board.selectedPiece.yPosition = e.getY() - board.titleSize / 2;
        }

        System.out.println("funciona mouser arrastrado");
        board.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e){
        int col = e.getX() / board.titleSize;
        int row = e.getY() / board.titleSize;

        if (board.selectedPiece != null){
            Move move = new Move(board, board.selectedPiece, col, row);
            if (board.isValidMove(move)){
                board.makeMove(move);
            } else {
                board.selectedPiece.xPosition = board.selectedPiece.col * board.titleSize;
                board.selectedPiece.yPosition = board.selectedPiece.row * board.titleSize;
            }
        }

        System.out.println("Funciona el mouse soltado!");
        board.selectedPiece = null;
        board.repaint();
    }
}
