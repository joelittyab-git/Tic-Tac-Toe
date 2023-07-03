package TicTacToe.View;


//imports
import TicTacToe.CommonConstants;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(){
        setWindowProperties();
        setLayout();
    }

    private void setWindowProperties(){
        setSize(CommonConstants.WINDOW_DIMENSION);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle(CommonConstants.WINDOW_TITLE);
        setLayout(CommonConstants.WINDOW_LAYOUT);
        setResizable(false);
        setIconImage(CommonConstants.MAIN_ICON.getImage());
    }

    private void setLayout(){
        add(new MenuPane(this), BorderLayout.CENTER);
    }


}
