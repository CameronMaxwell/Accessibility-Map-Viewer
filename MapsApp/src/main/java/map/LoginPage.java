package map;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginPage extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel lblUser = new JLabel("User Name");
    JLabel lblPassword = new JLabel("Password");
    JTextField txtUser = new JTextField();
    JPasswordField pwdPassword = new JPasswordField();
    JButton btnLogin = new JButton("Login");
    JButton btnReset = new JButton("Reset");

    LoginPage() {
        container.setLayout(null);
        setComponents();
        addComponents();
        addEvents();

    }

    public void setComponents() {
        lblUser.setBounds(50, 50, 100, 30);
        lblPassword.setBounds(50, 120, 100, 30);
        txtUser.setBounds(150, 50, 150, 30);
        pwdPassword.setBounds(150, 120, 150, 30);
        btnLogin.setBounds(50, 180, 100, 30);
        btnReset.setBounds(200, 180, 100, 30);
    }

    public void addComponents() {
        container.add(lblUser);
        container.add(lblPassword);
        container.add(txtUser);
        container.add(pwdPassword);
        container.add(btnLogin);
        container.add(btnReset);
    }

    public void addEvents() {
        btnLogin.addActionListener(this);
        btnReset.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            String userName = txtUser.getText();
            String passpord = pwdPassword.getText();
            if (checkUser(userName, passpord)) {
                Homepage map = new Homepage();
                setVisible(false); // Hide current frame

                JPanel p = new Homepage();
                JFrame f = new JFrame();
                f.setContentPane(p);
                f.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        }
        if (e.getSource() == btnReset) {
            txtUser.setText("");
            pwdPassword.setText("");
        }
    }

    private boolean checkUser(String user, String password) {
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mapapp",
                    "root", "root");

            PreparedStatement st = (PreparedStatement) connection
                    .prepareStatement("Select name, password from user where name=? and password=?");

            st.setString(1, user);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                dispose();
                return true;
            } else {
                return false;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return false;
    }
}
