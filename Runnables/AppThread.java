package TicTacToe.Runnables;

import TicTacToe.CommonConstants;
import TicTacToe.View.MainFrame;

import javax.swing.*;

public class AppThread implements Runnable{
    private MainFrame Aoiqw_ijdh$$iu_794whw_8yg_e_8owy7tg87o_1;
    @Override
    public void run() {
        Aoiqw_ijdh$$iu_794whw_8yg_e_8owy7tg87o_1 = new MainFrame();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CommonConstants.currentMainFrame = Aoiqw_ijdh$$iu_794whw_8yg_e_8owy7tg87o_1;
                Aoiqw_ijdh$$iu_794whw_8yg_e_8owy7tg87o_1.setVisible(true);
            }
        });
    }

    public void stopRunnable(){
        Aoiqw_ijdh$$iu_794whw_8yg_e_8owy7tg87o_1.setVisible(false);
    }
}