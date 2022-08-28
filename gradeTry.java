import java.awt.*;

public class gradeTry extends Frame {
    Label lblPrelim,lblMidterm,lblFinals;
	TextField txtPrelim, txtMidterm, txtFinals;
	Button btnAverage;
    
public gradeTry()
{
    super("Grade Computation");
	setSize(300, 300);
	lblPrelim = new Label("Prelim Grade: ");
	lblMidterm = new Label("Midterm Grade: ");
	lblFinals = new Label("Finals Grade: ");
	txtPrelim = new TextField();
	txtMidterm = new TextField();
	txtFinals = new TextField();
	btnAverage = new Button("Get Average");
	setLayout(new GridLayout(5, 3));
	add(lblPrelim);
	add(txtPrelim);
	add(lblMidterm);
	add(txtMidterm);
	add(lblFinals);
	add(txtFinals);
	add(btnAverage);
}

public static void main(String[]args)
{
	gradeTry  sc = new gradeTry();
	sc.setVisible(true); 
}
}