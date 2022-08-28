import javax.swing.*;
import java.text.DecimalFormat;

public class PayrollSystem extends javax.swing.JFrame {

    public PayrollSystem() {
        initComponents();
    }

    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emp_name = new javax.swing.JTextField();
        department = new javax.swing.JTextField();
        id_number = new javax.swing.JTextField();
        gross_salary = new javax.swing.JTextField();
        days_work = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        compute = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        rate_per_day = new javax.swing.JTextField();
        about = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payroll System");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12));
        jLabel1.setText("Employee Name:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); 
        jLabel2.setText("Address:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); 
        jLabel3.setText("Basic Salary:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); 
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); 
        jLabel5.setText("Overtime Days:");

        id_number.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); 
        jLabel6.setText("Gross Salary:");

        compute.setFont(new java.awt.Font("Arial", 1, 14)); 
        compute.setText("Get Salary");
        compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeActionPerformed(evt);
            }
        });
        clear.setFont(new java.awt.Font("Arial", 1, 14)); 
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        quit.setFont(new java.awt.Font("Arial", 1, 14)); 
        quit.setText("Quit");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        about.setFont(new java.awt.Font("Arial", 1, 14)); 
        about.setText("Help");
        about.setActionCommand("about");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(days_work, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(id_number, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emp_name, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                            .addComponent(department)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(gross_salary, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rate_per_day, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                                .addComponent(about, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(compute)))
                .addGap(27, 27, 27)
                .addComponent(quit)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emp_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(days_work, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rate_per_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(gross_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compute)
                    .addComponent(clear)
                    .addComponent(quit)
                    .addComponent(about))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");
        days_work.getAccessibleContext().setAccessibleName("");
        jLabel6.getAccessibleContext().setAccessibleName("");

        pack();
    }

    private void computeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
       compute.setToolTipText("Click here to compute the gross salary.");
       
        DecimalFormat f = new DecimalFormat("##.00");
             if (evt.getSource().equals(compute)) {

           double no_of_days =  Double.parseDouble(days_work.getText());
        
           double rate_days =  Double.parseDouble(rate_per_day.getText());
           
           double gross_pay = (no_of_days * rate_days);
          
           gross_salary.setText(String.valueOf(" PHP " + f.format(gross_pay)));
           gross_salary.setEditable(false); 
           
    }                                       
    }
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
        clear.setToolTipText("Click here to clear the text box.");
        if (evt.getSource().equals(clear)) {
        emp_name.setText("");
        department.setText("");
        id_number.setText("");
        days_work.setText("");
        rate_per_day.setText("");
        gross_salary.setText("");
        emp_name.requestFocus();
        }
    }                                     

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {                                     
      if (evt.getSource().equals(quit)) {
        
                     
    int confirmed = JOptionPane.showConfirmDialog(null, "Exit Program?","Quit Program",JOptionPane.YES_NO_OPTION);
    if(confirmed == JOptionPane.YES_OPTION)
    {
        dispose();
    }
} else {
            
     setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       }        
    }                                    

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
        if (evt.getSource().equals(about)) {
        
                     
    int confirmed = JOptionPane.showConfirmDialog(null,"Simple Salary Computation Program","That asks for personal info of employee and computes Salary",JOptionPane.OK_OPTION);
    if(confirmed == JOptionPane.OK_OPTION)
    {
        dispose();
    }
    }                                     
    }
    /**
     * @param args 
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PayrollSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayrollSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayrollSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayrollSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayrollSystem().setVisible(true);
            }
        });
    }

                         
    private javax.swing.JButton about;
    private javax.swing.JButton clear;
    private javax.swing.JButton compute;
    private javax.swing.JTextField days_work;
    private javax.swing.JTextField department;
    private javax.swing.JTextField emp_name;
    private javax.swing.JTextField gross_salary;
    private javax.swing.JTextField id_number;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton quit;
    private javax.swing.JTextField rate_per_day;
                      
}

