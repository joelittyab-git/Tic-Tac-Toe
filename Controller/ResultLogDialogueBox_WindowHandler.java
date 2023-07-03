package TicTacToe.Controller;

import TicTacToe.Model.Game_constants;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ResultLogDialogueBox_WindowHandler extends WindowAdapter {
    @Override
    public void windowClosed(WindowEvent e) {
        super.windowClosing(e);

        //close current game
        Game_constants.currentGameFrame.dispose();
    }
}
