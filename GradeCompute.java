import javax.swing.*;

public class GradeCompute {
    
    public static void main(String[] args)
    {
        String prelim1, midterm2, finals3;
        double prelim, midterm, finals;
        double result = 0;
        String cont = "n";

        do
        {
            prelim1 = JOptionPane.showInputDialog(null, "Enter your Prelim Grade: ");
            prelim = Double.parseDouble(prelim1);

            midterm2 = JOptionPane.showInputDialog(null, "Enter Midterm Grade: ");
            midterm = Double.parseDouble(midterm2);

            finals3 = JOptionPane.showInputDialog(null, "Enter your Finals Grade: ");
            finals = Double.parseDouble(finals3);

            result = (prelim * 0.30) + (midterm * 0.30) + (finals * 0.40);

            JOptionPane.showMessageDialog(null,"Final Grade: " + result  );

	            cont =	JOptionPane.showInputDialog(null,"Try Again? (press y or n) ");
                
	            }   while (cont.matches("y"));

                JOptionPane.showMessageDialog(null,"Program closing"  );
        }

}

