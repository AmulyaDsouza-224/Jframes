import java.awt.event.*;
import javax.swing.*;
public class Calc {
    public static void main(String args[]){
        JFrame frame= new JFrame("Calculator");
        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblop1=new JLabel("operand 1");
        lblop1.setBounds(25,25,100,25);
        frame.add(lblop1);

        JTextField txtop1= new JTextField();
        txtop1.setBounds(125,25,100,25);
        frame.add(txtop1);

        JLabel lblop2=new JLabel("operand 2");
        lblop2.setBounds(25,50,100,25);
        frame.add(lblop2);

        JTextField txtop2= new JTextField();
        txtop2.setBounds(125,50,100,25);
        frame.add(txtop2);

        JButton btnAdd= new JButton("Add");
        btnAdd.setBounds(25,75,100,25);
        frame.add(btnAdd);

        JButton btnSub= new JButton("Subs");
        btnSub.setBounds(125,75,100,25);
        frame.add(btnSub);

        JButton btnmul= new JButton("Mul");
        btnmul.setBounds(225,75,100,25);
        frame.add(btnmul);

        JButton btndiv= new JButton("Div");
        btndiv.setBounds(325,75,100,25);
        frame.add(btndiv);

        JLabel lblres=new JLabel("Result");
        lblres.setBounds(25,100,100,25);
        frame.add(lblres);

        JTextField txtres= new JTextField();
        txtres.setBounds(125,100,100,25);
        frame.add(txtres);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                int op1 = Integer.parseInt(txtop1.getText());
                int op2 = Integer.parseInt(txtop2.getText());
                int result= op1+op2;
                txtres.setText(Integer.toString(result));
            }
        });

        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                int op1 = Integer.parseInt(txtop1.getText());
                int op2 = Integer.parseInt(txtop2.getText());
                int result= op1-op2;
                txtres.setText(Integer.toString(result));
            }
        });

        btnmul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                int op1 = Integer.parseInt(txtop1.getText());
                int op2 = Integer.parseInt(txtop2.getText());
                int result= op1*op2;
                txtres.setText(Integer.toString(result));
            }
        });

        btndiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                int op1 = Integer.parseInt(txtop1.getText());
                int op2 = Integer.parseInt(txtop2.getText());
                int result= op1/op2;
                txtres.setText(Integer.toString(result));
            }
        });


        frame.setVisible(true);

    }
    
}
