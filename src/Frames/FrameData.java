package Frames;

import Data.DataModel;
import Data.Guess;
import Data.Utility;

public class FrameData extends javax.swing.JFrame {
    
    public FrameData() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLabel = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        partialCodeTest = new javax.swing.JButton();
        completeTestButton = new javax.swing.JButton();
        writeScoresButton = new javax.swing.JButton();
        readScoresButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainLabel.setFont(new java.awt.Font(".SF NS Text", 1, 24)); // NOI18N
        mainLabel.setText("Data");

        returnButton.setText("<--");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane1.setViewportView(outputArea);

        partialCodeTest.setText("Partial Code Test");
        partialCodeTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partialCodeTestActionPerformed(evt);
            }
        });

        completeTestButton.setText("Complete Code Test");
        completeTestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeTestButtonActionPerformed(evt);
            }
        });

        writeScoresButton.setText("Write Top Scores");
        writeScoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeScoresButtonActionPerformed(evt);
            }
        });

        readScoresButton.setText("Read Top Scores");
        readScoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readScoresButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(completeTestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(partialCodeTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(writeScoresButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(readScoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainLabel)
                    .addComponent(returnButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(partialCodeTest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(completeTestButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                        .addComponent(readScoresButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(writeScoresButton)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        outputArea.setText("");
        FrameManager.displayFrame(this, "Main");
    }//GEN-LAST:event_returnButtonActionPerformed

    private void partialCodeTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partialCodeTestActionPerformed
        int[] pegs = Utility.generateCode();
        
        outputArea.setText("[ " + pegs[0] + " " + pegs[1] + " " + pegs[2] 
                + " " + pegs[3] + " ]\n");
        
        Guess g[] = new Guess[10];
        for (int i = 0; i < g.length; i++) {
            g[i] = new Guess(pegs, new int[]{Utility.random.nextInt(4), 
                    Utility.random.nextInt(4), 
                    Utility.random.nextInt(4), 
                    Utility.random.nextInt(4)});
            outputArea.append(g[i].toString() + "\n");
        }
    }//GEN-LAST:event_partialCodeTestActionPerformed

    private void completeTestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeTestButtonActionPerformed
        int[] pegs = Utility.generateCode();
        
        outputArea.setText("[ " + pegs[0] + " " + pegs[1] + " " + pegs[2] 
                + " " + pegs[3] + " ]\n");
        
        Guess g[] = new Guess[256];
        int iterator = -1;
        for (int c1 = 0; c1 < 4; c1++) {
            for (int c2 = 0; c2 < 4; c2++) {
                for (int c3 = 0; c3 < 4; c3++) {
                    for (int c4 = 0; c4 < 4; c4++) {
                        g[++iterator] = new Guess(pegs, new int[]{c1, c2, c3, c4});
                        outputArea.append(g[iterator].toString() + "\n");
                    }
                }
            }
        }
    }//GEN-LAST:event_completeTestButtonActionPerformed

    private void writeScoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeScoresButtonActionPerformed
        DataModel.ms.write(outputArea.getText());
        DataModel.ms = new Data.MultiScore(outputArea.getText());
    }//GEN-LAST:event_writeScoresButtonActionPerformed

    private void readScoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readScoresButtonActionPerformed
        outputArea.setText(DataModel.ms.output());
        DataModel.ms = new Data.MultiScore(outputArea.getText());
    }//GEN-LAST:event_readScoresButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FrameData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completeTestButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JButton partialCodeTest;
    private javax.swing.JButton readScoresButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton writeScoresButton;
    // End of variables declaration//GEN-END:variables
}
