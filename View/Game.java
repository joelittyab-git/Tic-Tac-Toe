package TicTacToe.View;

import TicTacToe.CommonConstants;
import TicTacToe.Controller.GameWindow_KeyEventHandler;
import TicTacToe.Model.Game_constants;
import TicTacToe.Model.ControllerMenu_constants;

import javax.swing.*;
import java.awt.geom.RoundRectangle2D;

public class Game extends JFrame {

    public JDialog controllerMenu;
    private GameWindow_KeyEventHandler gameWindowKeyEventHandler = new GameWindow_KeyEventHandler();

    public Game(){
        openPopUpMenu();
        setWindowProperties();
        setWindowLayout();
        openUserEntryDialogueBox();
    }

    public Game(boolean x){
        ;
    }

    private void openPopUpMenu(){
        controllerMenu = new JDialog();
        controllerMenu.setLocation(ControllerMenu_constants.MENU_LOCATION);
        controllerMenu.setSize(ControllerMenu_constants.CONTROLLER_MENU_DIMENSION);
        controllerMenu.setContentPane(new NavbarPane(this));
        controllerMenu.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        controllerMenu.setTitle(ControllerMenu_constants.WINDOW_TITLE);
        controllerMenu.setUndecorated(true);
        controllerMenu.setShape(new RoundRectangle2D.Double(0,0,140,800,30,30));
        controllerMenu.setVisible(true);
    }

    private void setWindowProperties(){
        setSize(Game_constants.WINDOW_DIMENSION);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setTitle(CommonConstants.WINDOW_TITLE);
        setIconImage(CommonConstants.MAIN_ICON.getImage());
        setUndecorated(true);
        setShape(Game_constants.WINDOW_SHAPE);
        addKeyListener(gameWindowKeyEventHandler);

    }

    private void openUserEntryDialogueBox(){
        JDialog userEntry = new JDialog();


    }

    private void setWindowLayout(){
        add(new BoardPane());
    }


}
