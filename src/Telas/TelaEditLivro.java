/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import MySQL.MySQL;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author luks
 */
public class TelaEditLivro extends javax.swing.JDialog {

    TelaPrinc telaP;
    String titulo;
    String autor;
    String codigo;
    TelaGerLivro telaGer;
    String numReg;
    String editora;
    String quantidade;
    
    public TelaEditLivro(TelaPrinc telaP,TelaGerLivro telaGer,String codigo,String titulo,String autor,String numReg,String editora,String quantidade) {
       ImageIcon icone = new ImageIcon(getClass().getResource("/Img/icone/icone.png"));
       this.setIconImage(icone.getImage()); 
       
       this.telaGer = telaGer;
       this.titulo = titulo;
       this.codigo = codigo;
       this.autor = autor;
       this.numReg = numReg;
       this.editora = editora;
       this.telaP = telaP;
       this.quantidade = quantidade;
       
       
       
        this.setResizable(false);
        
        initComponents();
        
         bLimpar.setVerticalTextPosition(SwingConstants.BOTTOM);
        bLimpar.setHorizontalTextPosition(SwingConstants.CENTER);
        
        bConcluiEd.setVerticalTextPosition(SwingConstants.BOTTOM);
        bConcluiEd.setHorizontalTextPosition(SwingConstants.CENTER);
        
        bCancelarEd.setVerticalTextPosition(SwingConstants.BOTTOM);
        bCancelarEd.setHorizontalTextPosition(SwingConstants.CENTER);
        
       tNumReg.setText(this.numReg);
       tTitulo.setText(this.titulo);
       tAutor.setText(this.autor);
       tEditora.setText(this.editora);
       tQuantidade.setText(this.quantidade);
       
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bLimpar = new javax.swing.JButton();
        bConcluiEd = new javax.swing.JButton();
        bCancelarEd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tAutor = new javax.swing.JTextField();
        tTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tNumReg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tEditora = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tQuantidade = new javax.swing.JTextField();
        tCategoria = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar item do Acervo");
        setMinimumSize(new java.awt.Dimension(846, 607));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(31, 126, 165));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editar item do Acervo");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(42, 42, 42)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 328, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(476, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 846, 100);

        jPanel4.setBackground(new java.awt.Color(31, 126, 165));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 318));

        bLimpar.setContentAreaFilled(false);
        bLimpar.setFocusPainted(false);
        bLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bLimpar.setForeground(new java.awt.Color(240, 240, 240));
        bLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/limparCampos2.png"))); // NOI18N
        bLimpar.setText("<html><center>Limpar<br>Campos");
        bLimpar.setBorderPainted(false);
        bLimpar.setContentAreaFilled(false);
        bLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bLimparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bLimparMouseExited(evt);
            }
        });
        bLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparActionPerformed(evt);
            }
        });

        bConcluiEd.setContentAreaFilled(false);
        bConcluiEd.setFocusPainted(false);
        bConcluiEd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bConcluiEd.setForeground(new java.awt.Color(240, 240, 240));
        bConcluiEd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/concluirEdicaoLivro2.png"))); // NOI18N
        bConcluiEd.setText("<html><center>Concluir<br>Edição");
        bConcluiEd.setBorderPainted(false);
        bConcluiEd.setContentAreaFilled(false);
        bConcluiEd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bConcluiEdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bConcluiEdMouseExited(evt);
            }
        });
        bConcluiEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConcluiEdActionPerformed(evt);
            }
        });

        bCancelarEd.setContentAreaFilled(false);
        bCancelarEd.setFocusPainted(false);
        bCancelarEd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bCancelarEd.setForeground(new java.awt.Color(240, 240, 240));
        bCancelarEd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/cancelarEdicaoLivro2.png"))); // NOI18N
        bCancelarEd.setText("<html><center>Cancelar<br>Edição");
        bCancelarEd.setBorderPainted(false);
        bCancelarEd.setContentAreaFilled(false);
        bCancelarEd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCancelarEdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCancelarEdMouseExited(evt);
            }
        });
        bCancelarEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarEdActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(bConcluiEd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(bLimpar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(10, 10, 10))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(bCancelarEd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(40, 40, 40)
                .add(bConcluiEd)
                .add(54, 54, 54)
                .add(bCancelarEd)
                .add(70, 70, 70)
                .add(bLimpar)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 100, 100, 510);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Título do Livro");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 240, 150, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Autor");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 330, 150, 30);

        tAutor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAutorActionPerformed(evt);
            }
        });
        jPanel1.add(tAutor);
        tAutor.setBounds(130, 370, 550, 30);

        tTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTituloActionPerformed(evt);
            }
        });
        jPanel1.add(tTitulo);
        tTitulo.setBounds(130, 280, 550, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Categoria");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(380, 140, 160, 30);

        tNumReg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tNumReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNumRegActionPerformed(evt);
            }
        });
        jPanel1.add(tNumReg);
        tNumReg.setBounds(130, 180, 160, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Editora");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 420, 180, 30);

        tEditora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEditoraActionPerformed(evt);
            }
        });
        jPanel1.add(tEditora);
        tEditora.setBounds(130, 460, 550, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Quantidade");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(130, 500, 180, 30);

        tQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tQuantidadeActionPerformed(evt);
            }
        });
        jPanel1.add(tQuantidade);
        tQuantidade.setBounds(130, 540, 130, 30);

        tCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Selecione-", "Livro", "Revista", "Gibi", "Lista telefônica", "Outros" }));
        jPanel1.add(tCategoria);
        tCategoria.setBounds(380, 180, 140, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Número de Registro");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(130, 140, 180, 30);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAutorActionPerformed
      
    }//GEN-LAST:event_tAutorActionPerformed

    private void tTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTituloActionPerformed

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
      
          tQuantidade.setText("");
        tTitulo.setText("");
        tAutor.setText("");
        tEditora.setText("");
        tNumReg.setText("");
       
       
    }//GEN-LAST:event_bLimparActionPerformed

 
    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      
        
      //   this.setAlwaysOnTop(false);
    Object[] options = { "Sim", "Não" };  
     int op = JOptionPane.showOptionDialog(null,"Deseja realmente cancelar a edição?",  "Cancelar Edição", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
       
        if(op==0){
            telaP.setEnabled(true);
            telaGer.setEnabled(true);
            
            this.dispose();
           
            telaP.setEnabled(false);
            
            telaGer.atualizaTabela();
           telaGer.toFront();
           
        }
        else{
         telaGer.reabrirEdit();
         telaGer.toFront();
         this.toFront();
        }
    
       
        
        
    }//GEN-LAST:event_formWindowClosing

    private void bConcluiEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConcluiEdActionPerformed
          if(!tTitulo.getText().equals("")&&!tAutor.getText().equals("")&&!tEditora.getText().equals("")&&!tNumReg.getText().equals("")){
           MySQL sql = new MySQL();
           sql.editLivro(codigo,tNumReg.getText().toUpperCase(),tTitulo.getText().toUpperCase(),tAutor.getText().toUpperCase(),tEditora.getText().toUpperCase(),tQuantidade.getText(),tCategoria.getSelectedItem().toString().toUpperCase());
            tTitulo.setText("");
            tNumReg.setText("");
            tEditora.setText("");
            tAutor.setText("");
             tQuantidade.setText("");
              tCategoria.setSelectedIndex(0);
           
           JOptionPane.showMessageDialog(null, "Livro editado com sucesso!","Editar Livro",JOptionPane.INFORMATION_MESSAGE);
             telaP.setEnabled(true);
          
           this.dispose();
           telaGer.atualizaTabela();
            telaGer.setEnabled(true);
           
            telaP.setEnabled(false);
            telaGer.toFront();
           
       }
       else{
           
           JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos","Editar Livro",JOptionPane.ERROR_MESSAGE);
           
       }
    }//GEN-LAST:event_bConcluiEdActionPerformed

    private void bCancelarEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarEdActionPerformed
      
      // this.setAlwaysOnTop(false);
    Object[] options = { "Sim", "Não" };  
     int op = JOptionPane.showOptionDialog(null,"Deseja realmente cancelar a edição? Os dados antigos não serão alterados",  "Cancelar Edição", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
       
        if(op==0){
            telaP.setEnabled(true);
            telaGer.setEnabled(true);
            
            this.dispose();
           
            telaP.setEnabled(false);
            
            telaGer.atualizaTabela();
        }
        else{
           
        }
    
    
    }//GEN-LAST:event_bCancelarEdActionPerformed

    private void tNumRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNumRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNumRegActionPerformed

    private void tEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEditoraActionPerformed
     
    }//GEN-LAST:event_tEditoraActionPerformed

    private void bConcluiEdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bConcluiEdMouseEntered
       bConcluiEd.setForeground(Color.black);
    }//GEN-LAST:event_bConcluiEdMouseEntered

    private void bConcluiEdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bConcluiEdMouseExited
       bConcluiEd.setForeground(Color.white);
    }//GEN-LAST:event_bConcluiEdMouseExited

    private void bCancelarEdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCancelarEdMouseEntered
        bCancelarEd.setForeground(Color.black);
    }//GEN-LAST:event_bCancelarEdMouseEntered

    private void bCancelarEdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCancelarEdMouseExited
        bCancelarEd.setForeground(Color.white);
    }//GEN-LAST:event_bCancelarEdMouseExited

    private void bLimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLimparMouseEntered
         bLimpar.setForeground(Color.black);
    }//GEN-LAST:event_bLimparMouseEntered

    private void bLimparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLimparMouseExited
      bLimpar.setForeground(Color.white);
    }//GEN-LAST:event_bLimparMouseExited

    private void tQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tQuantidadeActionPerformed
        if(!tTitulo.getText().equals("")&&!tAutor.getText().equals("")&&!tEditora.getText().equals("")&&!tNumReg.getText().equals("")){
           MySQL sql = new MySQL();
           sql.editLivro(codigo,tNumReg.getText().toUpperCase(),tTitulo.getText().toUpperCase(),tAutor.getText().toUpperCase(),tEditora.getText().toUpperCase(),tQuantidade.getText(),tCategoria.getSelectedItem().toString().toUpperCase());
            tTitulo.setText("");
            tNumReg.setText("");
            tEditora.setText("");
            tAutor.setText("");
             tQuantidade.setText("");
              tCategoria.setSelectedIndex(0);
           
           JOptionPane.showMessageDialog(null, "Livro editado com sucesso!","Editar Livro",JOptionPane.INFORMATION_MESSAGE);
             telaP.setEnabled(true);
          
           this.dispose();
           telaGer.atualizaTabela();
            telaGer.setEnabled(true);
           
            telaP.setEnabled(false);
            telaGer.toFront();
           
       }
       else{
           
           JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos","Editar Livro",JOptionPane.ERROR_MESSAGE);
           
       }
    }//GEN-LAST:event_tQuantidadeActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelarEd;
    private javax.swing.JButton bConcluiEd;
    private javax.swing.JButton bLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField tAutor;
    private javax.swing.JComboBox tCategoria;
    private javax.swing.JTextField tEditora;
    private javax.swing.JTextField tNumReg;
    private javax.swing.JTextField tQuantidade;
    private javax.swing.JTextField tTitulo;
    // End of variables declaration//GEN-END:variables
}