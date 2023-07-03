package TicTacToe.Model;

import TicTacToe.Model.Engine.EngineGameBoard;
import TicTacToe.Model.Player.Name;
import TicTacToe.View.ResultLogDialogueBox;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.IOException;

public class GameModel {

    //Virtual game board
    public EngineGameBoard vBoard;
    static  int n;

    private GameModel(){
        n = 0;
        vBoard = new EngineGameBoard();
    }

    public void playChance(JButton b) throws IOException, InterruptedException {


        if(vBoard.returnGameWinner(n)==0 &&Utilities.notAlreadySelected(b)){
            if(n%2==0){
                playX(b);
                ControllerMenu_constants.NAME_LABEL.setText(Name.player2.toString());
            }else{
                playY(b);
                ControllerMenu_constants.NAME_LABEL.setText(Name.player1.toString());
            }
        }else{
            try{
                AudioInputStream audioStreamer = AudioSystem.getAudioInputStream(Files.ERROR_CLICK);
                Clip audioClip = AudioSystem.getClip();
                audioClip.open(audioStreamer);
                audioClip.start();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }


        if(boxNotAlreadyPlayed(b)){
            vBoard.setvBoardVal(Integer.parseInt(Character.toString(b.getName().charAt(0)))-1, Integer.parseInt(Character.toString(b.getName().charAt(1)))-1,n);
            n++;

        }


        if(vBoard.returnGameWinner(n-1)==1) displayMessage(Name.player1+" "+Game_constants.STD_MESSAGE);



        else if(vBoard.returnGameWinner(n-1)==2) displayMessage(Name.player2 + Game_constants.STD_MESSAGE);

        else if(n==9)displayMessage(Game_constants.TIE_MESSAGE);

        System.out.println(Thread.activeCount());

    }



    private void playX(JButton b) throws IOException {
        b.setText(null);
        b.setIcon(Utilities.resizeImage(Game_constants.PATH_TO_X,150,150));
    }

    private void playY(JButton b) throws IOException {
        b.setText(null);
        b.setIcon(Utilities.resizeImage(Game_constants.PATH_TO_O, 150,150));
    }


    private void displayMessage(String message) throws InterruptedException {
        new ResultLogDialogueBox(Game_constants.currentGameFrame, message).setVisible(true);
        checkA();
    }

    private void checkA() throws InterruptedException {
        System.out.println(Thread.activeCount());
        vBoard.printBoard();
    }

    //Checks if the box is already selected using the virtual game engine board
    private boolean boxNotAlreadyPlayed(JButton b){
        return !vBoard.boxAlreadyPlayed(Integer.parseInt(Character.toString(b.getName().charAt(0)))-1,Integer.parseInt(Character.toString(b.getName().charAt(1)))-1);
    }


    public static GameModel createNewGame(){
        return new GameModel();
    }
}
