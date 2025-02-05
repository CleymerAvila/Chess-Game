package org.chess.model;


import org.chess.view.Board;

import java.awt.*;

public class Game {
    private Board board;
    private Color currentPlayer;

    public Game() {
        board = new Board();
        currentPlayer = Color.WHITE; // Blancas comienzan
    }


}
