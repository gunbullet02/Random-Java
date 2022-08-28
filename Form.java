import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Form extends JFrame{

    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfFirstName, tfLastName, tfAge, tfAddress, tfSex, tfOccupation, tfPIN, tfBirthday, tfCivilStatus, 
    tfCitizenship, tfmobilenum, tfEmailAdd, tfProfession, tfMonthlyIncome, tfMiddleName, tfPurpose, tfZipCode
    , tfDateOfBirth, tfPlaceOfBirth;
    JLabel lbWelcome;

    public void initialize(){

        JLabel lbFirstName = new JLabel("First Name:");
        lbFirstName.setFont(mainFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(mainFont);

        JLabel lbmiddlename = new JLabel("Middle Name:");
        lbmiddlename.setFont(mainFont);

        tfMiddleName = new JTextField();
        tfMiddleName.setFont(mainFont);

        JLabel lbLastName = new JLabel("Last Name:");
        lbLastName.setFont(mainFont);

        tfLastName = new JTextField();
        tfLastName.setFont(mainFont);

        JLabel lbAge = new JLabel("Age:");
        lbAge.setFont(mainFont);

        tfAge = new JTextField();
        tfAge.setFont(mainFont);

        JLabel lbAddress = new JLabel("Address:");
        lbAddress.setFont(mainFont);

        tfAddress = new JTextField();
        tfAddress.setFont(mainFont);

        JLabel lbzipcode = new JLabel("Zip Code:");
        lbzipcode.setFont(mainFont);

        tfZipCode = new JTextField();
        tfZipCode.setFont(mainFont);

        JLabel lbPin = new JLabel("PIN:");
        lbPin.setFont(mainFont);

        tfPIN = new JTextField();
        tfPIN.setFont(mainFont);

        JLabel lbpurpose = new JLabel("Purpose:");
        lbpurpose.setFont(mainFont);

        tfPurpose = new JTextField();
        tfPurpose.setFont(mainFont);

        JLabel lbbirthday = new JLabel("Date Of Birth:");
        lbbirthday.setFont(mainFont);

        tfBirthday= new JTextField();
        tfBirthday.setFont(mainFont);

        JLabel lbplacebirth = new JLabel("Place Of Birth:");
        lbplacebirth.setFont(mainFont);

        tfPlaceOfBirth= new JTextField();
        tfPlaceOfBirth.setFont(mainFont);

        JLabel lbsex = new JLabel("Sex:");
        lbsex.setFont(mainFont);

        tfSex= new JTextField();
        tfSex.setFont(mainFont);

        JLabel lbcivil = new JLabel("Civil Status:");
        lbcivil.setFont(mainFont);

        tfCivilStatus = new JTextField();
        tfCivilStatus.setFont(mainFont);

        JLabel lbcitizenship = new JLabel("Citizenship:");
        lbcitizenship.setFont(mainFont);

        tfCitizenship = new JTextField();
        tfCitizenship.setFont(mainFont);

        JLabel lbmobile = new JLabel("Mobile Number:");
        lbmobile.setFont(mainFont);

        tfmobilenum = new JTextField();
        tfmobilenum.setFont(mainFont);

        JLabel lbemailadd = new JLabel("Email Address:");
        lbemailadd.setFont(mainFont);

        tfEmailAdd = new JTextField();
        tfEmailAdd.setFont(mainFont);

        JLabel lbprofession = new JLabel("Profession:");
        lbprofession.setFont(mainFont);

        tfProfession = new JTextField();
        tfProfession.setFont(mainFont);

        JLabel lbmonthlyincome = new JLabel("Monthly Income:");
        lbmonthlyincome.setFont(mainFont);

        tfMonthlyIncome = new JTextField();
        tfMonthlyIncome.setFont(mainFont);


        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(18, 1, 5, 5));
        formPanel.setOpaque(false);
        formPanel.add(lbPin);
        formPanel.add(tfPIN);
        formPanel.add(lbpurpose);
        formPanel.add(tfPurpose);
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbmiddlename);
        formPanel.add(tfMiddleName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);
        formPanel.add(lbAge);
        formPanel.add(tfAge);
        formPanel.add(lbAddress);
        formPanel.add(tfAddress);
        formPanel.add(lbzipcode);
        formPanel.add(tfZipCode);
        formPanel.add(lbbirthday);
        formPanel.add(tfBirthday);
        formPanel.add(lbplacebirth);
        formPanel.add(tfPlaceOfBirth);
        formPanel.add(lbsex);
        formPanel.add(tfSex);
        formPanel.add(lbcivil);
        formPanel.add(tfCivilStatus);
        formPanel.add(lbcitizenship);
        formPanel.add(tfCitizenship);
        formPanel.add(lbmobile);
        formPanel.add(tfmobilenum);
        formPanel.add(lbemailadd);
        formPanel.add(tfEmailAdd);
        formPanel.add(lbprofession);
        formPanel.add(tfProfession);
        formPanel.add(lbmonthlyincome);
        formPanel.add(tfMonthlyIncome);

        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        JButton btnOK = new JButton("Ok");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                lbWelcome.setText("Hello " + firstName + " " + lastName);
            }

        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
                
            }


        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);

        JPanel jf = new JPanel();
        jf.setLayout(new BorderLayout());
        jf.setBackground(new Color(128, 128, 255));
        jf.add(formPanel, BorderLayout.NORTH);
        jf.add(lbWelcome, BorderLayout.CENTER);
        jf.add(buttonsPanel, BorderLayout.SOUTH);

        add(jf);

        setTitle("Form");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args){
        Form sc = new Form();
        sc.initialize();
    }
}
