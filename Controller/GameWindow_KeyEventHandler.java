package TicTacToe.Controller;


import TicTacToe.View.BoardPane;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;


public class GameWindow_KeyEventHandler extends GameWindow_EventHandler implements KeyListener  {

    //Parent event handler
    GameWindow_EventHandler e = new GameWindow_EventHandler();

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar());
        try{
            switch (e.getKeyChar()) {
                case '1' -> gameRunner.playChance(BoardPane.getGameButtons().board[0]);
                case '2' -> gameRunner.playChance(BoardPane.getGameButtons().board[1]);
                case '3' -> gameRunner.playChance(BoardPane.getGameButtons().board[2]);
                case '4' -> gameRunner.playChance(BoardPane.getGameButtons().board[3]);
                case '5' -> gameRunner.playChance(BoardPane.getGameButtons().board[4]);
                case '6' -> gameRunner.playChance(BoardPane.getGameButtons().board[5]);
                case '7' -> gameRunner.playChance(BoardPane.getGameButtons().board[6]);
                case '8' -> gameRunner.playChance(BoardPane.getGameButtons().board[7]);
                case '9' -> gameRunner.playChance(BoardPane.getGameButtons().board[8]);
            }

        }catch (IOException | InterruptedException  exception) {
            exception.printStackTrace();
        }
    }
}
