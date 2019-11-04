/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anton
 */
public class CarSaleGUI extends javax.swing.JFrame {
    /**
     * Creates new form CarSaleGUI
     */
    public CarSaleGUI() {
        initComponents();
    }
    //private String[] HondaModels = {"Accord", "Civic", "CRV"};

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        LabelTitle = new javax.swing.JLabel();
        ComboBoxMake = new javax.swing.JComboBox<>();
        LabelMakeSelection = new javax.swing.JLabel();
        ComboBoxModel = new javax.swing.JComboBox<>();
        LabelModel = new javax.swing.JLabel();
        SliderYear = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaReceipt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        LabelState = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelTitle.setFont(new java.awt.Font("Dialog", 3, 52)); // NOI18N
        LabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitle.setLabelFor(this);
        LabelTitle.setText("CAR SALE");

        ComboBoxMake.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ComboBoxMake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Honda", "Toyota", "Tesla" }));
        ComboBoxMake.setToolTipText("Double Click Please");
        ComboBoxMake.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComboBoxMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxMakeActionPerformed(evt);
            }
        });

        LabelMakeSelection.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LabelMakeSelection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMakeSelection.setLabelFor(ComboBoxMake);
        LabelMakeSelection.setText("Make Selection");

        ComboBoxModel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ComboBoxModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        ComboBoxModel.setToolTipText("");
        ComboBoxModel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComboBoxModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxModelActionPerformed(evt);
            }
        });

        LabelModel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LabelModel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelModel.setLabelFor(ComboBoxModel);
        LabelModel.setText("Model Selection");

        SliderYear.setMajorTickSpacing(1);
        SliderYear.setMaximum(2020);
        SliderYear.setMinimum(2015);
        SliderYear.setPaintLabels(true);
        SliderYear.setPaintTicks(true);
        SliderYear.setSnapToTicks(true);
        SliderYear.setToolTipText("Slide the indicator to the year you would like the model to be");
        SliderYear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SliderYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SliderYearMouseReleased(evt);
            }
        });

        txtAreaReceipt.setEditable(false);
        txtAreaReceipt.setColumns(20);
        txtAreaReceipt.setRows(50);
        jScrollPane1.setViewportView(txtAreaReceipt);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Receipt");

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" }));

        LabelState.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LabelState.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelState.setText("State Selection");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelModel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelMakeSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxModel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxMake, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(SliderYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelState, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelMakeSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxMake, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelModel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxModel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addComponent(SliderYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelState, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(78, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxMakeActionPerformed
        // TODO add your handling code here:
        if (ComboBoxMake.getSelectedItem()== "Honda") {
            ComboBoxModel.removeAllItems();
            ComboBoxModel.addItem("Select");            
            ComboBoxModel.addItem("Accord");
            ComboBoxModel.addItem("Civic");
            ComboBoxModel.addItem("CRV"); }
        if (ComboBoxMake.getSelectedItem() == "Toyota") {
            ComboBoxModel.removeAllItems();
            ComboBoxModel.addItem("Select");            
            ComboBoxModel.addItem("Corolla");
            ComboBoxModel.addItem("Rav4");
            ComboBoxModel.addItem("Tundra");}
        if (ComboBoxMake.getSelectedItem() == "Tesla") {
            ComboBoxModel.removeAllItems();
            ComboBoxModel.addItem("Select");                        
            ComboBoxModel.addItem("Model 3");
            ComboBoxModel.addItem("Model S");
            ComboBoxModel.addItem("Model X"); }
        make = ComboBoxMake.getSelectedItem().toString();
        txtAreaReceipt.setText(make);
    }//GEN-LAST:event_ComboBoxMakeActionPerformed
    
    private void ComboBoxModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxModelActionPerformed
        // TODO add your handling code here: 
        model = ComboBoxModel.getSelectedItem().toString(); 
        if (model.equalsIgnoreCase("Model 3")) {
            SliderYear.setMinimum(2017);
        }
        txtAreaReceipt.setText(make + "\n" + model);
    }//GEN-LAST:event_ComboBoxModelActionPerformed

    private void SliderYearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SliderYearMouseReleased
        // TODO add your handling code here:
        year = SliderYear.getValue();
        if (make == null || model == null) {
            txtAreaReceipt.setText("");
        }
        else {
        txtAreaReceipt.setText(make + "\n" + model + "\n" + year); }
    }//GEN-LAST:event_SliderYearMouseReleased

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
            java.util.logging.Logger.getLogger(CarSaleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarSaleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarSaleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarSaleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarSaleGUI().setVisible(true);
            }
        });
    }
    String make;
    String model;
    int year;
    //CAR PRICE DECLARATIONS
    double Civic2020 = 20950; //HONDA - CIVICS
    double Civic2019 = 19550;
    double Civic2018 = 18940;
    double Civic2017 = 15998;
    double Civic2016;
    double Civic2015;
    double CRV2020; //HONDA CRV
    double CRV2019;
    double CRV2018;
    double CRV2017;
    double CRV2016;
    double CRV2015;
    double Accord2020;  //HONDA ACCORD
    double Accord2019;
    double Accord2018;
    double Accord2017;
    double Accord2016;
    double Accord2015;
    double Corolla2020; //TOYOTA COROLLA
    double Corolla2019;
    double Corolla2018;
    double Corolla2017;
    double Corolla2016;
    double Corolla2015;
    double Rav42020;    //TOYOTA RAV4
    double Rav42019;
    double Rav42018;
    double Rav42017;
    double Rav42016;
    double Rav42015;
    double Tundra2020;  //TOYOTA TUNDRA
    double Tundra2019;
    double Tundra2018;
    double Tundra2017;
    double Tundra2016;
    double Tundra2015;
    double Model32020;  //TESLA MODEL 3 (STARTED IN 2017)
    double Model32019;
    double Model32018;
    double Model32017;
    double ModelS2020;  //TESLA MODEL S
    double ModelS2019;
    double ModelS2018;
    double ModelS2017;
    double ModelS2016;
    double ModelS2015;
    double ModelX2020;  //TESLA MODEL X
    double ModelX2019;
    double ModelX2018;
    double ModelX2017;
    double ModelX2016;
    double ModelX2015;
    //STATE TAX RATE DECLARATIONS 
    double alabama;     //A
    double alaska;
    double arizona;
    double arkansas;
    double california;  //C
    double colorado;
    double connecticut;
    double delaware;    //D
    double florida;     //F
    double georgia;     //G
    double hawaii;      //H
    double idaho;       //I
    double illinois;
    double indiana;
    double iowa;
    double kansas;      //K
    double kentucky;
    double louisiana;   //L
    double maine;       //M
    double maryland;
    double massachusetts;
    double michigan;
    double minnesota;
    double mississippi;
    double missouri;
    double montana;
    double nebraska;    //N
    double nevada;
    double newHampshire;
    double newJersey;
    double newMexico;
    double newYork;
    double northCarolina;
    double northDakota;
    double ohio;        //O
    double oklahoma;
    double oregon;
    double pennsylvania;//P
    double rhodeIsland; //R
    double southCarolina;//S
    double southDakota;
    double tennessee;   //T
    double texas;
    double utah;        //U
    double vermont;     //V
    double virginia;
    double washington;  //W
    double westVirginia;
    double wisconsin;
    double wyoming;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxMake;
    private javax.swing.JComboBox<String> ComboBoxModel;
    private javax.swing.JLabel LabelMakeSelection;
    private javax.swing.JLabel LabelModel;
    private javax.swing.JLabel LabelState;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JSlider SliderYear;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaReceipt;
    // End of variables declaration//GEN-END:variables
}
