package org.chess.view;

import javax.swing.*;
import java.awt.*;
public class GameUI extends JFrame {

    public GameUI(){
        setLayout(new GridBagLayout());
        setMinimumSize(new Dimension(1000, 1000));
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(250, 224, 228));
        Board board = new Board();
        add(board);
        setVisible(true);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
