package Level;

import Data.Guess;
import Data.Utility;
import Frames.FrameManager;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class FrameLevel0 extends javax.swing.JFrame {

    private Guess g;
    private int[] pegs;
    private int iterator;
    
    private SpinnerNumberModel pegModel[] = 
      { new SpinnerNumberModel(0, 0, 3, 1), 
        new SpinnerNumberModel(0, 0, 3, 1), 
        new SpinnerNumberModel(0, 0, 3, 1), 
        new SpinnerNumberModel(0, 0, 3, 1) };
    
    public FrameLevel0() {
        initComponents();
        
        pegSpinner1.setModel(pegModel[0]);
        ((JSpinner.DefaultEditor) pegSpinner1.getEditor()).getTextField().setEditable(false);
            
        pegSpinner2.setModel(pegModel[1]);
        ((JSpinner.DefaultEditor) pegSpinner2.getEditor()).getTextField().setEditable(false);
        
        pegSpinner3.setModel(pegModel[2]);
        ((JSpinner.DefaultEditor) pegSpinner3.getEditor()).getTextField().setEditable(false);
        
        pegSpinner4.setModel(pegModel[3]);
        ((JSpinner.DefaultEditor) pegSpinner4.getEditor()).getTextField().setEditable(false);
        
        setCode();
            
        manageDebug();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        genCodeButton = new javax.swing.JButton();
        pegSpinner1 = new javax.swing.JSpinner();
        pegSpinner2 = new javax.swing.JSpinner();
        pegSpinner3 = new javax.swing.JSpinner();
        pegSpinner4 = new javax.swing.JSpinner();
        solutionTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        setCodeButton = new javax.swing.JButton();
        debugCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("<--");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 1, 24)); // NOI18N
        jLabel1.setText("Level 0");

        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        genCodeButton.setText("Generate Code");
        genCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genCodeButtonActionPerformed(evt);
            }
        });

        solutionTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        setCodeButton.setText("Set Code");
        setCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setCodeButtonActionPerformed(evt);
            }
        });

        debugCheckBox.setText("Enable Debug");
        debugCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debugCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(genCodeButton)
                        .addGap(18, 18, 18)
                        .addComponent(solutionTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pegSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pegSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pegSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pegSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setCodeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(debugCheckBox)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genCodeButton)
                    .addComponent(solutionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pegSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pegSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pegSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pegSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(setCodeButton)
                    .addComponent(debugCheckBox))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameManager.displayFrame(this, "Main");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void debugCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debugCheckBoxActionPerformed
        manageDebug();
    }//GEN-LAST:event_debugCheckBoxActionPerformed

    private void genCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genCodeButtonActionPerformed
        setCode();
    }//GEN-LAST:event_genCodeButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        g = new Guess(pegs, new int[]{(int)pegSpinner1.getValue(), 
            (int)pegSpinner2.getValue(), 
            (int)pegSpinner3.getValue(), 
            (int)pegSpinner4.getValue()});
        
        outputArea.append("Guess " + ++iterator + ": [ " + 
                g.getGuess(0) + " " + g.getGuess(1) + " " + g.getGuess(2)
                + " " + g.getGuess(3) + " ]\n");
    }//GEN-LAST:event_submitButtonActionPerformed

    private void setCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setCodeButtonActionPerformed
        pegs = new int[]{(int)pegSpinner1.getValue(), 
            (int)pegSpinner2.getValue(), 
            (int)pegSpinner3.getValue(), 
            (int)pegSpinner4.getValue()};
        
        solutionTextField.setText("[ " + pegs[0] + " " + pegs[1] +
            " " + pegs[2] + " " + pegs[3] + " ]");
    }//GEN-LAST:event_setCodeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FrameLevel0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLevel0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLevel0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLevel0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLevel0().setVisible(true);
            }
        });
    }
    
    private void manageDebug() {
        solutionTextField.setVisible(debugCheckBox.isSelected());
        setCodeButton.setVisible(debugCheckBox.isSelected());
    }
    
    private void setCode() {
        iterator = 0;
        pegs = Utility.generateCode();
        solutionTextField.setText("[ " + pegs[0] + " " + pegs[1] +
            " " + pegs[2] + " " + pegs[3] + " ]");
        
        outputArea.setText("A new code has been created.\nEnter a name, and then try to guess the code.\n");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox debugCheckBox;
    private javax.swing.JButton genCodeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JSpinner pegSpinner1;
    private javax.swing.JSpinner pegSpinner2;
    private javax.swing.JSpinner pegSpinner3;
    private javax.swing.JSpinner pegSpinner4;
    private javax.swing.JButton setCodeButton;
    private javax.swing.JTextField solutionTextField;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
