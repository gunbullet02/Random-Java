import java.awt.*;
import java.awt.event.*;



public class RestauMenu extends Frame implements ItemListener {

    Label Beverages,Snacks,Burger,Dessert;
    Checkbox chk1, chk2;
    TextField text1;
    Panel p;
    
    public RestauMenu(){
        super("Restaurant Menu");
        setSize(500, 500);
        Beverages = new Label("Beverages");
        chk1 = new Checkbox("Banana");
        chk2 = new Checkbox("Apple");
        Snacks = new Label("Snacks");
        Burger = new Label("Burgers");
        Dessert = new Label("Dessert");
        text1 = new TextField(20);

        p = new Panel();
        p.setLayout(new FlowLayout(FlowLayout.LEFT));
        p.add(Beverages);
        p.add(chk1);
        p.add(chk2);
        p.add(Snacks);
        p.add(Burger);
        p.add(Dessert);
        
        p.add(text1);
        add(p);

        chk1.addItemListener(this);
        chk2.addItemListener(this);

    }

    public void itemStateChanged(ItemEvent e){

        if(e.getSource() == chk1)
        {
            text1.setText((e.getStateChange() == 1? "Banna":""));
        }
        else if(e.getSource() == chk2)
        {
            text1.setText((e.getStateChange() == 1? "Apple":""));
        }
    }

    

    public static void main(String[] args){
        RestauMenu sc = new RestauMenu();
        sc.setVisible(true);
    }

    
}
