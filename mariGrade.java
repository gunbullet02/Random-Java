import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mariGrade extends JFrame implements ActionListener{
    
    private static final long serialVersionUID = 1L;

    private JTextField field_Assignment_1, field_Assignment_2, field_Final, field_Midterm, field_Project_1, 
    field_Project_2, field_Q1, field_Q2, field_Q3;

    private JLabel label_Marks, label_Point;
    private JButton button;

     mariGrade()
    {
        field_Assignment_1 = new JTextField(4);
        field_Assignment_2 = new JTextField(4);
        field_Final = new JTextField(4);
        field_Midterm = new JTextField(4);
        field_Project_1 = new JTextField(4);
        field_Project_2 = new JTextField(4);
        field_Q1 = new JTextField(4);
        field_Q2 = new JTextField(4);
        field_Q3 = new JTextField(4);
        label_Marks = new JLabel("", JLabel.RIGHT);
        label_Point = new JLabel("", JLabel.RIGHT);
        button = new JButton("Process");
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        JPanel panel, subpanel;
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(9, 1));
        subpanel.add(new JLabel("Enter the value of Prelim :"));
        subpanel.add(new JLabel("Enter the value of Midterm:"));
        subpanel.add(new JLabel("Enter the value of Finals:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(9, 1));
        subpanel.add(field_Assignment_1);
        subpanel.add(field_Final);
        subpanel.add(field_Midterm);
        
        panel.add(subpanel);
        pane.add(panel, BorderLayout.NORTH);
        panel = new JPanel(new FlowLayout());
        panel.add(button);
        pane.add(panel);
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(2, 1));
        subpanel.add(new JLabel("Value of Marks:"));
        subpanel.add(new JLabel("Value of Point:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(2, 1));
        subpanel.add(label_Marks);
        subpanel.add(label_Point);
        panel.add(subpanel);
        pane.add(panel, BorderLayout.SOUTH);
        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        double Assignment_1, Assignment_2, Final, Marks, Midterm;
        double Point, Project_1, Project_2, Q1, Q2;
        double Q3;
        try {
            Assignment_1 = Double.parseDouble(field_Assignment_1.getText());
            Assignment_2 = Double.parseDouble(field_Assignment_2.getText());
            Final = Double.parseDouble(field_Final.getText());
            Midterm = Double.parseDouble(field_Midterm.getText());
            Project_1 = Double.parseDouble(field_Project_1.getText());
            Project_2 = Double.parseDouble(field_Project_2.getText());
            Q1 = Double.parseDouble(field_Q1.getText());
            Q2 = Double.parseDouble(field_Q2.getText());
            Q3 = Double.parseDouble(field_Q3.getText());
        } catch (NumberFormatException numberFormatException) {
            return;
        }
        Marks=(Q1+Q2+Q3)*0.09/3+(Project_1+Project_2)*0.3/2+(Assignment_1+Assignment_2)*0.16/2+Midterm*0.15+Final*0.3;
        Point=0;
        if(Marks>=90&&Marks<=100)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Grade: A+");
            Point=4;
        }
        if(Marks>=80&&Marks<90)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Grade: A");
            Point=4;
        }
        if(Marks>=75&&Marks<80)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Grade: A-");
            Point=3.67;
        }
        if(Marks>=70&&Marks<75)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Grade: B+");
            Point=3.33;
        }
        if(Marks>=65&&Marks<70)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Grade: B");
            Point=3;
        }
        if(Marks>=60&&Marks<65)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Grade: B-");
            Point=2.67;
        }
        if(Marks>=55&&Marks<60)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Grade: C+");
            Point=2.33;
        }
        if(Marks>=50&&Marks<55)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Grade: C");
            Point=2;
        }
        if(Marks>=45&&Marks<50)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Grade: C-");
            Point=1.67;
        }
        if(Marks>=40&&Marks<45)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Grade: D+");
            Point=1.33;
        }
        if(Marks>=35&&Marks<40)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Grade: D");
            Point=1;
        }
        if(Marks>=30&&Marks<35)
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Grade: D-");
            Point=0.37;
        }
        if(Marks<30)
            javax.swing.JOptionPane.showMessageDialog(this, "Grade: E");
        label_Marks.setText(String.valueOf(Marks));
        label_Point.setText(String.valueOf(Point));
        pack();
    }

    public static void main(String[] args){

        new mariGrade().setVisible(true);
    }
}
