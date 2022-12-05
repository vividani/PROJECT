package common;

import UserMain.UserMain;

import javax.swing.JPanel;

public class ChangePanel {
    public ChangePanel(UserMain u, JPanel p1, JPanel p2) {
        u.remove(p1);
        u.add(p2);
        u.revalidate();
        u.repaint();
    }
}
