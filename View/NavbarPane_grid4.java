package TicTacToe.View;

import TicTacToe.Model.ControllerMenu_constants;

import javax.swing.*;
import java.awt.*;

public class NavbarPane_grid4 extends JPanel{
    public NavbarPane_grid4(){
        //Declaration
        GridBagConstraints layoutConstrains = new GridBagConstraints();

        //Setters
        layoutConstrains.anchor = GridBagConstraints.CENTER;
        ControllerMenu_constants.NAME_LABEL.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        add(ControllerMenu_constants.NAME_LABEL, layoutConstrains);

        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createMatteBorder(3,3,3,3,Color.cyan));
        setBackground(new Color(144, 142, 142));

    }
}
