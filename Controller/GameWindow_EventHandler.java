package TicTacToe.Controller;

import TicTacToe.Model.GameModel;

import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class GameWindow_EventHandler implements ActionListener,
                                            WindowStateListener {
    //Game model c
    GameModel gameRunner;

    public GameWindow_EventHandler(){
        gameRunner = GameModel.createNewGame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            gameRunner.playChance((JButton) e.getSource());
        } catch (IOException | InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }


    @Override
    public void windowStateChanged(WindowEvent e) {

    }
}
