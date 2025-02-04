package org.chess.model;

import org.chess.util.ConsoleUtils;

import java.awt.*;
import java.util.Scanner;

public class Game {
    private Board board;
    private Color currentPlayer;

    public Game() {
        board = new Board();
        currentPlayer = Color.WHITE; // Blancas comienzan
    }

    // Inicia el juego
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            ConsoleUtils.clearScreen();
            board.display();
            System.out.println("Turno de: " + currentPlayer);
            System.out.print("Ingresa tu movimiento (ej: a2 a4): ");
            String input = scanner.nextLine();
            if (input.equals("salir")) break;

            try {
                String[] parts = input.split(" ");
                int fromRow = 8 - Integer.parseInt(parts[0].substring(1));
                int fromCol = parts[0].charAt(0) - 'a';
                int toRow = 8 - Integer.parseInt(parts[1].substring(1));
                int toCol = parts[1].charAt(0) - 'a';

                if (isValidMove(fromRow, fromCol, toRow, toCol)) {
                    board.movePiece(fromRow, fromCol, toRow, toCol);
                    currentPlayer = (currentPlayer == Color.WHITE) ? Color.BLACK : Color.WHITE;
                } else {
                    System.out.println("Movimiento inválido. Intenta de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Formato incorrecto. Usa 'a2 a4'.");
            }
        }
        scanner.close();
    }

    // Valida si el movimiento es válido
    private boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
        Piece piece = board.getPiece(fromRow, fromCol);
        return piece != null && piece.getColor() == currentPlayer && piece.isValidMove(toRow, toCol, board);
    }

}
