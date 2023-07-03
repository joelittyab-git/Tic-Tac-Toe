package TicTacToe.View;


import TicTacToe.Model.ControllerMenu_constants;
import TicTacToe.Controller.Navbar_EventHandler;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class NavbarPane extends JPanel {

    Game currentFrame;
    Navbar_EventHandler eventHandler;
    public NavbarPane(Game f){

        this.currentFrame = f;

        //Element configurations
        setButtonConfigurations();

        //Panel layout
        setLayout(new GridLayout(4,1));
        setBorder(new EmptyBorder(10,10,10,10));

        //Components
        add(ControllerMenu_constants.REDO_BUTTON);
        add(ControllerMenu_constants.START_BUTTON);
        add(ControllerMenu_constants.CLOSE_BUTTON);
        add(new NavbarPane_grid4());
    }


    private void setButtonConfigurations(){
        //Event handler
        eventHandler = new Navbar_EventHandler(currentFrame);

        ControllerMenu_constants.CLOSE_BUTTON.setBackground(Color.red);
        ControllerMenu_constants.REDO_BUTTON.setBackground(Color.CYAN);
        ControllerMenu_constants.START_BUTTON.setBackground(Color.green);

        ControllerMenu_constants.START_BUTTON.setName("1");
        ControllerMenu_constants.REDO_BUTTON.setName("2");
        ControllerMenu_constants.CLOSE_BUTTON.setName("3");

        ControllerMenu_constants.START_BUTTON.addActionListener(eventHandler);
        ControllerMenu_constants.REDO_BUTTON.addActionListener(eventHandler);
        ControllerMenu_constants.CLOSE_BUTTON.addActionListener(eventHandler);


    }

}
