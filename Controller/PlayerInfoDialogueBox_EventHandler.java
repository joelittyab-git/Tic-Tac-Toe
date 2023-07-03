package TicTacToe.Controller;

import TicTacToe.CommonConstants;
import TicTacToe.Model.Files;
import TicTacToe.Model.ControllerMenu_constants;
import TicTacToe.Model.Player.Name;
import TicTacToe.Model.PlayerInfoDialogueBox_constants;
import TicTacToe.Model.Utilities;
import TicTacToe.Runnables.GameThread;
import TicTacToe.View.Game;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class PlayerInfoDialogueBox_EventHandler implements ActionListener,
                                                            KeyListener,
                                                            ItemListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        Name.player1.delete(0,Name.player1.length());
        Name.player2.delete(0, Name.player2.length());
        if((((JButton)e.getSource()).getName()).equals(PlayerInfoDialogueBox_constants.SUBMIT_BUTTON.getName())&&
                Utilities.checkIfNameValid(PlayerInfoDialogueBox_constants.PLAYER1.getText())&&
                Utilities.checkIfNameValid(PlayerInfoDialogueBox_constants.PLAYER2.getText())&&
                !PlayerInfoDialogueBox_constants.PLAYER1.getText().equals("") &&
                !PlayerInfoDialogueBox_constants.PLAYER2.getText().equals("")){

            try {
                Utilities.runAudioFile(Files.NEW_GAME_AUDIO);
            } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
                ex.printStackTrace();
            }

            new GameThread().run();
            CommonConstants.currentMainFrame.dispose();

            Name.player1.append(PlayerInfoDialogueBox_constants.PLAYER1.getText());
            Name.player2.append(PlayerInfoDialogueBox_constants.PLAYER2.getText());

            PlayerInfoDialogueBox_constants.PLAYER1.setText(null);
            PlayerInfoDialogueBox_constants.PLAYER2.setText(null);

            System.out.println(Name.player1);
            System.out.println(Name.player2);

            ControllerMenu_constants.NAME_LABEL.setText(Name.player1.toString());

            MainWindow_EventHandler.pldb.dispose();


        }else{
            PlayerInfoDialogueBox_constants.WARNING_LABEL.setText("Enter a valid name");
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        Name.player1.delete(0,Name.player1.length());
        Name.player2.delete(0, Name.player2.length());
        if(e.getKeyCode()==10){
            if(Utilities.checkIfNameValid(PlayerInfoDialogueBox_constants.PLAYER1.getText())&&
                    Utilities.checkIfNameValid(PlayerInfoDialogueBox_constants.PLAYER2.getText())&&
                    PlayerInfoDialogueBox_constants.PLAYER1.getText()!=null &&
                    PlayerInfoDialogueBox_constants.PLAYER2.getText()!=null) {


                try {
                    Utilities.runAudioFile(Files.NEW_GAME_AUDIO);
                } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
                    throw new RuntimeException(ex);
                }


                new Game().setVisible(true);
                CommonConstants.currentMainFrame.dispose();
                Name.player1.append(PlayerInfoDialogueBox_constants.PLAYER1.getText());
                Name.player2.append(PlayerInfoDialogueBox_constants.PLAYER2.getText());

                PlayerInfoDialogueBox_constants.PLAYER1.setText(null);
                PlayerInfoDialogueBox_constants.PLAYER2.setText(null);


                System.out.println(Name.player1);
                System.out.println(Name.player2);

                MainWindow_EventHandler.pldb.dispose();


                PlayerInfoDialogueBox_constants.PLAY_ANONYMOUS.setSelected(false);


            }else{
                PlayerInfoDialogueBox_constants.WARNING_LABEL.setText("Enter a valid name");
            }
        }
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange()==ItemEvent.SELECTED){
            PlayerInfoDialogueBox_constants.PLAYER1.setText("Anonymous_"+ (int) (Math.random() * 100) +"[1]");
            PlayerInfoDialogueBox_constants.PLAYER2.setText("Anonymous_"+ (int) (Math.random() * 100) +"[2]");
        }else if(e.getStateChange()==ItemEvent.DESELECTED){
            PlayerInfoDialogueBox_constants.PLAYER1.setText("");
            PlayerInfoDialogueBox_constants.PLAYER2.setText("");
        }
    }
}
