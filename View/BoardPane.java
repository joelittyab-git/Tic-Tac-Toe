/*
11 | 12 | 13 |
21 | 22 | 23 |
31 | 32 | 33 |
 */




package TicTacToe.View;

import TicTacToe.Model.GameButtons;
import TicTacToe.Controller.GameWindow_EventHandler;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BoardPane extends JPanel {
    private GameWindow_EventHandler windowEventHandler;
    private static GameButtons gameButtons;
    BoardPane(){
        //callers


        //_init_
        windowEventHandler = new GameWindow_EventHandler();
        gameButtons = new GameButtons();


        //Panel setters
        setVisible(true);
        setBorder(new EmptyBorder(10,10,10,10));
        setLayout(new GridLayout(3,3));

        //Components
        for(int i = 0; i<9; i++){
            add(gameButtons.board[i]);
        }

    }



    public static GameButtons getGameButtons(){
        return gameButtons;
    }
}
