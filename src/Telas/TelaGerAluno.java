/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luks
 */
public class TelaGerAluno extends javax.swing.JDialog {

    TelaPrinc telaP;
    

    
    public TelaGerAluno(TelaPrinc telaP) {
       
       ImageIcon icone = new ImageIcon(getClass().getResource("/Img/icone/icone.png"));
       this.setIconImage(icone.getImage()); 
       
      
        initComponents();
        
        
        
        bVoltar.setVerticalTextPosition(SwingConstants.BOTTOM);
        bVoltar.setHorizontalTextPosition(SwingConstants.CENTER);
        
   
        
        bEditarLeitor.setVerticalTextPosition(SwingConstants.BOTTOM);
        bEditarLeitor.setHorizontalTextPosition(SwingConstants.CENTER);
        
        bExcluir.setVerticalTextPosition(SwingConstants.BOTTOM);
        bExcluir.setHorizontalTextPosition(SwingConstants.CENTER);
        
        
        
        this.telaP = telaP;
        this.setLocationRelativeTo(null);
        
        this.setVisible(true);
        
        this.atualizaTabela();
        
        
        
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
        bExcluir = new javax.swing.JButton();
        bEditarLeitor = new javax.swing.JButton();
        bVoltar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Leitores");
        setMinimumSize(new java.awt.Dimension(1044, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(26, 141, 189));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gerenciar Leitores");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(42, 42, 42)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 328, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(26, 141, 189));

        bExcluir.setContentAreaFilled(false);
        bExcluir.setFocusPainted(false);
        bExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bExcluir.setForeground(new java.awt.Color(240, 240, 240));
        bExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/removerAluno2.png"))); // NOI18N
        bExcluir.setText("<html><center>Remover<br>Leitor");
        bExcluir.setBorderPainted(false);
        bExcluir.setContentAreaFilled(false);
        bExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bExcluirMouseExited(evt);
            }
        });
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        bEditarLeitor.setContentAreaFilled(false);
        bEditarLeitor.setFocusPainted(false);
        bEditarLeitor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bEditarLeitor.setForeground(new java.awt.Color(240, 240, 240));
        bEditarLeitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/editarAluno2.png"))); // NOI18N
        bEditarLeitor.setText("<html><center>Editar<br>Leitor");
        bEditarLeitor.setBorderPainted(false);
        bEditarLeitor.setContentAreaFilled(false);
        bEditarLeitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bEditarLeitorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bEditarLeitorMouseExited(evt);
            }
        });
        bEditarLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarLeitorActionPerformed(evt);
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
            .add(bVoltar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, Short.MAX_VALUE)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(bEditarLeitor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(bExcluir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(32, 32, 32)
                .add(bEditarLeitor)
                .add(30, 30, 30)
                .add(bExcluir)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(bVoltar)
                .add(54, 54, 54))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Pesquisar Leitor");

        tPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPesquisarActionPerformed(evt);
            }
        });
        tPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tPesquisarKeyReleased(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome do Leitor", "Turma", "Endereço", "Telefone", "Data de Registro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(60);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setMinWidth(60);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(30, 30, 30)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(tPesquisar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                        .add(430, 430, 430))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane1))
                        .add(70, 70, 70))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(10, 10, 10)
                        .add(tPesquisar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(30, 30, 30)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 362, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(68, Short.MAX_VALUE))))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPesquisarActionPerformed
    if(tPesquisar.getText().equals("")){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca","root","");
            
            String query = "select * from alunos ORDER BY nome_aluno ASC";
            
            PreparedStatement st = conec.prepareStatement(query);
            
           
            
            
            //Até aqui em cima, tudo igual a antes.
            
            //Agora, declarar o ResultSet, que vai pegar o resultado do BD
            
            ResultSet rs = st.executeQuery();
            
            //Agora, mostrar o resultado da pesquisa:
               
            
            //Mostrar na tabela:
            
            //Cria o modelo padrão da tabela:
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            model.setNumRows(0);
            
            while(rs.next()){
                
                
                //Cria o novo vetor delimitando o tamanho e valores por CHAVES { }
    model.addRow(new Object[]{rs.getString("codigo"),rs.getString("nome_aluno"),rs.getString("turma"),rs.getString("endereço"),rs.getString("telefone"),rs.getString("data_cad"),   });
                
               
              
            }
            
       
            
            
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o BD");
        }
         tPesquisar.setText("");
    }
           
        
       else{
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca","root","");
            
            String query = "select * from alunos where nome_aluno like ? or turma like ? or data_cad like ? or endereço like ? or telefone like ? ORDER BY nome_aluno ASC";
            
            PreparedStatement st = conec.prepareStatement(query);
            
            st.setString(1,"%"+tPesquisar.getText()+"%");
            st.setString(2,"%"+tPesquisar.getText()+"%");
            st.setString(3,"%"+tPesquisar.getText()+"%");
            st.setString(4,"%"+tPesquisar.getText()+"%");
            st.setString(5,"%"+tPesquisar.getText()+"%");
            
            
            //Até aqui em cima, tudo igual a antes.
            
            //Agora, declarar o ResultSet, que vai pegar o resultado do BD
            
            ResultSet rs = st.executeQuery();
            
            //Agora, mostrar o resultado da pesquisa:
            
            
            
            
            //Mostrar na tabela:
            
            //Cria o modelo padrão da tabela:
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            model.setNumRows(0);
            
            while(rs.next()){
                
                
                //Cria o novo vetor delimitando o tamanho e valores por CHAVES { }
           model.addRow(new Object[]{rs.getString("codigo"),rs.getString("nome_aluno"),rs.getString("turma"),rs.getString("endereço"),rs.getString("telefone"),rs.getString("data_cad"),   });
                
               
              
            }
            
            
            
            
             tPesquisar.setText("");
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o BD");
        }
       
       }
          
    }//GEN-LAST:event_tPesquisarActionPerformed

 
    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       // telaP.GerencAlunoAberto = false;
        telaP.setEnabled(true);
        
        
    }//GEN-LAST:event_formWindowClosing

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
  int linha = jTable1.getSelectedRow();
        if(linha == -1){         
           JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha na tabela\npara completar essa ação.","Selecione uma linha",JOptionPane.INFORMATION_MESSAGE);
       }
        else{
        
        Object[] options = { "Sim", "Não" };  
//this.setAlwaysOnTop(false);    
int op = JOptionPane.showOptionDialog(null,"Deseja realmente remover o leitor "+(String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1)+" ?",  "Remover Leitor", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
 //this.setAlwaysOnTop(true);      
        if(op==0){
    
        //EXCLUI
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca","root","");
            
            String query = "delete from alunos where codigo = ?";
            
            PreparedStatement st = conec.prepareStatement(query);
            
            String index = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
            
            st.setString(1,index);
            
            

            
           st.executeUpdate();
            

            st.close();
            conec.close();
            
            
            
       
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o BD");
        }

//Atualiza

try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca","root","");
            
            String query = "select * from alunos";
            
            PreparedStatement st = conec.prepareStatement(query);
            
           
            
            
            //Até aqui em cima, tudo igual a antes.
            
            //Agora, declarar o ResultSet, que vai pegar o resultado do BD
            
            ResultSet rs = st.executeQuery();
            
            //Agora, mostrar o resultado da pesquisa:
            
            
            
            
            //Mostrar na tabela:
            
            //Cria o modelo padrão da tabela:
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            model.setNumRows(0);
            
            while(rs.next()){
                
                
                //Cria o novo vetor delimitando o tamanho e valores por CHAVES { }
       model.addRow(new Object[]{rs.getString("codigo"),rs.getString("nome_aluno"),rs.getString("turma"),rs.getString("endereço"),rs.getString("telefone"),rs.getString("data_cad"),   });
                
               
              
            }
            
            
            
            
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o BD");
        }
        }
        

       
        } 
    }//GEN-LAST:event_bExcluirActionPerformed

    public void atualizaTabela(){
          try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca","root","");
            
            String query = "select * from alunos ORDER BY nome_aluno ASC";
            
            PreparedStatement st = conec.prepareStatement(query);

            
            //Até aqui em cima, tudo igual a antes.
            
            //Agora, declarar o ResultSet, que vai pegar o resultado do BD
            
            ResultSet rs = st.executeQuery();
            
            //Agora, mostrar o resultado da pesquisa:
            
            
            
            
            //Mostrar na tabela:
            
            //Cria o modelo padrão da tabela:
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            model.setNumRows(0);
            
            while(rs.next()){
                
                
                //Cria o novo vetor delimitando o tamanho e valores por CHAVES { }
                model.addRow(new Object[]{rs.getString("codigo"),rs.getString("nome_aluno"),rs.getString("turma"),rs.getString("endereço"),rs.getString("telefone"),rs.getString("data_cad"),   });
                
               //Mostra no console:
                //Campo (nome) do BD
               ;
            }
            
            
            
            
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o BD");
        }
    }
    
    
    
    private void bEditarLeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarLeitorActionPerformed

              int linha = jTable1.getSelectedRow();
        if(linha == -1){         
           JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha na tabela\npara completar essa ação.","Selecione uma linha",JOptionPane.INFORMATION_MESSAGE);
       }
        else{
        
        
        
       String codigo = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
       String nome = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1);
       String turma = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2);
       String end = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3);
       String tel = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4);
       
       TelaEditAluno telaEditAluno = new TelaEditAluno(telaP,this,codigo,nome,turma,end,tel);
     //  this.setAlwaysOnTop(false);
       this.setEnabled(false);
       this.setFocusable(false);
        }
        
    }//GEN-LAST:event_bEditarLeitorActionPerformed

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

    private void bEditarLeitorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEditarLeitorMouseEntered
        bEditarLeitor.setForeground(Color.black);
    }//GEN-LAST:event_bEditarLeitorMouseEntered

    private void bEditarLeitorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bEditarLeitorMouseExited
        bEditarLeitor.setForeground(Color.white);
    }//GEN-LAST:event_bEditarLeitorMouseExited

    private void bExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExcluirMouseEntered
        bExcluir.setForeground(Color.black);
    }//GEN-LAST:event_bExcluirMouseEntered

    private void bExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExcluirMouseExited
         bExcluir.setForeground(Color.white);
    }//GEN-LAST:event_bExcluirMouseExited

    private void tPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPesquisarKeyReleased
         if(tPesquisar.getText().equals("")){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca","root","");
            
            String query = "select * from alunos ORDER BY nome_aluno ASC";
            
            PreparedStatement st = conec.prepareStatement(query);
            
           
            
            
            //Até aqui em cima, tudo igual a antes.
            
            //Agora, declarar o ResultSet, que vai pegar o resultado do BD
            
            ResultSet rs = st.executeQuery();
            
            //Agora, mostrar o resultado da pesquisa:
               
            
            //Mostrar na tabela:
            
            //Cria o modelo padrão da tabela:
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            model.setNumRows(0);
            
            while(rs.next()){
                
                
                //Cria o novo vetor delimitando o tamanho e valores por CHAVES { }
    model.addRow(new Object[]{rs.getString("codigo"),rs.getString("nome_aluno"),rs.getString("turma"),rs.getString("endereço"),rs.getString("telefone"),rs.getString("data_cad"),   });
                
               
              
            }
            
       
            
            
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o BD");
        }
        
    }
           
        
       else{
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca","root","");
            
            String query = "select * from alunos where nome_aluno like ? or turma like ? or data_cad like ? or endereço like ? or telefone like ? ORDER BY nome_aluno ASC";
            
            PreparedStatement st = conec.prepareStatement(query);
            
            st.setString(1,"%"+tPesquisar.getText()+"%");
            st.setString(2,"%"+tPesquisar.getText()+"%");
            st.setString(3,"%"+tPesquisar.getText()+"%");
            st.setString(4,"%"+tPesquisar.getText()+"%");
            st.setString(5,"%"+tPesquisar.getText()+"%");
            
            
            //Até aqui em cima, tudo igual a antes.
            
            //Agora, declarar o ResultSet, que vai pegar o resultado do BD
            
            ResultSet rs = st.executeQuery();
            
            //Agora, mostrar o resultado da pesquisa:
            
            
            
            
            //Mostrar na tabela:
            
            //Cria o modelo padrão da tabela:
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            model.setNumRows(0);
            
            while(rs.next()){
                
                
                //Cria o novo vetor delimitando o tamanho e valores por CHAVES { }
           model.addRow(new Object[]{rs.getString("codigo"),rs.getString("nome_aluno"),rs.getString("turma"),rs.getString("endereço"),rs.getString("telefone"),rs.getString("data_cad"),   });
                
               
              
            }
            
            
            
            
             
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o BD");
        }
       
       }
    }//GEN-LAST:event_tPesquisarKeyReleased

    public void reabrirEdit() {                                             
       
       String codigo = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
       String nome = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1);
       String turma = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2);
       String end = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3);
       String tel = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4);
        telaP.toFront();
       
       TelaEditAluno telaEditAluno = new TelaEditAluno(telaP,this,codigo,nome,turma,end,tel);
      telaEditAluno.toFront();
       
       
        
    }   
    
    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEditarLeitor;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tPesquisar;
    // End of variables declaration//GEN-END:variables
}
