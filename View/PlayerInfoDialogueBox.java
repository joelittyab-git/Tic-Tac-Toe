package TicTacToe.View;

import TicTacToe.CommonConstants;
import TicTacToe.Controller.PlayerInfoDialogueBox_EventHandler;
import TicTacToe.Model.PlayerInfoDialogueBox_constants;
import TicTacToe.Model.Utilities;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class PlayerInfoDialogueBox extends JDialog {

    private PlayerInfoDialogueBox_EventHandler eventHandler = new PlayerInfoDialogueBox_EventHandler();
    public PlayerInfoDialogueBox() throws IOException {
        setDBconfigs();
        setFieldConfig();
        setLayoutConfigs();
    }

    private void setDBconfigs(){
        setLocationRelativeTo(null);
        setTitle("Enter details");
        setIconImage(CommonConstants.MAIN_ICON.getImage());
        setSize(new Dimension(500,250));
        setResizable(false);
    }

    private void setLayoutConfigs(){
        SpringLayout layout = new SpringLayout();

        setLayout(layout);
        setBackground(CommonConstants.WINDOW_COLOR);


        add(PlayerInfoDialogueBox_constants.LABEL1);
        add(PlayerInfoDialogueBox_constants.PLAYER1);
        add(PlayerInfoDialogueBox_constants.WARNING_LABEL);
        add(PlayerInfoDialogueBox_constants.LABEL2);
        add(PlayerInfoDialogueBox_constants.PLAYER2);
        add(PlayerInfoDialogueBox_constants.SUBMIT_BUTTON);
        add(PlayerInfoDialogueBox_constants.PLAY_ANONYMOUS);

        layout.putConstraint(SpringLayout.NORTH,PlayerInfoDialogueBox_constants.LABEL1,20,SpringLayout.NORTH,this);
        layout.putConstraint(SpringLayout.WEST,PlayerInfoDialogueBox_constants.LABEL1,200,SpringLayout.EAST,this);
        layout.putConstraint(SpringLayout.NORTH, PlayerInfoDialogueBox_constants.PLAYER1,17,SpringLayout.NORTH,PlayerInfoDialogueBox_constants.LABEL1);
        layout.putConstraint(SpringLayout.WEST,PlayerInfoDialogueBox_constants.PLAYER1, 125,SpringLayout.EAST,this);

        layout.putConstraint(SpringLayout.NORTH,PlayerInfoDialogueBox_constants.LABEL2,25,SpringLayout.SOUTH,PlayerInfoDialogueBox_constants.PLAYER1);
        layout.putConstraint(SpringLayout.WEST,PlayerInfoDialogueBox_constants.LABEL2,200,SpringLayout.EAST,this);
        layout.putConstraint(SpringLayout.NORTH, PlayerInfoDialogueBox_constants.PLAYER2,17,SpringLayout.NORTH,PlayerInfoDialogueBox_constants.LABEL2);
        layout.putConstraint(SpringLayout.WEST, PlayerInfoDialogueBox_constants.PLAYER2, 125, SpringLayout.EAST, this);

        layout.putConstraint(SpringLayout.NORTH, PlayerInfoDialogueBox_constants.WARNING_LABEL, 3, SpringLayout.SOUTH,PlayerInfoDialogueBox_constants.PLAYER2);
        layout.putConstraint(SpringLayout.WEST, PlayerInfoDialogueBox_constants.WARNING_LABEL, 170, SpringLayout.EAST, this);

        layout.putConstraint(SpringLayout.NORTH,PlayerInfoDialogueBox_constants.SUBMIT_BUTTON,36,SpringLayout.SOUTH,PlayerInfoDialogueBox_constants.PLAYER2);
        layout.putConstraint(SpringLayout.WEST, PlayerInfoDialogueBox_constants.SUBMIT_BUTTON, 170,SpringLayout.EAST,this);

        layout.putConstraint(SpringLayout.NORTH, PlayerInfoDialogueBox_constants.PLAY_ANONYMOUS,0,SpringLayout.WEST,PlayerInfoDialogueBox_constants.SUBMIT_BUTTON);

    }

    private void setFieldConfig() throws IOException {
        PlayerInfoDialogueBox_constants.PLAYER1.setVisible(true);
        PlayerInfoDialogueBox_constants.PLAYER1.setEditable(true);
        PlayerInfoDialogueBox_constants.PLAYER1.setBorder(PlayerInfoDialogueBox_constants.TEXTBOX_BORDER);
        PlayerInfoDialogueBox_constants.PLAYER1.setPreferredSize(PlayerInfoDialogueBox_constants.BOX_DIMENSION);
        PlayerInfoDialogueBox_constants.PLAYER1.setEditable(true);
        PlayerInfoDialogueBox_constants.PLAYER1.addKeyListener(eventHandler);

        PlayerInfoDialogueBox_constants.LABEL1.setText("Player 1:");
        PlayerInfoDialogueBox_constants.LABEL1.setFont(PlayerInfoDialogueBox_constants.LABEL_FONT);

        PlayerInfoDialogueBox_constants.PLAYER2.setVisible(true);
        PlayerInfoDialogueBox_constants.PLAYER2.setEditable(true);
        PlayerInfoDialogueBox_constants.PLAYER2.setBorder(PlayerInfoDialogueBox_constants.TEXTBOX_BORDER);
        PlayerInfoDialogueBox_constants.PLAYER2.setPreferredSize(new Dimension(200,30));
        PlayerInfoDialogueBox_constants.PLAYER2.setEditable(true);
        PlayerInfoDialogueBox_constants.PLAYER2.addKeyListener(eventHandler);

        PlayerInfoDialogueBox_constants.LABEL2.setText("Player 2:");
        PlayerInfoDialogueBox_constants.LABEL2.setFont(PlayerInfoDialogueBox_constants.LABEL_FONT);

        PlayerInfoDialogueBox_constants.SUBMIT_BUTTON.setPreferredSize(PlayerInfoDialogueBox_constants.BUTTON_DIMENSION);
        PlayerInfoDialogueBox_constants.SUBMIT_BUTTON.setIcon((Utilities.resizeImage(PlayerInfoDialogueBox_constants.PATH_TO_SUBMIT,22,22)));
        PlayerInfoDialogueBox_constants.SUBMIT_BUTTON.setBackground(Color.WHITE);
        PlayerInfoDialogueBox_constants.SUBMIT_BUTTON.setFocusable(false);
        PlayerInfoDialogueBox_constants.SUBMIT_BUTTON.setName("submit");
        PlayerInfoDialogueBox_constants.SUBMIT_BUTTON.addActionListener(eventHandler);

        PlayerInfoDialogueBox_constants.WARNING_LABEL.setForeground(Color.RED);

        PlayerInfoDialogueBox_constants.PLAY_ANONYMOUS.setText("Play anonymous");
        PlayerInfoDialogueBox_constants.PLAY_ANONYMOUS.setFont(PlayerInfoDialogueBox_constants.LABEL_FONT);
        PlayerInfoDialogueBox_constants.PLAY_ANONYMOUS.setFocusable(false);
        PlayerInfoDialogueBox_constants.PLAY_ANONYMOUS.addItemListener(eventHandler);
        PlayerInfoDialogueBox_constants.PLAY_ANONYMOUS.setBackground(Color.WHITE);
    }

}
