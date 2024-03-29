/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author luks
 */
public class TelaSenhaAdmin extends javax.swing.JFrame {

    TelaLogin telaL;
    
    public TelaSenhaAdmin(TelaLogin telaL) {
        
        initComponents();
   ImageIcon icone = new ImageIcon(getClass().getResource("/Img/icone/icone.png"));
       this.setIconImage(icone.getImage()); 
     
       this.setTitle("Admin Login");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
       
        this.telaL = telaL;
        this.toFront();
        this.setAlwaysOnTop(true);
        
         this.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tSenha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bVoltar = new javax.swing.JButton();
        bLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSenhaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Login");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 188, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Master Key");

        bVoltar.setText("Ops, me tire daqui");
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        bLogin.setText("Login");
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 514, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(jPanel1Layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(tSenha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 248, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(bVoltar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(bLogin)
                .add(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(50, 50, 50)
                .add(jLabel2)
                .add(3, 3, 3)
                .add(tSenha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bLogin)
                    .add(bVoltar))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 504, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
   
       
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
           this.dispose();
      telaL.setEnabled(true);
      telaL.setFocusable(true);
      telaL.toFront();
    }//GEN-LAST:event_formWindowClosing

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
       if(tSenha.getText().equals("")){
           TelaAdmin telaAdmin = new TelaAdmin();
           this.dispose();
           telaL.dispose();
           telaAdmin.toFront();
           
       }
       else{
           this.setAlwaysOnTop(false);
       JOptionPane.showMessageDialog(null, "Masterkey incorreta. Você é um administrador?","Masterkey Incorreta",JOptionPane.ERROR_MESSAGE);     
        this.setAlwaysOnTop(true);
       } 
       
       
        
        
    }//GEN-LAST:event_bLoginActionPerformed

    private void tSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSenhaActionPerformed
      if(tSenha.getText().equals("")){
           TelaAdmin telaAdmin = new TelaAdmin();
           this.dispose();
           telaL.dispose();
           telaAdmin.toFront();
           
       }
       else{
           this.setAlwaysOnTop(false);
       JOptionPane.showMessageDialog(null, "Masterkey incorreta. Você é um administrador?","Masterkey Incorreta",JOptionPane.ERROR_MESSAGE);     
        this.setAlwaysOnTop(true);
       } 
    }//GEN-LAST:event_tSenhaActionPerformed

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
             this.dispose();
      telaL.setEnabled(true);
      telaL.setFocusable(true);
      telaL.toFront();
    }//GEN-LAST:event_bVoltarActionPerformed

 
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLogin;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField tSenha;
    // End of variables declaration//GEN-END:variables
}
