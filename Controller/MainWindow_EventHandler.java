package TicTacToe.Controller;


import TicTacToe.Model.Files;
import TicTacToe.Model.OptionsWindow_constants;

import TicTacToe.Model.Utilities;
import TicTacToe.View.PlayerInfoDialogueBox;
import TicTacToe.View.SettingWindow;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class MainWindow_EventHandler extends WindowAdapter implements ActionListener {


    protected static PlayerInfoDialogueBox pldb;


    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            Utilities.runAudioFile(Files.BUTTON_CLICK_AUDIO);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        if(e.getSource()== OptionsWindow_constants.SETTING_BUTTON){
                new SettingWindow().setVisible(true);
        }
        if(e.getSource()==OptionsWindow_constants.NEW_GAME_BUTTON){
            try {
                openSampleGame();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        else if(e.getSource()==OptionsWindow_constants.CLOSE_BUTTON){
            try {
                Utilities.runAudioFile(Files.CLOSE_APPLICATION);
            } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
                ex.printStackTrace();
            }
            System.exit(0);
        }
    }

    private void openSampleGame() throws IOException {
        pldb = new PlayerInfoDialogueBox();
        pldb.setVisible(true);
    }

    @Override
    public void windowClosing(WindowEvent e){

    }
}
