import javax.swing.*;
import java.awt.event.*;

class FrameDemo extends JFrame {
    FrameDemo() {
        setTitle("Electricity Bill");
        setSize(300, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Radio buttons for type
        JRadioButton rdoDomestic = new JRadioButton("Domestic");
        rdoDomestic.setBounds(25, 25, 100, 25);
        add(rdoDomestic);

        JRadioButton rdoCommercial = new JRadioButton("Commercial");
        rdoCommercial.setBounds(150, 25, 100, 25);
        add(rdoCommercial);

        // Group them so only one can be selected
        ButtonGroup group = new ButtonGroup();
        group.add(rdoDomestic);
        group.add(rdoCommercial);

        // Label
        JLabel lblUnits = new JLabel("Number of Units:");
        lblUnits.setBounds(25, 60, 120, 25);
        add(lblUnits);

        // Text field
        JTextField txtUnits = new JTextField();
        txtUnits.setBounds(150, 60, 100, 25);
        add(txtUnits);

        // Button
        JButton btn = new JButton("Submit");
        btn.setBounds(25, 100, 225, 30);
        add(btn);

        // Action Listener
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    String type = "";
                    if (rdoDomestic.isSelected()) type = "domestic";
                    else if (rdoCommercial.isSelected()) type = "commercial";
                    else {
                        JOptionPane.showMessageDialog(null, "Please select Domestic or Commercial");
                        return;
                    }

                    int units = Integer.parseInt(txtUnits.getText());

                    double result = ElecBill.calculateBill(type, units);
                    JOptionPane.showMessageDialog(null, "Total Bill: Rs. " + result);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter valid units!");
                }
            }
        });

        setVisible(true);
    }
}

public class ElecBill {
    public static double calculateBill(String type, int units) {
        double bill = 0;

        if (type.equalsIgnoreCase("domestic")) {
            if (units <= 100) bill = units * 1;
            else if (units <= 200) bill = 100 * 1 + (units - 100) * 2.50;
            else if (units <= 500) bill = 100 * 1 + 100 * 2.50 + (units - 200) * 4;
            else bill = 100 * 1 + 100 * 2.50 + 300 * 4 + (units - 500) * 6;
        } else if (type.equalsIgnoreCase("commercial")) {
            if (units <= 100) bill = units * 2;
            else if (units <= 200) bill = 100 * 2 + (units - 100) * 4.50;
            else if (units <= 500) bill = 100 * 2 + 100 * 4.50 + (units - 200) * 6;
            else bill = 100 * 2 + 100 * 4.50 + 300 * 6 + (units - 500) * 7;
        }
        return bill;
    }

    public static void main(String[] args) {
        new FrameDemo();
    }
}
