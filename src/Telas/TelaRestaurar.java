/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import MySQL.MySQL;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luks
 */
public class TelaRestaurar extends javax.swing.JDialog {

    TelaPrinc telaP;
    String nome;
    String turma;
    String end;
    String tel;
    String codigo;
    TelaGerAluno telaGer;
    
    public TelaRestaurar(TelaPrinc telaP) {
       
        
        
        
        
        
        ImageIcon icone = new ImageIcon(getClass().getResource("/Img/icone/icone.png"));
       this.setIconImage(icone.getImage()); 
       
      
       this.telaP = telaP;
       
       
       
        this.setResizable(false);
        
        initComponents();
        
        
        
        bConcluiEd.setVerticalTextPosition(SwingConstants.BOTTOM);
        bConcluiEd.setHorizontalTextPosition(SwingConstants.CENTER);
        
        bCancelarEd.setVerticalTextPosition(SwingConstants.BOTTOM);
        bCancelarEd.setHorizontalTextPosition(SwingConstants.CENTER);
        
        
      bVoltar.setVerticalTextPosition(SwingConstants.BOTTOM);
        bVoltar.setHorizontalTextPosition(SwingConstants.CENTER);
        
        
        
        //leitura dos backups:
        
          DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            model.setNumRows(0);
        
        
          String username = System.getProperty("user.name");
  
          String localAtual = System.getProperty("user.dir"); 
          String path = localAtual+"\\backups";
        
  String files;
  File folder = new File(path);
  File[] listOfFiles = folder.listFiles(); 
 
  if(listOfFiles != null){
  
  for (int i = 0; i < listOfFiles.length; i++) {
 
   if (listOfFiles[i].isFile()) {
   files = listOfFiles[i].getName();
       if (files.endsWith(".sql") || files.endsWith(".SQL")){
               
           String dataCriado = (new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(listOfFiles[i].lastModified())));
       String modoAdd;
       
         if(files.length()>14){
             modoAdd = "Não";
         }
         else{
             modoAdd = "Sim";
         }
       
           
      
       model.addRow(new Object[]{listOfFiles[i].getName(),dataCriado,modoAdd   });
        
        }
     }
 
  }
  }
        
        
        
        
        
        
        
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
        bConcluiEd = new javax.swing.JButton();
        bCancelarEd = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Restaurar o sistema");
        setFocusCycleRoot(false);
        setMinimumSize(new java.awt.Dimension(846, 607));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(26, 141, 189));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Restaurar o sistema");

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

        jPanel4.setBackground(new java.awt.Color(26, 141, 189));

        bConcluiEd.setContentAreaFilled(false);
        bConcluiEd.setFocusPainted(false);
        bConcluiEd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bConcluiEd.setForeground(new java.awt.Color(240, 240, 240));
        bConcluiEd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/restaurar.png"))); // NOI18N
        bConcluiEd.setText("<html><center>Restaurar");
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
        bCancelarEd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/deletarBackup.png"))); // NOI18N
        bCancelarEd.setText("<html><center>Deletar<br>Backup");
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

        bVoltar.setContentAreaFilled(false);
        bVoltar.setFocusPainted(false);
        bVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bVoltar.setForeground(new java.awt.Color(240, 240, 240));
        bVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/voltar.png"))); // NOI18N
        bVoltar.setText("<html><center>Voltar");
        bVoltar.setBorderPainted(false);
        bVoltar.setContentAreaFilled(false);
        bVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bVoltarMouseExited(evt);
            }
        });
        bVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVoltarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(bVoltar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(bConcluiEd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, bCancelarEd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(31, 31, 31)
                .add(bConcluiEd)
                .add(56, 56, 56)
                .add(bCancelarEd)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 190, Short.MAX_VALUE)
                .add(bVoltar)
                .add(74, 74, 74))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 100, 100, 510);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Data de criação", "Criado automaticamente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setMinWidth(150);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(130, 170, 700, 402);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Pontos de restauração");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 130, 210, 30);

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

 
    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      
     
            telaP.setEnabled(true);
          
            
            this.dispose();
           
          
      
    
       
        
        
    }//GEN-LAST:event_formWindowClosing

    
    public void restaurar() throws IOException{
         String localAtual = System.getProperty("user.dir"); 
         File arquivo = new File( localAtual+"\\lib\\SBEduc_restaurar.cmd" );
        
        //Se não existe, cria o script:
        if(!arquivo.exists()){
            try {
                arquivo.createNewFile();
            } catch (IOException ex) {
             //   Logger.getLogger(TelaRestaurar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      //  FileWriter fw = new FileWriter( arquivo );
       
 
       
        FileWriter fw = new FileWriter( arquivo, false ); //false, pq irá sobrescrever o arquivo, para definir qual backup será restaurado
        
            BufferedWriter bw = new BufferedWriter( fw );
      /*Criar arquivo para realizar o backup:  
        bw.write( "@echo off" );
        bw.newLine();
        bw.write( "FOR /F \"tokens=1,2,3 delims=/ \" %%a in (\"%DATE%\") do (" );
        bw.newLine();
        bw.write( "set DIA=%%a" );
        bw.newLine();
        bw.write( "set MES=%%b" );
        bw.newLine();
        bw.write( "set ANO=%%c" );
        bw.newLine();
        bw.write( ")" );
        bw.newLine();
        bw.write( "FOR /F \"tokens=1,2,3 delims=:, \" %%a in (\"%TIME%\") do (" );
        bw.newLine();
        bw.write( "set H=%%a" );
        bw.newLine();
        bw.write( "set M=%%b" );
        bw.newLine();
        bw.write( "set S=%%c" );
        bw.newLine();
        bw.write( ")" );
        bw.newLine();
        bw.write( "set H=0%H%" );
        bw.newLine();
        bw.write( "set H=%H:~-2%" );
        bw.newLine();
        bw.write( "set FORMATO=%ANO%_%MES%_%DIA%__%H%_%M%_%S%" );
        bw.newLine();
        bw.write( "echo %FORMATO%" );
        bw.newLine();
        bw.write( "cd \"C:\\Program Files\\MySQL\\MySQL Server 5.6\\bin\"" );
        bw.newLine();
        bw.write( "mysqldump -u root -h localhost --databases biblioteca> C:\\Users\\%USERNAME%\\Desktop\\SBEduc\\backups\\%FORMATO%.sql" );

        */
        bw.write( "cd \"C:\\Program Files\\MySQL\\MySQL Server 5.6\\bin\"" );
         bw.newLine();
         
//pega o nome da linha selecionada:
         int linha = jTable1.getSelectedRow();
        if(linha == -1){         
           JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha na tabela\npara completar essa ação.","Selecione uma linha",JOptionPane.INFORMATION_MESSAGE);
       }
        else{
        
        
        
       String nomeBackup = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);  
      
      
       bw.write( "mysql -u root < \""+localAtual+"\\backups\\"+nomeBackup+"\" " );
         
        }
         
        
           
             bw.close();
               
             fw.close();
          
            
            
            try {
                   
            Runtime.getRuntime().exec("\""+localAtual+"\\lib\\SBEduc_restaurar.cmd\""); 
                                      
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null,"Erro","Não foi possível restaurar o sistema",JOptionPane.ERROR_MESSAGE);
        }
         JOptionPane.showMessageDialog(null,"Restauração concluída","Sistema restaurado com êxito.",JOptionPane.INFORMATION_MESSAGE);
            
       
        
    }
    
    
    
    private void bConcluiEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConcluiEdActionPerformed

      
  
            try {
                this.restaurar();
            } catch (IOException ex) {
              //  Logger.getLogger(TelaRestaurar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
      
        
        
    }//GEN-LAST:event_bConcluiEdActionPerformed

    private void bCancelarEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarEdActionPerformed
      
     //  this.setAlwaysOnTop(false);
    Object[] options = { "Sim", "Não" };  
     int op = JOptionPane.showOptionDialog(null,"Deseja excluir este ponto de restauração?",  "Excluir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
       
        if(op==0){
          //SIM
            
            String nomeBackup = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);  
           
        String localAtual = System.getProperty("user.dir"); 
       // System.out.println(localAtual);
        File arquivo = new File( localAtual+"\\backups\\"+nomeBackup );
           
        if( ! arquivo.exists() ){
    JOptionPane.showMessageDialog(null,"Erro","O backup selecionado foi removido préviamente e não existe mais.",JOptionPane.ERROR_MESSAGE);
        
        
}
        else{
            
            if( arquivo.delete() ){
    
    DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel(); 
    dtm.removeRow(jTable1.getSelectedRow());            
    JOptionPane.showMessageDialog(null,"Excluido com sucesso","Backup excluído com êxito.",JOptionPane.INFORMATION_MESSAGE);
   
    
    
    
}else{
     JOptionPane.showMessageDialog(null,"Erro","O backup selecionado não pôde ser excluído.",JOptionPane.ERROR_MESSAGE);
}
            
        }
        
        
        
        }
        else{
        
        }
    
    
    }//GEN-LAST:event_bCancelarEdActionPerformed

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

    private void bVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseEntered
        bVoltar.setForeground(Color.black);
    }//GEN-LAST:event_bVoltarMouseEntered

    private void bVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVoltarMouseExited
        bVoltar.setForeground(Color.white);
    }//GEN-LAST:event_bVoltarMouseExited

    private void bVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVoltarActionPerformed
        this.dispose();
        telaP.toFront();
        telaP.setEnabled(true);
    }//GEN-LAST:event_bVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelarEd;
    private javax.swing.JButton bConcluiEd;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
