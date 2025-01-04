package vista;

import javax.swing.*;

public class Inicio {
    private JPanel panelMain;
    private JPanel panelTop;
    private JPasswordField passwordField1;
    private JButton INGRESARButton;

    public JPanel getPanel1() {
        return panelMain;
    }

    public void setPanel1(JPanel panel1) {
        this.panelMain = panel1;
    }

    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    public void setPasswordField1(JPasswordField passwordField1) {
        this.passwordField1 = passwordField1;
    }
}
