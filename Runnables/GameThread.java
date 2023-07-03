package TicTacToe.Runnables;

import TicTacToe.Model.Game_constants;
import TicTacToe.View.MainFrame;
import TicTacToe.View.Game;

import javax.swing.*;

public class GameThread implements Runnable{
    MainFrame psxf23msc824undfu98_$$ovn = new MainFrame();
    public void openGameWindow(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Game_constants.currentGameFrame = psxf23msc824undfu98_$$ovn;
                psxf23msc824undfu98_$$ovn.setVisible(true);
            }
        });
    }


    @Override
    public void run() {
        new Game().setVisible(true);
    }
}
