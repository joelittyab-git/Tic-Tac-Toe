package TicTacToe.View;

import TicTacToe.Model.OptionsWindow_constants;
import TicTacToe.Controller.MainWindow_EventHandler;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MenuPane extends JPanel {

    private JFrame currentFrame;
    MainWindow_EventHandler eventHandler;
    public MenuPane(JFrame currentFrame){
        eventHandler = new MainWindow_EventHandler();
        this.currentFrame = currentFrame;

        //setters
        setButtonConfigurations();

        //panel constraints
        setBorder(new EmptyBorder(10,10,10,10));
        setLayout(new GridBagLayout());
        setBackground(OptionsWindow_constants.WINDOW_COLOR);

        //layout constraints
        GridBagConstraints layoutConstraints = new GridBagConstraints();
        layoutConstraints.anchor = GridBagConstraints.NORTH;
        layoutConstraints.gridwidth = GridBagConstraints.REMAINDER;
        add(OptionsWindow_constants.HEADER_LABEL, layoutConstraints);

        //Button panel
        layoutConstraints.anchor = GridBagConstraints.CENTER;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.ipady = 10;
        layoutConstraints.ipadx = 10;

        JPanel buttonPane = new JPanel(new GridBagLayout());

        buttonPane.setBackground(OptionsWindow_constants.WINDOW_COLOR);

        buttonPane.add(OptionsWindow_constants.NEW_GAME_BUTTON, layoutConstraints);
        buttonPane.add(OptionsWindow_constants.SETTING_BUTTON, layoutConstraints);
        buttonPane.add(OptionsWindow_constants.PLAYER_V_BOT, layoutConstraints);
        buttonPane.add(OptionsWindow_constants.CLOSE_BUTTON, layoutConstraints);

        layoutConstraints.weighty = 1;
        layoutConstraints.weightx = 1;

        add(buttonPane, layoutConstraints);

    }

    private void setButtonConfigurations(){
        //Text
        OptionsWindow_constants.CLOSE_BUTTON.setText("<html><i><b>CLOSE</b></i></html>");
        OptionsWindow_constants.NEW_GAME_BUTTON.setText("<html><i><b>New game</b></i></html>");
        OptionsWindow_constants.SETTING_BUTTON.setText("<html><i><b>Sample game</b></i></html>");
        OptionsWindow_constants.PLAYER_V_BOT.setText("<html><i><b>PLayer vs Bot</b></i></html>");

        //Event handler
        OptionsWindow_constants.SETTING_BUTTON.addActionListener(eventHandler);
        OptionsWindow_constants.NEW_GAME_BUTTON.addActionListener(eventHandler);
        OptionsWindow_constants.CLOSE_BUTTON.addActionListener(eventHandler);
        OptionsWindow_constants.PLAYER_V_BOT.addActionListener(eventHandler);

        //Styling
        OptionsWindow_constants.SETTING_BUTTON.setFont(OptionsWindow_constants.BUTTON_FONT);
        OptionsWindow_constants.NEW_GAME_BUTTON.setFont(OptionsWindow_constants.BUTTON_FONT);
        OptionsWindow_constants.CLOSE_BUTTON.setFont(OptionsWindow_constants.BUTTON_FONT);
        OptionsWindow_constants.PLAYER_V_BOT.setFont(OptionsWindow_constants.BUTTON_FONT);

        OptionsWindow_constants.SETTING_BUTTON.setFocusable(false);
        OptionsWindow_constants.NEW_GAME_BUTTON.setFocusable(false);
        OptionsWindow_constants.CLOSE_BUTTON.setFocusable(false);
        OptionsWindow_constants.PLAYER_V_BOT.setFocusable(false);

        OptionsWindow_constants.SETTING_BUTTON.setBackground(OptionsWindow_constants.BUTTON_COLOR);
        OptionsWindow_constants.NEW_GAME_BUTTON.setBackground(OptionsWindow_constants.BUTTON_COLOR);
        OptionsWindow_constants.CLOSE_BUTTON.setBackground(OptionsWindow_constants.BUTTON_COLOR);
        OptionsWindow_constants.PLAYER_V_BOT.setBackground(OptionsWindow_constants.BUTTON_COLOR);

        OptionsWindow_constants.SETTING_BUTTON.setPreferredSize(OptionsWindow_constants.BUTTON_DIMENSION);
        OptionsWindow_constants.NEW_GAME_BUTTON.setPreferredSize(OptionsWindow_constants.BUTTON_DIMENSION);
        OptionsWindow_constants.CLOSE_BUTTON.setPreferredSize(OptionsWindow_constants.BUTTON_DIMENSION);
        OptionsWindow_constants.PLAYER_V_BOT.setPreferredSize(OptionsWindow_constants.BUTTON_DIMENSION);

    }
}
