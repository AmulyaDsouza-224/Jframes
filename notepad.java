import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class LogInFrame extends JFrame {
    LogInFrame() {
        this.setTitle("Log In page");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        JTextField txtUserName = new JTextField();
        txtUserName.setBounds(50, 100, 200, 25);  
        this.add(txtUserName);

      
        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(50, 150, 200, 25);  
        this.add(btnLogin);

        
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                JOptionPane.showMessageDialog(btnLogin, "Username: " + txtUserName.getText());
            }
        });

       
        this.setVisible(true);
    }
}

class MainFrame {
    MainFrame() {
        JFrame frame = new JFrame();
        frame.setTitle("Main Frame");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

       
        JMenuBar mb = new JMenuBar();
        frame.setJMenuBar(mb);

        JMenu menuFile = new JMenu("File");
        mb.add(menuFile);

        JMenuItem miNew = new JMenuItem("New");
        menuFile.add(miNew);
        JMenuItem miOpen = new JMenuItem("Open");
        menuFile.add(miOpen);

      
        miNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                LogInFrame lf = new LogInFrame();  
            }
        }); 
        JMenu menuEdit = new JMenu("Edit");
        mb.add(menuEdit);
        JMenuItem miCopy = new JMenuItem("Copy");
        menuEdit.add(miCopy);
        JMenuItem miPaste = new JMenuItem("Paste");
        menuEdit.add(miPaste);

        frame.setVisible(true);
    }
}

public class project {
    public static void main(String args[]) {
        MainFrame mf = new MainFrame(); 
    }
}
