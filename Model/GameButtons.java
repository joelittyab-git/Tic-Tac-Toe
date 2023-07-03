package TicTacToe.Model;

import TicTacToe.Controller.GameWindow_EventHandler;

import javax.swing.*;
import java.awt.*;

public class GameButtons {
    //Game buttons
    public final JButton[] board = {
            new JButton("1"),
            new JButton("2"),
            new JButton("3"),
            new JButton("4"),
            new JButton("5"),
            new JButton("6"),
            new JButton("7"),
            new JButton("8"),
            new JButton("9")
    };

    GameWindow_EventHandler windowEventHandler = new GameWindow_EventHandler();

    public GameButtons(){
        board[0].setBorder(BorderFactory.createMatteBorder(0,0,7,7, Color.BLACK));
        board[1].setBorder(BorderFactory.createMatteBorder(0,7,7,7,Color.BLACK));
        board[2].setBorder(BorderFactory.createMatteBorder(0,7,7,0,Color.BLACK));
        board[3].setBorder(BorderFactory.createMatteBorder(7,0,7,7,Color.BLACK));
        board[4].setBorder(BorderFactory.createMatteBorder(7,7,7,7,Color.BLACK));
        board[5].setBorder(BorderFactory.createMatteBorder(7,7,7,0,Color.BLACK));
        board[6].setBorder(BorderFactory.createMatteBorder(7,0,0,7,Color.BLACK));
        board[7].setBorder(BorderFactory.createMatteBorder(7,7,0,7,Color.BLACK));
        board[8].setBorder(BorderFactory.createMatteBorder(7,7,0,0,Color.BLACK));


        //names
        int index = 0;
        for(int i = 1; i<=3; i++){
            for(int j = 1; j <= 3; j++){
                board[index].setName(Integer.toString(i)+ Integer.toString(j));

                //action listener
                board[index].addActionListener(windowEventHandler);

                //styling
                board[index].setBackground(Color.decode("#625BFF"));
                board[index].setFocusable(false);
                board[index].setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
                index++;
            }
        }
    }
}
