import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Restau2 {
    JFrame myFrame = null;
    JMenuBar myItem;

    public static void main(String[] a){
        (new Restau2()).test();
    }

    private void test() {
        myFrame = new JFrame("Check Box Menu Item Test");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setBounds(50,50,250,250);
        myFrame.setContentPane(new JDesktopPane());
  
        JMenuBar myMenuBar = new JMenuBar();
        JMenu myMenu = getFileMenu();
        myMenuBar.add(myMenu);
        myMenu = getColorMenu();
        myMenuBar.add(myMenu);
        myMenu = getOptionMenu();
        myMenuBar.add(myMenu);
        myMenu = getJoshMenu();
        myMenuBar.add(myMenu);
        
      
        myFrame.setJMenuBar(myMenuBar);
        myFrame.setVisible(true);
     }

     private JMenu getFileMenu() {
        JMenu myMenu = new JMenu("Beverages");
        JCheckBoxMenuItem myItem = new JCheckBoxMenuItem("Ice Tea");
        myItem.setSelected(true);
        myMenu.add(myItem);
        JCheckBoxMenuItem myItem1 = new JCheckBoxMenuItem("Juice");
        myItem.setSelected(true);
        myMenu.add(myItem1);
        JCheckBoxMenuItem myItem2 = new JCheckBoxMenuItem("Beer");
        myItem.setSelected(true);
        myMenu.add(myItem2);
        JCheckBoxMenuItem myItem3 = new JCheckBoxMenuItem("Coffee");
        myItem.setSelected(true);
        myMenu.add(myItem3);
        JCheckBoxMenuItem myItem4 = new JCheckBoxMenuItem("Chocolate Drink");
        myItem.setSelected(true);
        myMenu.add(myItem4);
        JCheckBoxMenuItem myItem5 = new JCheckBoxMenuItem("Pineapple Drink");
        myItem.setSelected(true);
        myMenu.add(myItem5);
        JCheckBoxMenuItem myItem6 = new JCheckBoxMenuItem("Wine");
        myItem.setSelected(true);
        myMenu.add(myItem6);
        JCheckBoxMenuItem myItem7 = new JCheckBoxMenuItem("Soda");
        myItem.setSelected(true);
        myMenu.add(myItem7);
        JCheckBoxMenuItem myItem8 = new JCheckBoxMenuItem("Energy Drink");
        myItem.setSelected(true);
        myMenu.add(myItem8);
        myItem = new JCheckBoxMenuItem("Tea");
        myMenu.add(myItem);

        myMenu.addSeparator();
        
        return myMenu;
     }

     public JMenu getColorMenu() {
        JMenu myMenu = new JMenu("Snacks");
        JCheckBoxMenuItem myItem = new JCheckBoxMenuItem("Chips");
        myItem.setSelected(true);
        myMenu.add(myItem);
        JCheckBoxMenuItem myItem1 = new JCheckBoxMenuItem("Biscuits");
        myItem.setSelected(true);
        myMenu.add(myItem1);
        JCheckBoxMenuItem myItem2 = new JCheckBoxMenuItem("Fruits");
        myItem.setSelected(true);
        myMenu.add(myItem2);
        JCheckBoxMenuItem myItem3 = new JCheckBoxMenuItem("Cookies");
        myItem.setSelected(true);
        myMenu.add(myItem3);
        JCheckBoxMenuItem myItem4 = new JCheckBoxMenuItem("Bars");
        myItem.setSelected(true);
        myMenu.add(myItem4);
        JCheckBoxMenuItem myItem5 = new JCheckBoxMenuItem("Sandwiches");
        myItem.setSelected(true);
        myMenu.add(myItem5);
        JCheckBoxMenuItem myItem6 = new JCheckBoxMenuItem("Crackers");
        myItem.setSelected(true);
        myMenu.add(myItem6);
        JCheckBoxMenuItem myItem7 = new JCheckBoxMenuItem("Crisps");
        myItem.setSelected(true);
        myMenu.add(myItem7);
        JCheckBoxMenuItem myItem8 = new JCheckBoxMenuItem("Candy");
        myItem.setSelected(true);
        myMenu.add(myItem8);
        myItem = new JCheckBoxMenuItem("Chocolate");
        myMenu.add(myItem);
        return myMenu;
     }

     private JMenu getOptionMenu() {
        JMenu myMenu = new JMenu("Burger");
        JCheckBoxMenuItem myItem = new JCheckBoxMenuItem("Egg Sandwich");
        myItem.setSelected(true);
        myMenu.add(myItem);
        JCheckBoxMenuItem myItem1 = new JCheckBoxMenuItem("Cheese Burger");
        myItem.setSelected(true);
        myMenu.add(myItem1);
        JCheckBoxMenuItem myItem2 = new JCheckBoxMenuItem("Chicken Burger");
        myItem.setSelected(true);
        myMenu.add(myItem2);
        JCheckBoxMenuItem myItem3 = new JCheckBoxMenuItem("Ham Burger");
        myItem.setSelected(true);
        myMenu.add(myItem3);
        JCheckBoxMenuItem myItem4 = new JCheckBoxMenuItem("Chicken with cheese Burger");
        myItem.setSelected(true);
        myMenu.add(myItem4);
        JCheckBoxMenuItem myItem5 = new JCheckBoxMenuItem("Regular Burger");
        myItem.setSelected(true);
        myMenu.add(myItem5);
        JCheckBoxMenuItem myItem6 = new JCheckBoxMenuItem("Double Patty Burger");
        myItem.setSelected(true);
        myMenu.add(myItem6);
        JCheckBoxMenuItem myItem7 = new JCheckBoxMenuItem("Deluxe Burger");
        myItem.setSelected(true);
        myMenu.add(myItem7);
        JCheckBoxMenuItem myItem8 = new JCheckBoxMenuItem("Vegetarian Burger");
        myItem.setSelected(true);
        myMenu.add(myItem8);
        myItem = new JCheckBoxMenuItem("Quarterpounder");
        myMenu.add(myItem);
        return myMenu;
     }


private JMenu getJoshMenu() {
      JMenu myMenu = new JMenu("Dessert");
      JCheckBoxMenuItem myItem = new JCheckBoxMenuItem("Choco Fudge");
      myItem.setSelected(true);
      myMenu.add(myItem);
      JCheckBoxMenuItem myItem1 = new JCheckBoxMenuItem("Cake");
      myItem.setSelected(true);
      myMenu.add(myItem1);
      JCheckBoxMenuItem myItem2 = new JCheckBoxMenuItem("Shake");
      myItem.setSelected(true);
      myMenu.add(myItem2);
      JCheckBoxMenuItem myItem3 = new JCheckBoxMenuItem("Leche Flan");
      myItem.setSelected(true);
      myMenu.add(myItem3);
      JCheckBoxMenuItem myItem4 = new JCheckBoxMenuItem("Ice cream");
      myItem.setSelected(true);
      myMenu.add(myItem4);
      JCheckBoxMenuItem myItem5 = new JCheckBoxMenuItem("Pastries");
      myItem.setSelected(true);
      myMenu.add(myItem5);
      JCheckBoxMenuItem myItem6 = new JCheckBoxMenuItem("Pies");
      myItem.setSelected(true);
      myMenu.add(myItem6);
      JCheckBoxMenuItem myItem7 = new JCheckBoxMenuItem("Fruit salad");
      myItem.setSelected(true);
      myMenu.add(myItem7);
      JCheckBoxMenuItem myItem8 = new JCheckBoxMenuItem("Pudding");
      myItem.setSelected(true);
      myMenu.add(myItem8);
      myItem = new JCheckBoxMenuItem("Tart");
      myMenu.add(myItem);
      return myMenu;
   }
   public void actionPerformed(ActionEvent e){
      float amount = 0;
      String msg = "";

      
      if(myItem.isSelected()){
         amount += 100;
         msg = "food costs 100\n";
      }
   }
}
