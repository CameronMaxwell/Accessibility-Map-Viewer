package map;

import javax.swing.*;

public class Main {
    public static void main(String[] arg) {
        LoginPage login = new LoginPage();
        login.setTitle("Login");
        login.setBounds(0, 0, 370, 280);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        login.setResizable(false);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}