import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.awt.event.*;  



public class restau4 extends JFrame implements ItemListener {
    
    static boolean icet, jc, br, cf, cd, pd, we, sd, ed, ta; // item listener var beverages
    static boolean cs, bs, fs, ci, ba, ss, cr, cp, cy, ce; // item listener var snacks
    static boolean eggsand, cheeburgr, chickburgr, hamburgr, chickcheebrgr, regburgr, doublepatburgr,
    delxburgr, vegburgr, qtrpndr; // item listener var borgir
    static boolean chofud, cak, shak, lecfla, icecrea, pas, pie, frusld, pudd, tar; 
    // item listener var dessert

        
    public static void main(String[] args){
        JFrame jf = new JFrame();
        jf.setTitle("restaurant menu");
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        JButton b;
        
        

        JMenuBar jmb = new JMenuBar();
        jf.setJMenuBar(jmb);

        //categories section

        JMenu beverages = new JMenu("Beverages");
        jmb.add(beverages);

        JMenu snacks = new JMenu("Snacks");
        jmb.add(snacks);

        JMenu burgers = new JMenu("Burgers");
        jmb.add(burgers);

        JMenu desserts = new JMenu("Desserts");
        jmb.add(desserts);



        // beverages section

        JCheckBoxMenuItem icetea = new JCheckBoxMenuItem("ice tea");
        icetea.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      icet = true;
                }
                else {
                    icet = false;
                }
            }
        });
        beverages.add(icetea);

        JCheckBoxMenuItem juice = new JCheckBoxMenuItem("juice");
        juice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      jc = true;
                }
                else {
                    jc = false;
                }
            }
        });
        beverages.add(juice);

        JCheckBoxMenuItem beer = new JCheckBoxMenuItem("beer");
        beer.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      br = true;
                }
                else {
                    br = false;
                }
            }
        });
        beverages.add(beer);

        JCheckBoxMenuItem coffee = new JCheckBoxMenuItem("coffee");
        coffee.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      cf = true;
                }
                else {
                    cf = false;
                }
            }
        });
        beverages.add(coffee);

        JCheckBoxMenuItem chocodrink = new JCheckBoxMenuItem("chocolate drink");
        chocodrink.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      cd = true;
                }
                else {
                    cd = false;
                }
            }
        });
        beverages.add(chocodrink);

        JCheckBoxMenuItem pineappledrink = new JCheckBoxMenuItem("pineapple drink");
        pineappledrink.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      pd = true;
                }
                else {
                    pd = false;
                }
            }
        });
        beverages.add(pineappledrink);

        JCheckBoxMenuItem wine = new JCheckBoxMenuItem("wine");
        wine.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      we = true;
                }
                else {
                    we = false;
                }
            }
        });
        beverages.add(wine);

        JCheckBoxMenuItem soda = new JCheckBoxMenuItem("soda");
        soda.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      sd = true;
                }
                else {
                    sd = false;
                }
            }
        });
        beverages.add(soda);

        JCheckBoxMenuItem energydrink = new JCheckBoxMenuItem("energy drink");
        energydrink.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      ed = true;
                }
                else {
                    ed = false;
                }
            }
        });
        beverages.add(energydrink);

        JCheckBoxMenuItem tea = new JCheckBoxMenuItem("tea");
        tea.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      ta = true;
                }
                else {
                    ta = false;
                }
            }
        });
        beverages.add(tea);

        //snacks section

        JCheckBoxMenuItem chips = new JCheckBoxMenuItem("chips");
        chips.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      cs = true;
                }
                else {
                    cs = false;
                }
            }
        });
        snacks.add(chips);

        JCheckBoxMenuItem biscuits = new JCheckBoxMenuItem("biscuits");
        biscuits.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      bs = true;
                }
                else {
                    bs = false;
                }
            }
        });
        snacks.add(biscuits);

        JCheckBoxMenuItem fruits = new JCheckBoxMenuItem("fruits");
        fruits.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      fs = true;
                }
                else {
                    fs = false;
                }
            }
        });
        snacks.add(fruits);

        JCheckBoxMenuItem cookies = new JCheckBoxMenuItem("cookies");
        cookies.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      ci = true;
                }
                else {
                    ci = false;
                }
            }
        });
        snacks.add(cookies);

        JCheckBoxMenuItem bars = new JCheckBoxMenuItem("bars");
        bars.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      ba = true;
                }
                else {
                    ba = false;
                }
            }
        });
        snacks.add(bars);

        JCheckBoxMenuItem sandwiches = new JCheckBoxMenuItem("sandwiches");
        sandwiches.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      ss = true;
                }
                else {
                    ss = false;
                }
            }
        });
        snacks.add(sandwiches);

        JCheckBoxMenuItem crackers = new JCheckBoxMenuItem("crackers");
        crackers.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      cr = true;
                }
                else {
                    cr = false;
                }
            }
        });
        snacks.add(crackers);

        JCheckBoxMenuItem crisps = new JCheckBoxMenuItem("crisps");
        crisps.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      cp = true;
                }
                else {
                    cp = false;
                }
            }
        });
        snacks.add(crisps);

        JCheckBoxMenuItem candy = new JCheckBoxMenuItem("candy");
        candy.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      cy = true;
                }
                else {
                    cy = false;
                }
            }
        });
        snacks.add(candy);

        JCheckBoxMenuItem chocolate = new JCheckBoxMenuItem("chocolate");
        chocolate.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      ce = true;
                }
                else {
                    ce = false;
                }
            }
        });
        snacks.add(chocolate);
        
        // borgir section

        JCheckBoxMenuItem eggsandwich = new JCheckBoxMenuItem("egg sandwich");
        eggsandwich.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      eggsand = true;
                }
                else {
                    eggsand = false;
                }
            }
        });
        burgers.add(eggsandwich);

        JCheckBoxMenuItem cheeseburger = new JCheckBoxMenuItem("cheese burger");
        cheeseburger.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      cheeburgr = true;
                }
                else {
                    cheeburgr = false;
                }
            }
        });
        burgers.add(cheeseburger);

        JCheckBoxMenuItem chickenburger = new JCheckBoxMenuItem("chicken burger");
        chickenburger.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      chickburgr = true;
                }
                else {
                    chickburgr = false;
                }
            }
        });
        burgers.add(chickenburger);

        JCheckBoxMenuItem hamburger = new JCheckBoxMenuItem("ham burger");
        hamburger.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      hamburgr = true;
                }
                else {
                    hamburgr = false;
                }
            }
        });
        burgers.add(hamburger);

        JCheckBoxMenuItem chickenwithcheese = new JCheckBoxMenuItem("chicken burger with cheese");
        chickenwithcheese.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      chickcheebrgr = true;
                }
                else {
                    chickcheebrgr = false;
                }
            }
        });
        burgers.add(chickenwithcheese);

        JCheckBoxMenuItem regularburger = new JCheckBoxMenuItem("regular burger");
        regularburger.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      regburgr = true;
                }
                else {
                    regburgr = false;
                }
            }
        });
        burgers.add(regularburger);

        JCheckBoxMenuItem doublepatty = new JCheckBoxMenuItem("double patty burger");
        doublepatty.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      doublepatburgr = true;
                }
                else {
                    doublepatburgr= false;
                }
            }
        });
        burgers.add(doublepatty);

        JCheckBoxMenuItem deluxeburger = new JCheckBoxMenuItem("deluxe burger");
        deluxeburger.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      delxburgr = true;
                }
                else {
                    delxburgr = false;
                }
            }
        });
        burgers.add(deluxeburger);

        JCheckBoxMenuItem vegetarianburger = new JCheckBoxMenuItem("vegetarian burger");
        vegetarianburger.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      vegburgr = true;
                }
                else {
                    vegburgr = false;
                }
            }
        });
        burgers.add(vegetarianburger);

        JCheckBoxMenuItem quarterpounder = new JCheckBoxMenuItem("quarter pounder");
        quarterpounder.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      qtrpndr = true;
                }
                else {
                    qtrpndr = false;
                }
            }
        });
        burgers.add(quarterpounder);

        // dessert section

        JCheckBoxMenuItem chocofudge = new JCheckBoxMenuItem("choco fudge");
        chocofudge.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      chofud = true;
                }
                else {
                    chofud = false;
                }
            }
        });
        desserts.add(chocofudge);

        JCheckBoxMenuItem cake = new JCheckBoxMenuItem("cake");
        cake.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      cak = true;
                }
                else {
                    cak = false;
                }
            }
        });
        desserts.add(cake);

        JCheckBoxMenuItem shake = new JCheckBoxMenuItem("shake");
        shake.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      shak = true;
                }
                else {
                    shak = false;
                }
            }
        });
        desserts.add(shake);

        JCheckBoxMenuItem lecheflan = new JCheckBoxMenuItem("leche flan");
        lecheflan.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      lecfla = true;
                }
                else {
                    lecfla = false;
                }
            }
        });
        desserts.add(lecheflan);

        JCheckBoxMenuItem icecream = new JCheckBoxMenuItem("ice cream");
        icecream.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      icecrea = true;
                }
                else {
                    icecrea = false;
                }
            }
        });
        desserts.add(icecream);

        JCheckBoxMenuItem pastries = new JCheckBoxMenuItem("pastries");
        pastries.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      pas = true;
                }
                else {
                    pas = false;
                }
            }
        });
        desserts.add(pastries);

        JCheckBoxMenuItem pies = new JCheckBoxMenuItem("pies");
        pies.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      pie = true;
                }
                else {
                    pie = false;
                }
            }
        });
        desserts.add(pies);

        JCheckBoxMenuItem fruitsalad = new JCheckBoxMenuItem("fruit salad");
        fruitsalad.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      frusld = true;
                }
                else {
                    frusld = false;
                }
            }
        });
        desserts.add(fruitsalad);

        JCheckBoxMenuItem pudding = new JCheckBoxMenuItem("pudding");
        pudding.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      pudd = true;
                }
                else {
                    pudd = false;
                }
            }
        });
        desserts.add(pudding);

        JCheckBoxMenuItem tart = new JCheckBoxMenuItem("tart");
        tart.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange() == ItemEvent.SELECTED){
                      tar = true;
                }
                else {
                    tar = false;
                }
            }
        });
        desserts.add(tart);

        // order button
        
        b = new JButton("Order");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                String msg = "Total cost: ";
                if(icet == true){
                    msg += "60 pesos";
                }
                if(jc == true){
                    msg += "20 pesos";
                }
                if(br == true){
                    msg += "30 pesos";
                }
                if(cf == true){
                    msg += "70 pesos";
                }
                if(cd == true){
                    msg += "20 pesos";
                }
                if(pd == true){
                    msg += "30 pesos";
                }
                if(we == true){
                    msg += "100 pesos";
                }
                if(sd == true){
                    msg += "50 pesos";
                }
                if(ta == true){
                    msg += "60 pesos";
                }
                if(cs == true){
                    msg += "20 pesos";
                }
                if(bs == true){
                    msg += "10 pesos";
                }
                if(fs == true){
                    msg += "50 pesos";
                }
                if(ci == true){
                    msg += "40 pesos";
                }
                if(ba == true){
                    msg += "50 pesos";
                }
                if(ss == true){
                    msg += "30 pesos";
                }
                if(cr == true){
                    msg += "20 pesos";
                }
                if(cp == true){
                    msg += "30 pesos";
                }
                if(cy == true){
                    msg += "20 pesos";
                }
                if(ce == true){
                    msg += "40 pesos";
                }
                if(eggsand == true){
                    msg += "30 pesos";
                }
                if(cheeburgr == true){
                    msg += "40 pesos";
                }
                if(chickburgr == true){
                    msg += "50 pesos";
                }
                if(hamburgr == true){
                    msg += "20 pesos";
                }
                if(chickcheebrgr == true){
                    msg += "60 pesos";
                }
                if(regburgr == true){
                    msg += "30 pesos";
                }
                if(doublepatburgr == true){
                    msg += "70 pesos";
                }
                if(delxburgr == true){
                    msg += "80 pesos";
                }
                if(vegburgr == true){
                    msg += "50 pesos";
                }
                if(qtrpndr == true){
                    msg += "60 pesos";
                }
                if(chofud == true){
                    msg += "40 pesos";
                }
                if(cak == true){
                    msg += "100 pesos";
                }
                if(shak == true){
                    msg += "30 pesos";
                }
                if(lecfla == true){
                    msg += "60 pesos";
                }
                if(icecrea == true){
                    msg += "30 pesos";
                }
                if(pas == true){
                    msg += "50 pesos";
                }
                if(pie == true){
                    msg += "70 pesos";
                }
                if(frusld == true){
                    msg += "80 pesos";
                }
                if(pudd == true){
                    msg += "40 pesos";
                }
                if(tar == true){
                    msg += "50 pesos";
                }
                JOptionPane.showMessageDialog(null, msg + "200");
            }

        });

        b.setBounds(170, 227, 89, 23);
        //b.addActionListener(this);
        jmb.add(b);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        
    }

    

}
