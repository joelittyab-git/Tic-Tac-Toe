package TicTacToe;

import TicTacToe.Model.OptionsWindow_constants;
import TicTacToe.View.MainFrame;

import javax.swing.*;
import java.awt.*;

public class CommonConstants {

    //primary Constants
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 600;
    private static final int GAME_PANEL_HEIGHT = 500;
    private static final int GAME_PANEL_WIDTH = 500;

    //Accessible constants
    public static final Dimension WINDOW_DIMENSION = new Dimension(WINDOW_WIDTH,WINDOW_HEIGHT);
    public static final BorderLayout WINDOW_LAYOUT = new BorderLayout();
    public static final String WINDOW_TITLE = "TIC TAC TOE || Board Game";
    public static final ImageIcon MAIN_ICON = new ImageIcon("C:\\Users\\joeli\\IdeaProjects\\JavaExcess\\src\\TicTacToe\\res\\img\\img.png");
    public static final Color WINDOW_COLOR = OptionsWindow_constants.WINDOW_COLOR;


    public static MainFrame currentMainFrame;

}
