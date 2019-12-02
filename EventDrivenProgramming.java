/*  
Name:  Olga Zhorzholiani    
Course: CNT 4714 – Fall 2019      
Assignment title: Program 1 – Event-driven Programming      
Date: Sunday September 22, 2019 
*/ 
package EventDrivenProgramming;

import java.util.List;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EventDrivenProgramming extends javax.swing.JFrame {

    private int counter = 0;   
    private List<String> list = new ArrayList<>();
    private List<Double> costSum = new ArrayList<>();

    public EventDrivenProgramming() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InternalFrame1 = new javax.swing.JInternalFrame();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InternalFrame1.setVisible(true);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter number of items in the order:");

        jLabel2.setText("Enter Book ID for item #1:");

        jLabel3.setText("Enter quantity for item #1:");

        jLabel4.setText("Item #1 info:");

        jLabel5.setText("Order subtotal for 0 items:");

        jButton1.setText("Process Item #1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Confirm Item #1");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View Order");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Finish Order");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("New Order");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InternalFrame1Layout = new javax.swing.GroupLayout(InternalFrame1.getContentPane());
        InternalFrame1.getContentPane().setLayout(InternalFrame1Layout);
        InternalFrame1Layout.setHorizontalGroup(
            InternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(InternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(InternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(InternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        InternalFrame1Layout.setVerticalGroup(
            InternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InternalFrame1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(InternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5))
                    .addGroup(InternalFrame1Layout.createSequentialGroup()
                        .addGroup(InternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(InternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // CONFIRM BUTTON        
        String cost = jTextField4.getText();    //  full line
        String[] findCost = cost.split(",");                  //  just
        String totalAsString = findCost[2];                  //    to
        totalAsString.trim();
        totalAsString = totalAsString.split(" ")[1];       // get & trim
        double total = Double.parseDouble(totalAsString); //    12.95
        double quantityDiscount = 0;
        
        double quantityPerItem = Double.parseDouble(jTextField3.getText()); 
            if(quantityPerItem < 5)
                quantityDiscount = 1;
            if(quantityPerItem < 10 && quantityPerItem > 4)
                quantityDiscount = .9;
            if(quantityPerItem < 15 && quantityPerItem > 9)
                quantityDiscount = .85;
            if(quantityPerItem > 15)
                quantityDiscount = .8;
            
        total = quantityPerItem*(total*quantityDiscount);
        double sum = 0;

        list.add("\n" + counter + ". " + jTextField4.getText());

        jTextField5.setText("$" + totalAsString);//   "12.95"
        costSum.add(total);
        
        for(int i = 0; i < list.size(); i++)
            sum += costSum.get(i);   
        
        BigDecimal roundedTotal = BigDecimal.valueOf(sum);
        roundedTotal = roundedTotal.setScale(2, RoundingMode.HALF_UP);
        jTextField5.setText("$" + roundedTotal);
        jLabel5.setText("Order subtotal for " + counter + " items:");
        
        JOptionPane.showMessageDialog(null, "Item #" + counter + " accepted.", "Message", JOptionPane.INFORMATION_MESSAGE);
        
        jTextField2.setText("");
        jTextField3.setText("");
  
        jLabel2.setText("Enter Book ID for item #" + (counter+1) + ":");
        jLabel3.setText("Enter quantity for item #" + (counter+1) + ":");
        jLabel4.setText("Item #" + counter + " info:");
        
        jButton1.setText("Process Item #" + (counter+1));
        jButton2.setText("Confirm Item #" + (counter+1));
        
        jButton1.setEnabled(true);
        jButton2.setEnabled(false);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // Enter Book ID for Item:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // PROCESS BUTTON
        try {
            Scanner scanner = new Scanner(new File("inventory.txt"));
		while (scanner.hasNextLine()) {
                    //Until the first comma of each line, find the book, print it to jTextField4
                    int i;
                    String fullLine = new String(scanner.nextLine());
                    String newLine = new String("");
                    StringBuilder newnew = new StringBuilder(newLine);
                    int orderQuantity = Integer.parseInt(jTextField3.getText());
                    int orderDiscount = 0;
                    
                    if(orderQuantity < 5)
                        orderDiscount = 0;
                    if(orderQuantity < 10 && orderQuantity > 4)
                        orderDiscount = 10;
                    if(orderQuantity < 15 && orderQuantity > 9)
                        orderDiscount = 15;
                    if(orderQuantity > 15)
                        orderDiscount = 20;
                    
                    for(i=0; i<fullLine.length(); i++){
                        if(fullLine.charAt(i) != ',')
                            newnew.insert(i,fullLine.charAt(i));
                        else
                            break;
                        }
                        if(newnew.toString().equals(jTextField2.getText())){
                            jTextField4.setText(fullLine + " " + orderQuantity + " " + orderDiscount + "%");
                            scanner.close();
                            break;
                        }
                        else if(scanner.hasNextLine()== false){
                            JOptionPane.showMessageDialog(null, "Book ID is not in file.", "Message", JOptionPane.INFORMATION_MESSAGE);
                            scanner.close();
                            return;
                        }
                        else
                            ;
                        }
		scanner.close();
                        
		} catch (FileNotFoundException e) {
		}
        counter++;
        jButton1.setEnabled(false);
        jButton2.setEnabled(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // EXIT
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // VIEW ORDER BUTTON
        JOptionPane.showMessageDialog(null, Arrays.toString(list.toArray()).replace(',', ' ').replace('[', ' ').replace(']', ' ').trim(), "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // FINISH ORDER BUTTON
        ZonedDateTime time = ZonedDateTime.now();
        DateTimeFormatter timeFormated = DateTimeFormatter.ofPattern("dd/MM/yy, h:mm:ss a z");
        DateTimeFormatter transID = DateTimeFormatter.ofPattern("ddMMyyyyHHmm, ");
        String timeAsString = time.format(timeFormated);
        String IDAsString = time.format(transID);
        
        double taxRate = .06;
        double preTaxTot = Double.parseDouble(jTextField5.getText().replace('$', ' ').trim());
        double taxAmount = Math.round(taxRate*preTaxTot*100);
        double orderTot = Math.round(taxAmount+preTaxTot*100);
        
        
        JOptionPane.showMessageDialog(null, "Date: " + timeAsString 
                                        +   "\n\nNumber of Line Items: " + jTextField1.getText()
                                        +   "\n\nItem# / ID / Title / Price / Qty / Disc % :\n\n"
                                        +    Arrays.toString(list.toArray()).replace(',', ' ').replace('[', ' ').replace(']', ' ').trim()
                                        +   "\n\nOrder Subtotal: " + jTextField5.getText()
                                        +   "\n\nTax Rate: 6%"
                                        +   "\n\nTax Amount: $"  +   (taxAmount/100)
                                        +   "\n\nOrder Total: $" +   (orderTot/100)
                                        +   "\n\nThanks For Shopping at Olga's Book Shoppe! Come Back Soon.","Invoice", JOptionPane.INFORMATION_MESSAGE);
        
        // Transactions log text file
        try {
            PrintWriter transLog = new PrintWriter(new FileWriter("transactions.txt", true));
            list.remove((Character)'\n');
            for(int i=0; i<list.size(); i++)
                transLog.println(IDAsString + list.get(i).trim() + " " + timeAsString);
            transLog.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EventDrivenProgramming.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(EventDrivenProgramming.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EventDrivenProgramming.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // New Order Button 
    counter = 0;
    list.clear();
    costSum.clear();
  
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
  
        jLabel2.setText("Enter Book ID for item #" + (counter+1) + ":");
        jLabel3.setText("Enter quantity for item #" + (counter+1) + ":");
        jLabel4.setText("Item #1" + " info:");
        jLabel5.setText("Order Subtotal for " + counter + " items:");
        
        jButton1.setText("Process Item #" + (counter+1));
        jButton2.setText("Confirm Item #" + (counter+1));
        
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EventDrivenProgramming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventDrivenProgramming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventDrivenProgramming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventDrivenProgramming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventDrivenProgramming().setVisible(true);
            }
        });    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame InternalFrame1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
