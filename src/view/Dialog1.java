
 
package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Dialog1 extends javax.swing.JFrame{
    
    private JLabel custNameLabel;
     private JTextField customerName;
     
    private JLabel dateLabel;
       private JTextField invoiceDate;
    private JButton ok;


 
    
    public Dialog1(NewJFrame j) {
        custNameLabel= new JLabel("Customer Name:");
        customerName = new JTextField(30);
        dateLabel = new JLabel("Date:");
        
        invoiceDate = new JTextField(30);
        ok= new JButton("OK");
       
        ok.setActionCommand("ok2");
        
        ok.addActionListener(j.getController());
     
        setLayout(new GridLayout(4, 4));
        add(custNameLabel);
        add(customerName);
        add(dateLabel);
        add(invoiceDate);
        add(ok);
        
        
        
        pack();
        
        
    }
    
     public JTextField getInvoiceDate() {
        return invoiceDate;
    }
    

    public JTextField getCustomerName() {
        return customerName;
    }

   
    

}
