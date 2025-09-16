import javax.swing.*;

public class c{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(250,200);
        frame.setLayout(null);
         JLabel lblUsername =new JLabel("operand 1");
        lblUsername.setBounds(25,50,100,25);
        frame.add(lblUsername);
         JTextField txtUsername= new JTextField();
        txtUsername.setBounds(125,50,100,25);
        frame.add(txtUsername);

         JLabel lblUsernamee =new JLabel("operand 2");
        lblUsernamee.setBounds(25,75,100,25);
        frame.add(lblUsernamee);
         JTextField txtUsernamee= new JTextField();
        txtUsernamee.setBounds(125,75,100,25);
        frame.add(txtUsernamee);
          JButton btnLogin = new JButton("add");
        btnLogin.setBounds(25,100,100,25);
        frame.add(btnLogin);
         JButton btnLogout = new JButton("sub");
        btnLogout.setBounds(125,100,100,25);
        frame.add(btnLogout);
        JButton btnLosgout = new JButton("mul");
        btnLosgout.setBounds(225,100,100,25);
        frame.add(btnLosgout);
        JButton btnLoasgout = new JButton("mul");
        btnLoasgout.setBounds(325,100,100,25);
        frame.add(btnLoasgout);
          JLabel lblUseraname =new JLabel("result");
        lblUseraname.setBounds(25,125,100,25);
        frame.add(lblUseraname);
         JTextField txtUseraname= new JTextField();
        txtUseraname.setBounds(125,125,100,25);
        frame.add(txtUseraname);


         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}