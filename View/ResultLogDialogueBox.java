package TicTacToe.View;


import TicTacToe.Controller.ResultLogDialogueBox_WindowHandler;

import javax.swing.*;
import java.awt.*;

public class ResultLogDialogueBox extends JDialog {

    private JFrame gameFrame ;

    public ResultLogDialogueBox(JFrame gameFrame, String s){
        this.gameFrame = gameFrame;
        setEventHandler();
        setBoxConfigurations();
        add(new ResultLogDialogueBoxPane(s));
    }

    private void setBoxConfigurations(){
        setDefaultLookAndFeelDecorated(true);
        setLocationRelativeTo(null);
        setSize(new Dimension(400,200));
    }

    private void setEventHandler(){
        addWindowStateListener(new ResultLogDialogueBox_WindowHandler());
    }
}
