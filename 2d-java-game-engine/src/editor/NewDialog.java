/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewDialog.java
 *
 * Created on 30.12.2010, 12:46:16
 */

package editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import game.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Philipp
 */
public class NewDialog extends javax.swing.JFrame {

    /** Creates new form NewDialog */
    public NewDialog() {
        initComponents();
    }

    //Combo Box:
    private class ComboBoxActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(TemplateComboBox.getSelectedIndex() == 0){
                jSpinner1.setValue(30);
                jSpinner2.setValue(30);
            }
            if(TemplateComboBox.getSelectedIndex() == 1){
                jSpinner1.setValue(90);
                jSpinner2.setValue(30);
            }
            if(TemplateComboBox.getSelectedIndex() == 2){
                jSpinner1.setValue(180);
                jSpinner2.setValue(30);
            }
            if(TemplateComboBox.getSelectedIndex() == 3){
                jSpinner1.setValue(30);
                jSpinner2.setValue(90);
            }
            if(TemplateComboBox.getSelectedIndex() == 4){
                jSpinner1.setValue(30);
                jSpinner2.setValue(180);
            }
            if(TemplateComboBox.getSelectedIndex() == 5){
                jSpinner1.setEnabled(true);
                jSpinner2.setEnabled(true);
            }
            else{
                jSpinner1.setEnabled(false);
                jSpinner2.setEnabled(false);
            }

        }
    }

    ChangeListener mapSizeSpinnerListener = new ChangeListener() {
        public void stateChanged(ChangeEvent e) {

            if(Integer.parseInt(jSpinner1.getValue().toString()) < 0){
                jSpinner1.setValue(0);
            }
            if(Integer.parseInt(jSpinner1.getValue().toString()) > 999){
                jSpinner1.setValue(999);
            }
            if(Integer.parseInt(jSpinner2.getValue().toString()) < 0){
                jSpinner2.setValue(0);
            }
            if(Integer.parseInt(jSpinner2.getValue().toString()) > 999){
                jSpinner2.setValue(999);
            }

        }
    };

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TemplateComboBox = new javax.swing.JComboBox();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Level");
        setAlwaysOnTop(true);
        setResizable(false);

        TemplateComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "30x30", "90x30", "180x30", "30x90", "30x180", "custom..." }));
        TemplateComboBox.setName("TemplateComboBox"); // NOI18N
        TemplateComboBox.addActionListener(new ComboBoxActionListener());
        TemplateComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TemplateComboBoxPropertyChange(evt);
            }
        });

        jSpinner1.setEnabled(false);
        jSpinner1.setName("jSpinner1"); // NOI18N

        jSpinner2.setEnabled(false);
        jSpinner2.setName("jSpinner2"); // NOI18N

        jLabel1.setText("X");
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText("Y");
        jLabel2.setName("jLabel2"); // NOI18N

        jButton1.setText("OK");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(34, 34, 34)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 40, Short.MAX_VALUE)
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSpinner2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jButton1))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, TemplateComboBox, 0, 299, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(TemplateComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton1)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jSpinner2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TemplateComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TemplateComboBoxPropertyChange
    }//GEN-LAST:event_TemplateComboBoxPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a = 0;
        while(Map.object[a] != null){
            a++;
        }
        boolean cancel = false;
        if(a > 0){
            int answer = JOptionPane.showConfirmDialog(this, "Do you want to save the current level?");
            if(answer == JOptionPane.YES_OPTION){
                Editor.saveLevel(gameMain.FileSaveDialog("Save..."));
            }
            if(answer == JOptionPane.CANCEL_OPTION){
                cancel = true;
            }
        }
        if(cancel == false){
            // reset the editor:
            Map.clear();

            // get values:
            int newWidth = Integer.parseInt(jSpinner1.getValue().toString());
            int newHeight = Integer.parseInt(jSpinner2.getValue().toString());

            Toolbox.camPrefHeightSpinner.setValue((newHeight-5)*16);
            Toolbox.camToleranceSpinner.setValue(96);
            Toolbox.mapWidthSpinner.setValue(newWidth);
            Toolbox.mapHeightSpinner.setValue(newHeight);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox TemplateComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    // End of variables declaration//GEN-END:variables

}
