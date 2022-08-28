import javax.swing.*;
import java.awt.event.*;

public class restau3 extends JFrame implements ActionListener{
    JLabel beverages, snacks, burgers, dessert;  
    JCheckBox icetea, juice, coffee, chocodrink, pineappledrink, wine, soda, energydrink, tea;
    JButton b;
    
    restau3()
    {
        beverages = new JLabel("beverages");
        beverages.setBounds(50, 50, 300, 20);
        icetea = new JCheckBox("icetea @50");
        icetea.setBounds(100, 100, 150, 20);
        juice = new JCheckBox("juice @30");
        juice.setBounds(100, 100, 150, 20);

        b = new JButton("order");
        b.setBounds(100, 200, 150, 20);
        b.addActionListener(this);
        add(beverages);
        add(icetea);
        add(juice);
        
        add(b);
        setSize(400, 400);
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }

    
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

    public static void main(String[] args){
        new restau3();
    }
}
