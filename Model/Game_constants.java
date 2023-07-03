package TicTacToe.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class Game_constants {

    //Absolute paths
    public static final String PATH_TO_X = "C:\\Users\\joeli\\IdeaProjects\\JavaExcess\\src\\TicTacToe\\res\\img\\X.png";
    public static final String PATH_TO_O = "C:\\Users\\joeli\\IdeaProjects\\JavaExcess\\src\\TicTacToe\\res\\img\\O.png";


    //Window constants
    public static final Dimension WINDOW_DIMENSION = new Dimension(800,800);
    public static final RoundRectangle2D WINDOW_SHAPE = new RoundRectangle2D.Double(0,0, 800,800,45,45);

    public static JFrame currentGameFrame;
    
    //Message
    public static final String STD_MESSAGE = "Wins!!";
    public static final String TIE_MESSAGE = "The game is a tie!!";

}
