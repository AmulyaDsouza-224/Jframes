import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Employee {
    String name, employeeId, address, email, mobileNo;
    double basicPay;

    public Employee(String name, String employeeId, String address, String email, String mobileNo, double basicPay) {
        this.name = name;
        this.employeeId = employeeId;
        this.address = address;
        this.email = email;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    public void generatePaySlip() {
        // To be overridden
    }
}

class AssistantProfessor extends Employee {
    public AssistantProfessor(String name, String employeeId, String address, String email, String mobileNo, double basicPay) {
        super(name, employeeId, address, email, mobileNo, basicPay);
    }

    @Override
    public void generatePaySlip() {
        double pa = 0.60 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + pa + hra;
        double deductions = pf + staffClubFund;
        double netSalary = grossSalary - deductions;

        String payslip = String.format(
            "------ Assistant Professor Pay Slip ------\n" +
            "Name: %s\nEmployee ID: %s\nAddress: %s\nEmail: %s\nMobile No: %s\n" +
            "Basic Pay: %.2f\nPA (60%%): %.2f\nHRA (10%%): %.2f\nGross Salary: %.2f\n" +
            "PF (12%%): %.2f\nStaff Club Fund (0.1%%): %.2f\nNet Salary: %.2f\n" +
            "-----------------------------------------",
            name, employeeId, address, email, mobileNo, basicPay, pa, hra, grossSalary, pf, staffClubFund, netSalary
        );

        JOptionPane.showMessageDialog(null, payslip, "Assistant Professor Pay Slip", JOptionPane.INFORMATION_MESSAGE);
    }
}

class AssociateProfessor extends Employee {
    public AssociateProfessor(String name, String employeeId, String address, String email, String mobileNo, double basicPay) {
        super(name, employeeId, address, email, mobileNo, basicPay);
    }

    @Override
    public void generatePaySlip() {
        double pa = 0.70 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + pa + hra;
        double deductions = pf + staffClubFund;
        double netSalary = grossSalary - deductions;

        String payslip = String.format(
            "------ Associate Professor Pay Slip ------\n" +
            "Name: %s\nEmployee ID: %s\nAddress: %s\nEmail: %s\nMobile No: %s\n" +
            "Basic Pay: %.2f\nPA (70%%): %.2f\nHRA (10%%): %.2f\nGross Salary: %.2f\n" +
            "PF (12%%): %.2f\nStaff Club Fund (0.1%%): %.2f\nNet Salary: %.2f\n" +
            "-----------------------------------------",
            name, employeeId, address, email, mobileNo, basicPay, pa, hra, grossSalary, pf, staffClubFund, netSalary
        );

        JOptionPane.showMessageDialog(null, payslip, "Associate Professor Pay Slip", JOptionPane.INFORMATION_MESSAGE);
    }
}

class Professor extends Employee {
    public Professor(String name, String employeeId, String address, String email, String mobileNo, double basicPay) {
        super(name, employeeId, address, email, mobileNo, basicPay);
    }

    @Override
    public void generatePaySlip() {
        double pa = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + pa + hra;
        double deductions = pf + staffClubFund;
        double netSalary = grossSalary - deductions;

        String payslip = String.format(
            "------ Professor Pay Slip ------\n" +
            "Name: %s\nEmployee ID: %s\nAddress: %s\nEmail: %s\nMobile No: %s\n" +
            "Basic Pay: %.2f\nPA (97%%): %.2f\nHRA (10%%): %.2f\nGross Salary: %.2f\n" +
            "PF (12%%): %.2f\nStaff Club Fund (0.1%%): %.2f\nNet Salary: %.2f\n" +
            "--------------------------------",
            name, employeeId, address, email, mobileNo, basicPay, pa, hra, grossSalary, pf, staffClubFund, netSalary
        );

        JOptionPane.showMessageDialog(null, payslip, "Professor Pay Slip", JOptionPane.INFORMATION_MESSAGE);
    }
}

public class EmployeePayslipApp extends JFrame {
    private JTextField txtName, txtEmployeeId, txtAddress, txtEmail, txtMobileNo, txtBasicPay;
    private JRadioButton rdoAssistantProf, rdoAssociateProf, rdoProfessor;
    private ButtonGroup group;

    public EmployeePayslipApp() {
        setTitle("Employee Payslip Generator");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Name:"));
        txtName = new JTextField(25);
        add(txtName);

        add(new JLabel("Employee ID:"));
        txtEmployeeId = new JTextField(25);
        add(txtEmployeeId);

        add(new JLabel("Address:"));
        txtAddress = new JTextField(25);
        add(txtAddress);

        add(new JLabel("Email:"));
        txtEmail = new JTextField(25);
        add(txtEmail);

        add(new JLabel("Mobile No:"));
        txtMobileNo = new JTextField(25);
        add(txtMobileNo);

        add(new JLabel("Basic Pay:"));
        txtBasicPay = new JTextField(10);
        add(txtBasicPay);

        rdoAssistantProf = new JRadioButton("Assistant Professor");
        rdoAssociateProf = new JRadioButton("Associate Professor");
        rdoProfessor = new JRadioButton("Professor");

        group = new ButtonGroup();
        group.add(rdoAssistantProf);
        group.add(rdoAssociateProf);
        group.add(rdoProfessor);

        add(rdoAssistantProf);
        add(rdoAssociateProf);
        add(rdoProfessor);

        JButton btnGeneratePayslip = new JButton("Generate Payslip");
        btnGeneratePayslip.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                generatePayslip();
            }
        });
        add(btnGeneratePayslip);

        setVisible(true);
    }

    private void generatePayslip() {
        try {
            String name = txtName.getText();
            String employeeId = txtEmployeeId.getText();
            String address = txtAddress.getText();
            String email = txtEmail.getText();
            String mobileNo = txtMobileNo.getText();
            double basicPay = Double.parseDouble(txtBasicPay.getText());

            if (name.isEmpty() || employeeId.isEmpty() || address.isEmpty() || email.isEmpty() || mobileNo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Employee employee = null;
            if (rdoAssistantProf.isSelected()) {
                employee = new AssistantProfessor(name, employeeId, address, email, mobileNo, basicPay);
            } else if (rdoAssociateProf.isSelected()) {
                employee = new AssociateProfessor(name, employeeId, address, email, mobileNo, basicPay);
            } else if (rdoProfessor.isSelected()) {
                employee = new Professor(name, employeeId, address, email, mobileNo, basicPay);
            } else {
                JOptionPane.showMessageDialog(this, "Please select employee type", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            employee.generatePaySlip();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for Basic Pay", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new EmployeePayslipApp();
    }
}
