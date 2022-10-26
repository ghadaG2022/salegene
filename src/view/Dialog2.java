


package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Dialog2 extends JFrame {
        private JLabel ItemName;
    private JLabel ItemQuantity;
     private JLabel Itemprice;
    private JButton ok;
    private JButton cancel;
 private JTextField ItemNameText;
    private JTextField ItemquantityText;
     private JTextField ItempriceText;
    
    public Dialog2(NewJFrame j) {

       ItemName= new JLabel("ItemName");
        ItemNameText = new JTextField(15);

        Itemprice = new JLabel("Itemprice");
        ItempriceText = new JTextField(15);

        ItemQuantity = new JLabel("ItemQuantity");
        ItemquantityText = new JTextField(15);



         setLayout(new GridLayout(4, 4));
        ok= new JButton("OK");
        ok.setActionCommand("inlineok");



        ok.addActionListener(j.getController());
        cancel.addActionListener(j.getController());
     
        add( ItemName);
        add(  ItemNameText);

        add(  ItemQuantity);
        add( ItemquantityText);

        add( Itemprice);
        add( ItemquantityText);
         add(ItempriceText);
        add(ok);
      
        
        
        pack();
        
        
    }

    public JTextField getItemPrice() {
        return ItempriceText;
    }
    
     public JTextField getItemName() {
        return ItemNameText;
    }
    


    
     public JTextField getItemQuantity() {
        return ItemquantityText;
    }
    
}
 

