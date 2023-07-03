package TicTacToe.Model;

import javax.swing.*;
import java.awt.*;

public class OptionsWindow_constants {

    //Primary constants
    private static final String HEADER_TEXT = "Welcome to <i>TIC-TAC-TOE<i>";

    /*
        ->Accessible constant
     */
    //window
    public static final JLabel HEADER_LABEL = new JLabel("<html><h1><b><strong>" + HEADER_TEXT + "</strong></b></h1><hr></html>");
    public static final Color WINDOW_COLOR = Color.decode("#ADD8E6");

    //Buttons
    public static final JButton SETTING_BUTTON = new JButton();
    public static final JButton NEW_GAME_BUTTON = new JButton();
    public static final JButton CLOSE_BUTTON = new JButton();
    public static final JButton PLAYER_V_BOT = new JButton();

    public static final Color BUTTON_COLOR = new Color(240,240,240);

    public static final Dimension BUTTON_DIMENSION = new Dimension(175,60);

    public static final Font BUTTON_FONT = new Font("SansSerif",Font.BOLD, 18);
}
