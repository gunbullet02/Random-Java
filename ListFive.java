import java.awt.*;
import javax.swing.JFrame;

public class ListFive  extends Frame{
    
    Panel p;
    Button btnClose;
    Label lbl;
    List lst, lst2;
    Checkbox chk;
    TextField tf;
    TextArea ta;

    public ListFive(){

        super("Five Categories");
        setSize(250, 350);

        p = new Panel();

        btnClose = new Button("Close");
        lbl = new Label("This is Five Examples of my Hobbies.");
        chk = new Checkbox("Checkbox");
        
        lst = new List();
        lst.add("Programming");
        lst.add("Video Games");
        lst.add("Reading");
        lst.add("Exercise");
        lst.add("Online Courses");
        ta = new TextArea(5,20);
        

        p.add(lbl);
        p.add(chk);
        p.add(lst);
        p.add(tf);
        p.add(ta);
        p.add(btnClose);

        add(p);
        
    }
    

    public static void main(String[] args){
        ListFive test = new ListFive();
        test.setVisible(true);
    }
}