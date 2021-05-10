
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Booking extends javax.swing.JFrame {

    ArrayList <carInfo> carList;

    public Booking(ArrayList <carInfo> carList) {
        this.carList = carList;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        categoryCB = new javax.swing.JComboBox<>();
        searchBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTA = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        bookBTN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        RegistrationTF = new javax.swing.JTextField();
        hour1 = new javax.swing.JComboBox<>();
        min1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        hour2 = new javax.swing.JComboBox<>();
        min2 = new javax.swing.JComboBox<>();
        day1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Booking");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Broadway", 1, 14)); // NOI18N
        jLabel1.setText("Booking A Car ");

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jLabel2.setText("Search : ");

        categoryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Compact", "MPV" }));
        categoryCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryCBActionPerformed(evt);
            }
        });

        searchBTN.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 12)); // NOI18N
        searchBTN.setText("Search ");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        outputTA.setColumns(20);
        outputTA.setRows(5);
        jScrollPane1.setViewportView(outputTA);

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jLabel3.setText("Starting Date : ");

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jLabel4.setText("Ending Date : ");

        backBtn.setText("Back ");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        bookBTN.setText("Book");
        bookBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBTNActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jLabel6.setText("Registration Number:");

        RegistrationTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationTFActionPerformed(evt);
            }
        });

        hour1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        hour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hour1ActionPerformed(evt);
            }
        });

        min1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));

        jLabel9.setText(":");

        jLabel12.setText(":");

        hour2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        min2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));

        day1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        jLabel5.setText("Day 1");

        jLabel7.setText("Day ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(searchBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(bookBTN)))
                        .addGap(133, 133, 133)
                        .addComponent(backBtn)))
                .addContainerGap(188, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RegistrationTF)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(hour2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hour1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(min1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(min2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(272, 272, 272))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBTN))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RegistrationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hour1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(min1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hour2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(min2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookBTN)
                    .addComponent(backBtn))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        String category = categoryCB.getSelectedItem().toString();
        boolean found =false;
            outputTA.setText("\n");
            for (int i=0 ; i<carList.size() ; i++)
            {
                if ((carList.get(i).getCategory().equals(category))&& carList.get(i).getAvailability())
                {
                    System.out.println(carList.get(i).getCarModel());     
                    outputTA.append("Car Model: " + carList.get(i).getCarModel()+ "\n");              
                    outputTA.append("Car Registration Number: " + carList.get(i).getCarRegNum()+ "\n" );
                    outputTA.append("Rent Price(RM): "  + Double.toString(+carList.get(i).getRentPrice())+ "\n" );            
                    outputTA.append("Category: " + category + "\n");
                    outputTA.append("-------------------------------------------------------------------\n");
                    found=true;
                }
                continue;
            }
        if (found ==false) 
        {
            JOptionPane.showMessageDialog(null, "Car is not found");
        }
    }//GEN-LAST:event_searchBTNActionPerformed

    private void bookBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBTNActionPerformed
        
        boolean found=false;
        String RgNmbr= RegistrationTF.getText();
        String startingDate= hour1.getSelectedItem().toString() + min1.getSelectedItem().toString();
        String endDate = day1.getSelectedItem().toString()+hour2.getSelectedItem().toString() + min2.getSelectedItem().toString();
        //System.out.println(day1.getSelectedItem().toString()+hour1.getSelectedItem().toString() + min1.getSelectedItem().toString());
        double startI = Double.parseDouble(startingDate);
        double endI = Double.parseDouble(endDate);
        double pricetime = (endI-10000)-startI;
        System.out.println(pricetime);
        int pricetimed = (int)pricetime/10000;
        int pricetimeh = (int)pricetime/100;
        double rentalPrice = 0;
        
        for (int i=0 ; i<carList.size() ; i++)
            {
                System.out.println(carList.get(i).getCarRegNum()); 
                if (carList.get(i).getCarRegNum().equals(RgNmbr))
                {
                    if(carList.get(i).getAvailability()){
                        System.out.println(carList.get(i).getCarRegNum());
                    
                        if(pricetime<=0){
                            JOptionPane.showMessageDialog(null, "Incomplete Data");
                                found=true;
                                break;
                        }
                        
                    double price = carList.get(i).getRentPrice();
                    rentalPrice = (((double)pricetimed*24)*price)+((double)pricetimeh*price)+(((pricetime%100)/60)*price);
                    carList.get(i).setStartDate (startingDate);
                    carList.get(i).setEndDate (endDate);
                    JOptionPane.showMessageDialog(null, "Success to Book\n Total:RM "+ rentalPrice);
                    carList.get(i).setAvailability(false);
                    found = true;
                    }else{
                        JOptionPane.showMessageDialog(null, "This car booked already");
                        found= true;
                    }
                }
                continue;
            }
        
        if(!found){
            JOptionPane.showMessageDialog(null, "Incomplete Data");
        }
        
        
    }//GEN-LAST:event_bookBTNActionPerformed

    private void categoryCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryCBActionPerformed

    private void RegistrationTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrationTFActionPerformed

    private void hour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hour1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hour1ActionPerformed

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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Booking().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RegistrationTF;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookBTN;
    private javax.swing.JComboBox<String> categoryCB;
    private javax.swing.JComboBox<String> day1;
    private javax.swing.JComboBox<String> hour1;
    private javax.swing.JComboBox<String> hour2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> min1;
    private javax.swing.JComboBox<String> min2;
    private javax.swing.JTextArea outputTA;
    private javax.swing.JButton searchBTN;
    // End of variables declaration//GEN-END:variables
}
