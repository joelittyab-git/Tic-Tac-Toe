package TicTacToe.View;

import TicTacToe.Model.Files;

import javax.swing.*;
import java.awt.Dimension;

public class SettingWindow extends JFrame {

    public SettingWindow(){
        setWindowConfigurations();
        setComponents();
    }

    private void setWindowConfigurations(){
        setTitle("Game Settings");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon((Files.SETTINGS_ICON_FILE).getAbsolutePath()).getImage());
        setSize(new Dimension(800,800));
    }

    private void setComponents(){
        add(new SettingsPane());
    }

}
