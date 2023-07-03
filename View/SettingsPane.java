package TicTacToe.View;

import javax.swing.*;

public class SettingsPane extends JPanel {
    public SettingsPane(){
        JComboBox<JButton> GameBackground = new JComboBox<>();
        GameBackground.add("Joel",new JButton());

        add(GameBackground);
    }
}