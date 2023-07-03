package TicTacToe.Controller;

import TicTacToe.CommonConstants;
import TicTacToe.Model.ControllerMenu_constants;
import TicTacToe.View.Game;
import TicTacToe.View.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Navbar_EventHandler implements ActionListener {

    private Game currentFrame;

    public Navbar_EventHandler(Game f){
       currentFrame = f;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if((((JButton)e.getSource()).getName()).equals(ControllerMenu_constants.CLOSE_BUTTON_NAME)){
            currentFrame.dispose();
            currentFrame.controllerMenu.dispose();
            CommonConstants.currentMainFrame.dispose();
            new MainFrame().setVisible(true);
        }

    }
}
