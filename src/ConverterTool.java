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

    private float baseVal= 0;
    private float convertedVal= 0;
    private int sliderVal= 4;

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
        jSlider1 = new javax.swing.JSlider();

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
        convertedValue.setText("");

        baseValue.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        baseValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
	baseValue.setEditable(false);
        baseValue.setText("");
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

        jSlider1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jSlider1.setMajorTickSpacing(1);
        jSlider1.setMaximum(4);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setPreferredSize(new java.awt.Dimension(300, 56));
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(units, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unitsCon, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(convertedValue, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                            .addComponent(baseValue)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(431, 431, 431))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertedValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitsCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jButton2)
                .addContainerGap(75, Short.MAX_VALUE))
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
	if(!units.getSelectedItem().toString().equals("Select Base Unit")){
            baseValue.setEditable(true);
        }    
    }//GEN-LAST:event_unitsActionPerformed
    
    /*
     * This method uses the number typed in the text field associated with
     * the base unit and then will use a method from below for the conversion
     * formula and place in the converted unit's text box.
     */
    private void baseValueKeyReleased(java.awt.event.KeyEvent evt) {
	//GEN-FIRST:event_baseValueKeyReleased
        if(baseValue.getText().length() < 1){
            System.out.println("Invalid Text Field");
        }else{
	    setBaseVal(Float.valueOf(baseValue.getText()).floatValue());
        
	    if(units.getSelectedItem().toString().equals("Fahrenheit (Fº)")){
		setConvertedVal(convertF2C(getBaseVal()));
	    }
	    else if (units.getSelectedItem().toString().equals("Celsius (Cº)")){
		setConvertedVal(convertC2F(getBaseVal()));
	    }
	    else if (units.getSelectedItem().toString().equals("Inch (in)")){
		setConvertedVal(convertIn2Cm(getBaseVal()));
	    }
	    else if (units.getSelectedItem().toString().equals("Centimeter (cm)")){
		setConvertedVal(convertCm2In(getBaseVal()));
	    }
	    else if (units.getSelectedItem().toString().equals("Feet (ft)")){
		setConvertedVal(convertF2M(getBaseVal()));
	    }
	    else if (units.getSelectedItem().toString().equals("Meter (m)")){
		setConvertedVal(convertM2F(getBaseVal()));
	    }
	    else if (units.getSelectedItem().toString().equals("Mile (mi)")){
		setConvertedVal(convertM2K(getBaseVal()));
	    }
	    else if (units.getSelectedItem().toString().equals("Kilometer (km)")){
		setConvertedVal(convertK2M(getBaseVal()));
	    }
	    else if (units.getSelectedItem().toString().equals("Gallon (gal)")){
		setConvertedVal(convertG2L(getBaseVal()));
	    }
	    else if (units.getSelectedItem().toString().equals("Liter (L)")){
		setConvertedVal(convertL2G(getBaseVal()));
	    }
	    else if (units.getSelectedItem().toString().equals("Ounce (oz)")){
		setConvertedVal(convertOz2G(getBaseVal()));
	    }
	    else if (units.getSelectedItem().toString().equals("Gram (g)")){
		setConvertedVal(convertG2Oz(getBaseVal()));
	    }
	    else if (units.getSelectedItem().toString().equals("Pound (lb)")){
		setConvertedVal(convertLb2K(getBaseVal()));
	    }
	    else if (units.getSelectedItem().toString().equals("Kilogram (kg)")){
		setConvertedVal(convertK2Lb(getBaseVal()));
	    }  
	    else if (units.getSelectedItem().toString().equals("Kilometers/hour (km/h)")){
		setConvertedVal(convertK2M(getBaseVal()));
	    }  
	    else if (units.getSelectedItem().toString().equals("Miles/hour (mph)")){
		setConvertedVal(convertM2K(getBaseVal()));
	    }
	    convertedValue.setText(myFormat(getSliderVal(), getConvertedVal()));
        }
        
    }//GEN-LAST:event_baseValueKeyReleased

    
    /*
     * This method handles the button that allows you to swap the base unit and
     * the converted unit for ease of read functionality.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
	//switch text fields
        units.setSelectedItem(unitsCon.getText());
        baseValue.setText(convertedValue.getText());
	convertedValue.setText(myFormat(getSliderVal(),getBaseVal()));
	
        //swap the private variables
        float tempFloat= getConvertedVal();
        setConvertedVal(getBaseVal());
        setBaseVal(tempFloat);	
    }//GEN-LAST:event_jButton1ActionPerformed

    /*
     * This method is used when the user clicks the reset button at the bottom
     * of the application and then will reset the drop down menu selector back
     * to the text saying to choose and sets all text fields to blank
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //reset text fields 
        units.setSelectedItem("Select Base Unit");
        unitsCon.setText("");
        baseValue.setText("");
        convertedValue.setText("");
        
        //reset values
        setBaseVal(0);
        setConvertedVal(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    /*
     * This method monitors the changing of the slider tool that allows rounding
     * from 0-4 decimal places on both the base value input and the converted
     * value's answer.
     */
    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
            //set private variable
            setSliderVal(((int) jSlider1.getValue()));
            
            //format text boxes
            baseValue.setText(myFormat(getSliderVal(), getBaseVal()));
            convertedValue.setText(myFormat(getSliderVal(), getConvertedVal()));
    }//GEN-LAST:event_jSlider1StateChanged
    
    //Helper method to set decimal precision with variable
    public static String myFormat(int precision, Object... args){
    String form = "%."+precision+"f\n";
    return String.format(form, args);
}
    public float getBaseVal() {
        return baseVal;
    }

    public void setBaseVal(float baseVal) {
        this.baseVal = baseVal;
    }

    public float getConvertedVal() {
        return convertedVal;
    }

    public void setConvertedVal(float convertedVal) {
        this.convertedVal = convertedVal;
    }

    public int getSliderVal() {
        return sliderVal;
    }

    public void setSliderVal(int sliderVal) {
        this.sliderVal = sliderVal;
    }
    
/* Converter Methods */    
private float convertF2C (float base)
{  // Convert farenheit to celsius
   float converted= (float) ( ( (base-32.0) * 5.0) / 9.0);
   setConvertedVal(converted);
   
   return converted;
}

private float convertC2F (float base)
{  // Convert celsius to farenheit
   float converted= (float) ( (base * 9.0 / 5.0) + 32.0);
   setConvertedVal(converted);
   
   return converted;
}

// small distance
private float convertIn2Cm (float base)
{  // Convert inches to centimeters
   float converted= (float) (base * 2.54);
   setConvertedVal(converted);
   
   return converted;
}

private float convertCm2In (float base)
{  // Convert centimeters to inches
   float converted= (float) (base * 0.3937);
   setConvertedVal(converted);
   
   return converted;
}

// medium distance
private float convertF2M (float base)
{  // Convert feet to meters
   float converted= (float) (base * 0.3048);
   setConvertedVal(converted);
   
   return converted;
}

private float convertM2F (float base)
{  // Convert meters to feet
   float converted= (float) (base / 0.6048);
   setConvertedVal(converted);
   
   return converted;
}

// large distance
private float convertM2K (float base)
{  // Convert miles to kilometers
   float converted= (float) (base * 1.609);
   setConvertedVal(converted);
   
   return converted;
}

private float convertK2M (float base)
{  // Convert kilometers to miles
   float converted= (float) (base * 0.6214);
   setConvertedVal(converted);
   
   return converted;
}

// volume
private float convertG2L (float base)
{  // Convert gallons to liters
   float converted= (float) (base * 3.785);
   setConvertedVal(converted);
   
   return converted;
}

private float convertL2G (float base)
{  // Convert liters to gallons
   float converted= (float) (base / 3.785);
   setConvertedVal(converted);
   
   return converted;
}

// small weight
private float convertOz2G (float base)
{  // Convert ounces to grams
   float converted= (float) (base * 28.35);
   setConvertedVal(converted);
   
   return converted;
}

private float convertG2Oz (float base)
{  // Convert grams to ounces
   float converted= (float) (base / 28.35);
   setConvertedVal(converted);
   
   return converted;
}

// medium weight
private float convertLb2K (float base)
{  // Convert pounds to kilograms
   float converted= (float) (base * 0.4536);
   setConvertedVal(converted);
   
   return converted;
}

private float convertK2Lb (float base)
{  // Convert kilograms to pounds
   float converted= (float) (base * 2.205);
   setConvertedVal(converted);
   
   return converted;
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
    private javax.swing.JSlider jSlider1;
    private javax.swing.JComboBox<String> units;
    private javax.swing.JTextField unitsCon;
    // End of variables declaration//GEN-END:variables
}
