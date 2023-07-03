package TicTacToe.View;

import TicTacToe.Model.OptionsWindow_constants;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ResultLogDialogueBoxPane extends JPanel {
    ResultLogDialogueBoxPane(String s){
        setLayout(new GridBagLayout());
        setBorder(new LineBorder(Color.decode("#CCCCCC")));

        //Layout
        GridBagConstraints layoutConstraints = new GridBagConstraints();
        layoutConstraints.anchor = GridBagConstraints.CENTER;

        //Components
        JLabel name = new JLabel(s);
        name.setFont(OptionsWindow_constants.BUTTON_FONT);

        add(name, layoutConstraints);
    }
}
