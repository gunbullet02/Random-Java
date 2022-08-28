import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingCalc extends JFrame{
    
    private JButton addButton;
    private JTextField textField1;

    private JButton subButton;
    private JButton mulButton;
    private JButton divButton;
    private JTextField textField2;
    private JTextField textField3;



public static void main(String[] args){

    EventHandlingCalc sc = new EventHandlingCalc();

    sc.setTitle("Event handling Calculator");

    sc.setSize(600, 400);

    sc.setVisible(true);

    sc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public EventHandlingCalc()
{
    JPanel panel1 = new JPanel();

    addButton = new JButton("+");
    subButton = new JButton("-");
    mulButton = new JButton("*");
    divButton = new JButton("/");
    textField1 = new JTextField(20);
    textField2 = new JTextField(20);
    textField3 = new JTextField(20);

    ListenForButton listenForButton = new ListenForButton();
    addButton.addActionListener(listenForButton);
    subButton.addActionListener(listenForButton);
    mulButton.addActionListener(listenForButton);
    divButton.addActionListener(listenForButton);

    panel1.add(textField1);
    panel1.add(textField2);
    panel1.add(textField3);

    panel1.add(addButton);
    panel1.add(subButton);
    panel1.add(mulButton);
    panel1.add(divButton);

    this.add(panel1);

}

private class ListenForButton implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e){

        double number1 = 0;
        double number2 = 0;

        try{
            number1 = Double.parseDouble(textField1.getText());
            number2 = Double.parseDouble(textField2.getText());
        
        } catch(Exception error){
            error.printStackTrace();
      }

      if(e.getSource() == addButton){
          textField3.setText(number1 + number2 + "" );
      
        } else if(e.getSource() == subButton){
            textField3.setText(number1 - number2 + "");
      
        } else if(e.getSource() == mulButton){
            textField3.setText(number1 * number2 + "");
        
        } else if(e.getSource() == divButton){
            textField3.setText(number1 / number2 + "");
        }
    }
    }
}