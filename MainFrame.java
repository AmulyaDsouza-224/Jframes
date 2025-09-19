import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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

class EmployeePayslipApp extends JFrame {
    private JTextField txtName, txtEmployeeId, txtAddress, txtEmail, txtMobileNo, txtBasicPay;
    private JRadioButton rdoAssistantProf, rdoAssociateProf, rdoProfessor;
    private ButtonGroup group;

    public EmployeePayslipApp() {
        setTitle("Employee Payslip Generator");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
}



class ElecBill1 {
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
}

class FrameDemo extends JFrame {
    FrameDemo() {
        setTitle("Electricity Bill");
        setSize(320, 270);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel consId = new JLabel("Consumer ID:");
        consId.setBounds(25, 25, 120, 25);
        add(consId);

        JTextField txtId = new JTextField();
        txtId.setBounds(150, 25, 130, 25);
        add(txtId);

        JLabel consName = new JLabel("Consumer Name:");
        consName.setBounds(25, 60, 120, 25);
        add(consName);

        JTextField txtName = new JTextField();
        txtName.setBounds(150, 60, 130, 25);
        add(txtName);

        JRadioButton rdoDomestic = new JRadioButton("Domestic");
        rdoDomestic.setBounds(25, 100, 100, 25);
        add(rdoDomestic);

        JRadioButton rdoCommercial = new JRadioButton("Commercial");
        rdoCommercial.setBounds(150, 100, 120, 25);
        add(rdoCommercial);

        ButtonGroup group = new ButtonGroup();
        group.add(rdoDomestic);
        group.add(rdoCommercial);

        JLabel units = new JLabel("Units Consumed:");
        units.setBounds(25, 140, 120, 25);
        add(units);

        JTextField txtUnits = new JTextField();
        txtUnits.setBounds(150, 140, 130, 25);
        add(txtUnits);

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.setBounds(80, 185, 120, 30);
        add(btnCalculate);

        btnCalculate.addActionListener(e -> {
            try {
                String id = txtId.getText();
                String name = txtName.getText();
                String type = null;

                if (rdoDomestic.isSelected()) {
                    type = "domestic";
                } else if (rdoCommercial.isSelected()) {
                    type = "commercial";
                }

                if (id.isEmpty() || name.isEmpty() || type == null || txtUnits.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please fill all fields and select type", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int unitsConsumed = Integer.parseInt(txtUnits.getText());
                if (unitsConsumed < 0) {
                    JOptionPane.showMessageDialog(this, "Units cannot be negative", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double bill = ElecBill1.calculateBill(type, unitsConsumed);
                JOptionPane.showMessageDialog(this,
                        "Consumer ID: " + id + "\n" +
                        "Consumer Name: " + name + "\n" +
                        "Type: " + type + "\n" +
                        "Units: " + unitsConsumed + "\n" +
                        "Bill Amount: Rs. " + String.format("%.2f", bill),
                        "Electricity Bill", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter valid number for units", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        setVisible(true);
    }
}



class Calc extends JFrame implements ActionListener {
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton addButton, subButton, mulButton, divButton, equalButton, clrButton;
    char operator;
    double num1, num2, result;

    Calc() {
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

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i <= 9; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText() + i);
                return;
            }
        }

        if (e.getSource() == clrButton) {
            textField.setText("");
        } else if (e.getSource() == addButton) {
            num1 = parseInput();
            operator = '+';
            textField.setText("");
        } else if (e.getSource() == subButton) {
            num1 = parseInput();
            operator = '-';
            textField.setText("");
        } else if (e.getSource() == mulButton) {
            num1 = parseInput();
            operator = '*';
            textField.setText("");
        } else if (e.getSource() == divButton) {
            num1 = parseInput();
            operator = '/';
            textField.setText("");
        } else if (e.getSource() == equalButton) {
            try {
                num2 = parseInput();
                switch (operator) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/': 
                        if (num2 == 0) {
                            JOptionPane.showMessageDialog(this, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                            textField.setText("");
                            return;
                        }
                        result = num1 / num2; 
                        break;
                    default: return;
                }
                textField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
                textField.setText("");
            }
        }
    }

    private double parseInput() {
        String text = textField.getText();
        if (text.isEmpty()) return 0;
        return Double.parseDouble(text);
    }
}



class Registration extends JFrame {
    JTextField txtName, txtEmail;
    JPasswordField txtPassword;
    JRadioButton rdoMale, rdoFemale;
    JCheckBox chkHobby1, chkHobby2, chkHobby3;
    JComboBox<String> cmbCountry;
    JButton btnSubmit;

    Registration() {
        setTitle("Registration Form");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(30, 30, 100, 25);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(150, 30, 180, 25);
        add(txtName);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(30, 70, 100, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(150, 70, 180, 25);
        add(txtEmail);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(30, 110, 100, 25);
        add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 110, 180, 25);
        add(txtPassword);

        JLabel lblGender = new JLabel("Gender:");
        lblGender.setBounds(30, 150, 100, 25);
        add(lblGender);

        rdoMale = new JRadioButton("Male");
        rdoMale.setBounds(150, 150, 70, 25);
        rdoFemale = new JRadioButton("Female");
        rdoFemale.setBounds(230, 150, 80, 25);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rdoMale);
        genderGroup.add(rdoFemale);

        add(rdoMale);
        add(rdoFemale);

        JLabel lblHobbies = new JLabel("Hobbies:");
        lblHobbies.setBounds(30, 190, 100, 25);
        add(lblHobbies);

        chkHobby1 = new JCheckBox("Reading");
        chkHobby1.setBounds(150, 190, 80, 25);
        chkHobby2 = new JCheckBox("Sports");
        chkHobby2.setBounds(230, 190, 80, 25);
        chkHobby3 = new JCheckBox("Music");
        chkHobby3.setBounds(310, 190, 80, 25);

        add(chkHobby1);
        add(chkHobby2);
        add(chkHobby3);

        JLabel lblCountry = new JLabel("Country:");
        lblCountry.setBounds(30, 230, 100, 25);
        add(lblCountry);

        String[] countries = { "Select", "USA", "India", "UK", "Canada", "Australia" };
        cmbCountry = new JComboBox<>(countries);
        cmbCountry.setBounds(150, 230, 180, 25);
        add(cmbCountry);

        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(150, 280, 100, 30);
        add(btnSubmit);

        btnSubmit.addActionListener(e -> {
            String name = txtName.getText();
            String email = txtEmail.getText();
            String password = new String(txtPassword.getPassword());
            String gender = rdoMale.isSelected() ? "Male" : rdoFemale.isSelected() ? "Female" : "";
            String hobbies = "";
            if (chkHobby1.isSelected()) hobbies += "Reading ";
            if (chkHobby2.isSelected()) hobbies += "Sports ";
            if (chkHobby3.isSelected()) hobbies += "Music ";
            String country = (String) cmbCountry.getSelectedItem();

            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || gender.isEmpty() || country.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please fill all mandatory fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String msg = "Registration Successful!\n\n" +
                    "Name: " + name + "\n" +
                    "Email: " + email + "\n" +
                    "Gender: " + gender + "\n" +
                    "Hobbies: " + hobbies + "\n" +
                    "Country: " + country;

            JOptionPane.showMessageDialog(this, msg, "Success", JOptionPane.INFORMATION_MESSAGE);
        });

        setVisible(true);
    }
}

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Project Akilo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar mb = new JMenuBar();

        JMenu menuProjects = new JMenu("Projects");
        JMenu menuProfile = new JMenu("Profile");
        JMenu menuEdit = new JMenu("Edit");

        mb.add(menuProjects);
        mb.add(menuProfile);
        mb.add(menuEdit);

        JMenuItem miElectricityBill = new JMenuItem("Electricity Bill");
        menuProjects.add(miElectricityBill);

        JMenuItem miEmployeePayslip = new JMenuItem("Employee PaySlip");
        menuProjects.add(miEmployeePayslip);

        JMenuItem miCalculator = new JMenuItem("Calculator");
        menuProjects.add(miCalculator);

        JMenuItem miRegistrationForm = new JMenuItem("Registration form");
        menuProjects.add(miRegistrationForm);

        JMenuItem miLogin = new JMenuItem("Login");
        menuProfile.add(miLogin);

        JMenuItem miCopy = new JMenuItem("Copy");
        JMenuItem miPaste = new JMenuItem("Paste");
        menuEdit.add(miCopy);
        menuEdit.add(miPaste);

        setJMenuBar(mb);

        
        miElectricityBill.addActionListener(e -> new FrameDemo());
        miEmployeePayslip.addActionListener(e -> new EmployeePayslipApp());
        miCalculator.addActionListener(e -> new Calc());
        miRegistrationForm.addActionListener(e -> new Registration());
        miLogin.addActionListener(e -> new LogInFrame());

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
