package TicTacToe.Model;

import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Utilities {
    public static ImageIcon resizeImage(String path, int height, int width) throws IOException {
        BufferedImage img = ImageIO.read(new File(path));
        Image icon = img.getScaledInstance(width,height, Image.SCALE_DEFAULT);

        return new ImageIcon(icon);
    }

    //checks if the spot on the screen board is selected using the onscreen board
    public static boolean notAlreadySelected(JButton button){
        return button.getIcon() == null;
    }

    public static boolean playerWon(){
        String a;
        String b;

        return false;
    }

    public static boolean checkIfNameValid(String s){
        int x = 2;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==' ')x=0;
            else{
                x+=1;
                break;
            }
        }
        return x != 0;
    }

    public static void runAudioFile(File audioFile) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
    }
}
