/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @authors FNU Alisha Zamir Saiyed, Jake Sanchez, Chris Alves
 */
public class ConverterTool extends javax.swing.JFrame {

    /**
     * Creates new form ConverterTool
     */
    public ConverterTool() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        units = new javax.swing.JComboBox<>();
        unitsCon = new javax.swing.JTextField();
        convertedValue = new javax.swing.JTextField();
        baseValue = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        units.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        units.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Base Unit", "Fahrenheit (Fº)", "Celsius (Cº)", "Inch (in)", "Centimeter (cm)", "Feet (ft)", "Meter (m)", "Mile (mi)", "Kilometer (km)", "Gallon (gal)", "Liter (L)", "Ounce (oz)", "Gram (g)", "Pound (lb)", "Kilogram (kg)", "Miles/hour (mph)", "Kilometers/hour (km/h)" }));
        units.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitsActionPerformed(evt);
            }
        });

        unitsCon.setEditable(false);
        unitsCon.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N

        convertedValue.setEditable(false);
        convertedValue.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        convertedValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        convertedValue.setText("0");

        baseValue.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        baseValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        baseValue.setText("0");
        baseValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                baseValueKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("FROM:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("TO:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Unit Converter");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/switch.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(451, 451, 451))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(units, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitsCon, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(convertedValue, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                            .addComponent(baseValue))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(units, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(baseValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertedValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitsCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(87, 87, 87))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /*
     * This method is used to handle giving the cooresponding unit when selecting
     * one initially from the drop down menu.  Just sets the text field for the
     * unit being converted to.
     */
    private void unitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitsActionPerformed
        if(units.getSelectedItem().toString().equals("Select Base Unit")){
            unitsCon.setText(" ");
        }
        else if(units.getSelectedItem().toString().equals("Fahrenheit (Fº)")){
            unitsCon.setText("Celsius (Cº)");
        }
       else if (units.getSelectedItem().toString().equals("Celsius (Cº)")){
            unitsCon.setText("Fahrenheit (Fº)");
        }
        else if (units.getSelectedItem().toString().equals("Inch (in)")){
            unitsCon.setText("Centimeter (cm)");
        }
        else if (units.getSelectedItem().toString().equals("Centimeter (cm)")){
            unitsCon.setText("Inch (in)");
        }
        else if (units.getSelectedItem().toString().equals("Feet (ft)")){
            unitsCon.setText("Meter (m)");
        }
        else if (units.getSelectedItem().toString().equals("Meter (m)")){
            unitsCon.setText("Feet (ft)");
        }
        else if (units.getSelectedItem().toString().equals("Mile (mi)")){
            unitsCon.setText("Kilometer (km)");
        }
        else if (units.getSelectedItem().toString().equals("Kilometer (km)")){
            unitsCon.setText("Mile (mi)");
        }
        else if (units.getSelectedItem().toString().equals("Gallon (gal)")){
            unitsCon.setText("Liter (L)");
        }
        else if (units.getSelectedItem().toString().equals("Liter (L)")){
            unitsCon.setText("Gallon (gal)");
        }
        else if (units.getSelectedItem().toString().equals("Ounce (oz)")){
            unitsCon.setText("Gram (g)");
        }
        else if (units.getSelectedItem().toString().equals("Gram (g)")){
            unitsCon.setText("Ounce (oz)");
        }
        else if (units.getSelectedItem().toString().equals("Pound (lb)")){
            unitsCon.setText("Kilogram (kg)");
        }
        else if (units.getSelectedItem().toString().equals("Kilogram (kg)")){
            unitsCon.setText("Pound (lb)");
        }  
        else if (units.getSelectedItem().toString().equals("Kilometers/hour (kmh)")){
            unitsCon.setText("Miles/hour (mph)");
        }
        else if (units.getSelectedItem().toString().equals("Miles/hour (mph)")){
            unitsCon.setText("Kilometers/hour (kmh)");
        }
    }//GEN-LAST:event_unitsActionPerformed
    
    /*
     * This method uses the number typed in the text field associated with
     * the base unit and then will use a method from below for the conversion
     * formula and place in the converted unit's text box.
     */
    private void baseValueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_baseValueKeyReleased
        if(units.getSelectedItem().toString().equals("Fahrenheit (Fº)")){
            convertedValue.setText(Float.toString(convertF2C(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Celsius (Cº)")){
            convertedValue.setText(Float.toString(convertC2F(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Inch (in)")){
           convertedValue.setText(Float.toString(convertIn2Cm(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Centimeter (cm)")){
            convertedValue.setText(Float.toString(convertCm2In(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Feet (ft)")){
           convertedValue.setText(Float.toString(convertF2M(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Meter (m)")){
           convertedValue.setText(Float.toString(convertM2F(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Mile (mi)")){
            convertedValue.setText(Float.toString(convertM2K(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Kilometer (km)")){
            convertedValue.setText(Float.toString(convertK2M(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Gallon (gal)")){
           convertedValue.setText(Float.toString(convertG2L(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Liter (L)")){
           convertedValue.setText(Float.toString(convertL2G(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Ounce (oz)")){
           convertedValue.setText(Float.toString(convertOz2G(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Gram (g)")){
            convertedValue.setText(Float.toString(convertG2Oz(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Pound (lb)")){
            convertedValue.setText(Float.toString(convertLb2K(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Kilogram (kg)")){
           convertedValue.setText(Float.toString(convertK2Lb(baseValue.getText())));
        }  
        else if (units.getSelectedItem().toString().equals("Kilometers/hour (km/h)")){
           convertedValue.setText(Float.toString(convertK2M(baseValue.getText())));
        }  
        else if (units.getSelectedItem().toString().equals("Miles/hour (mph)")){
           convertedValue.setText(Float.toString(convertM2K(baseValue.getText())));
        } 
        
    }//GEN-LAST:event_baseValueKeyReleased

    
    /*
     * This method handles the button that allows you to swap the base unit and
     * the converted unit for ease of read functionality.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        units.setSelectedItem(unitsCon.getText());
        baseValue.setText(convertedValue.getText());
        
        if(units.getSelectedItem().toString().equals("Fahrenheit (Fº)")){
            convertedValue.setText(Float.toString(convertF2C(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Celsius (Cº)")){
            convertedValue.setText(Float.toString(convertC2F(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Inch (in)")){
           convertedValue.setText(Float.toString(convertIn2Cm(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Centimeter (cm)")){
            convertedValue.setText(Float.toString(convertCm2In(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Feet (ft)")){
           convertedValue.setText(Float.toString(convertF2M(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Meter (m)")){
           convertedValue.setText(Float.toString(convertM2F(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Mile (mi)")){
            convertedValue.setText(Float.toString(convertM2K(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Kilometer (km)")){
            convertedValue.setText(Float.toString(convertK2M(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Gallon (gal)")){
           convertedValue.setText(Float.toString(convertG2L(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Liter (L)")){
           convertedValue.setText(Float.toString(convertL2G(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Ounce (oz)")){
           convertedValue.setText(Float.toString(convertOz2G(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Gram (g)")){
            convertedValue.setText(Float.toString(convertG2Oz(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Pound (lb)")){
            convertedValue.setText(Float.toString(convertLb2K(baseValue.getText())));
        }
        else if (units.getSelectedItem().toString().equals("Kilogram (kg)")){
           convertedValue.setText(Float.toString(convertK2Lb(baseValue.getText())));
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    /*
     * This method is used when the user clicks the reset button at the bottom
     * of the application and then will reset the drop down menu selector back
     * to the text saying to choose and sets all text fields to blank
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        units.setSelectedItem("Select Base Unit");
        unitsCon.setText("");
        baseValue.setText("0");
        convertedValue.setText("0");
    }//GEN-LAST:event_jButton2ActionPerformed



//Refactor the conversion methods below!!

/** *****************************************************
 *  Conversion methods below
 *  14 methods, 2 for each pair of units
********************************************************* */
private float convertF2C (String FAsStr)
{  // Convert farenheit to celsius
   float farenheit, celsius;
   farenheit = (Float.valueOf(FAsStr).floatValue());
   celsius = (float) ( ( (farenheit-32.0) * 5.0) / 9.0);
  
   return (celsius);
}

private float convertC2F (String CAsStr)
{  // Convert celsius to farenheit
   float celsius, fahrenheit;
   celsius = (Float.valueOf (CAsStr).floatValue ());
   fahrenheit = (float) ( (celsius * 9.0 / 5.0) + 32.0);
   
   return(fahrenheit);
}

// small distance
private float convertIn2Cm (String inAsStr)
{  // Convert inches to centimeters
   float inches, centimeters; 
   inches = (Float.valueOf (inAsStr).floatValue ());
   centimeters = (float) (inches * 2.54);
   
   return(centimeters);
}

private float convertCm2In (String cmAsStr)
{  // Convert centimeters to inches
   float centimeters, inches; // temporary variables
   centimeters = (Float.valueOf (cmAsStr).floatValue ());
   inches = (float) (centimeters * 0.3937);
   
   return(inches);
}

// medium distance
private float convertF2M (String ftAsStr)
{  // Convert feet to meters
   float feet, meters;
   feet = (Float.valueOf (ftAsStr).floatValue ());
   meters = (float) (feet * 0.3048);
   
   return(meters);
}

private float convertM2F (String mAsStr)
{  // Convert meters to feet
   float meters, feet;
   meters = (Float.valueOf (mAsStr).floatValue ());
   feet = (float) (meters / 0.6048);
   
   return(feet);
}

// large distance
private float convertM2K (String miAsStr)
{  // Convert miles to kilometers
   float miles, kilometers;
   miles = (Float.valueOf (miAsStr).floatValue ());
   kilometers = (float) (miles * 1.609);

   return(kilometers);
}

private float convertK2M (String kmAsStr)
{  // Convert kilometers to miles
   float kilometers, miles;
   kilometers = (Float.valueOf (kmAsStr).floatValue ());
   miles = (float) (kilometers * 0.6214);

   return(miles);
}

// volume
private float convertG2L (String galAsStr)
{  // Convert gallons to liters
   float gallons, liters;
   gallons = (Float.valueOf (galAsStr).floatValue ());
   liters = (float) (gallons * 3.785);

   return(liters);
}

private float convertL2G (String LAsStr)
{  // Convert liters to gallons
   float liters, gallons;
   liters = (Float.valueOf (LAsStr).floatValue ());
   gallons = (float) (liters / 3.785);
  
   return(gallons);
}

// small weight
private float convertOz2G (String ozAsStr)
{  // Convert ounces to grams
   float ounces, grams;
   ounces = (Float.valueOf (ozAsStr).floatValue ());
   grams = (float) (ounces * 28.35);

   return(grams);
}

private float convertG2Oz (String gAsStr)
{  // Convert grams to ounces
   float grams, ounces;
   grams = (Float.valueOf (gAsStr).floatValue ());
   ounces = (float) (grams / 28.35);

   return(ounces);
}

// medium weight
private float convertLb2K (String lbAsStr)
{  // Convert pounds to kilograms
   float pounds, kilograms;
   pounds = (Float.valueOf (lbAsStr).floatValue ());
   kilograms = (float) (pounds * 0.4536);

   return(kilograms);
}

private float convertK2Lb (String kgAsStr)
{  // Convert kilograms to pounds
   float kilograms, pounds;
   kilograms = (Float.valueOf (kgAsStr).floatValue ());
   pounds = (float) (kilograms * 2.205);

   return(pounds);
}
    
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
            java.util.logging.Logger.getLogger(ConverterTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConverterTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConverterTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConverterTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConverterTool().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField baseValue;
    private javax.swing.JTextField convertedValue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> units;
    private javax.swing.JTextField unitsCon;
    // End of variables declaration//GEN-END:variables
}
