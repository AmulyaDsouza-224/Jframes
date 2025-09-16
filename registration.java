import javax.swing.*;

public class registration{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(250,200);
        frame.setLayout(null);

         JLabel lblUsername =new JLabel("name");
        lblUsername.setBounds(25,50,100,25);
        frame.add(lblUsername);

         JTextField txtUsername= new JTextField();
        txtUsername.setBounds(125,50,100,25);
        frame.add(txtUsername);

         JLabel lblUsernamee =new JLabel("age");
        lblUsernamee.setBounds(25,75,100,25);
        frame.add(lblUsernamee);

         JTextField txtUsernamee= new JTextField();
        txtUsernamee.setBounds(125,75,100,25);
        frame.add(txtUsernamee);

            JLabel lblUsernaame =new JLabel("gender");
        lblUsernaame.setBounds(25,100,100,25);
        frame.add(lblUsernaame);

        JRadioButton rdoMale = new JRadioButton("male");
        rdoMale.setBounds(125,100,75,25);
        frame.add(rdoMale);

        JRadioButton rdoFemale = new JRadioButton("female");
        rdoFemale.setBounds(200,100,100,25);
        frame.add(rdoFemale);

        JLabel lblUsernaaame =new JLabel("education");
        lblUsernaaame.setBounds(25,125,100,25);
        frame.add(lblUsernaaame);

         JCheckBox chkGreeen = new JCheckBox("undergraduate");
        chkGreeen.setBounds(125,125,125,25);
        frame.add(chkGreeen);

        JCheckBox chkGreen = new JCheckBox("postgraduate");
        chkGreen.setBounds(250,125,125,25);
        frame.add(chkGreen);

           JLabel lblUserrnaaame =new JLabel("state");
        lblUserrnaaame.setBounds(25,150,100,25);
        frame.add(lblUserrnaaame);

         String states[] ={"Karnataka","TamilNadu","Kerala"};
        JComboBox cmbStates = new JComboBox(states);
        cmbStates.setBounds(125,150,100,25);
        frame.add(cmbStates);

        JButton btnLogin = new JButton("Submit");
        btnLogin.setBounds(25,200,100,25);
        frame.add(btnLogin);

        JButton btnLogout = new JButton("reset");
        btnLogout.setBounds(125,200,100,25);
        frame.add(btnLogout);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}