import javax.swing.*;

public class SwingDemo{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(550,550);
        frame.setLayout(null);

        JLabel lblUsername =new JLabel("Username");
        lblUsername.setBounds(25,50,100,25);
        frame.add(lblUsername);

        JTextField txtUsername= new JTextField();
        txtUsername.setBounds(125,50,100,25);
        frame.add(txtUsername);

        JLabel txtpassword= new JLabel("password");
        txtpassword.setBounds(25,25,100,25);
        frame.add(txtpassword);

        
        JPasswordField txtPassword = new  JPasswordField();
        txtPassword.setBounds(125,25,100,25);
        frame.add(txtPassword);

        JButton btnLogin = new JButton("login");
        btnLogin.setBounds(25,75,100,25);
        frame.add(btnLogin);

         JButton btnLogout = new JButton("cancel");
        btnLogout.setBounds(125,75,100,25);
        frame.add(btnLogout);

         JCheckBox chkGreeen = new JCheckBox("red");
        chkGreeen.setBounds(25,100,100,25);
        frame.add(chkGreeen);

        JCheckBox chkGreen = new JCheckBox("green");
        chkGreen.setBounds(25,120,100,25);
        frame.add(chkGreen);

        JRadioButton rdoMale = new JRadioButton("male");
        rdoMale.setBounds(25,150,100,25);
        frame.add(rdoMale);

        JRadioButton rdoFemale = new JRadioButton("female");
        rdoFemale.setBounds(125,150,100,25);
        frame.add(rdoFemale);
        
        ButtonGroup bg =new ButtonGroup();
        bg.add(rdoMale);
        bg.add(rdoFemale);
        
        String states[] ={"Karnataka","TamilNadu","Kerala"};
        JComboBox cmbStates = new JComboBox(states);
        cmbStates.setBounds(25,175,100,25);
        frame.add(cmbStates);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}