/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author luks
 */
public class TelaPrinc extends javax.swing.JFrame {

  
 TelaCadAluno telaCadA;
 TelaCadLivro telaCadL;
 TelaGerAluno telaGerencAluno;
 TelaGerLivro telaGerencLivro;
 TelaEmprestimo telaEfetuarEmprestimo;
 int hh,mm,ss,h;
 Calendar hora;
 DecimalFormat formato;
 TableModel model;
 boolean bloquearBackup = false;
    
    public TelaPrinc() {
        initComponents();
        
        //TEXT BOTOES CONFIG
        
        bRegEmpr.setVerticalTextPosition(SwingConstants.BOTTOM);
        bRegEmpr.setHorizontalTextPosition(SwingConstants.CENTER); 
        
        bCadAluno1.setVerticalTextPosition(SwingConstants.BOTTOM);
        bCadAluno1.setHorizontalTextPosition(SwingConstants.CENTER);
        
         bGerencAluno1.setVerticalTextPosition(SwingConstants.BOTTOM);
        bGerencAluno1.setHorizontalTextPosition(SwingConstants.CENTER);
        
         bCadLivro1.setVerticalTextPosition(SwingConstants.BOTTOM);
        bCadLivro1.setHorizontalTextPosition(SwingConstants.CENTER);
        
         bGerencLivro1.setVerticalTextPosition(SwingConstants.BOTTOM);
        bGerencLivro1.setHorizontalTextPosition(SwingConstants.CENTER);
        
         bLogout.setVerticalTextPosition(SwingConstants.BOTTOM);
        bLogout.setHorizontalTextPosition(SwingConstants.CENTER);
        
         bDevolveuLivro.setVerticalTextPosition(SwingConstants.BOTTOM);
        bDevolveuLivro.setHorizontalTextPosition(SwingConstants.CENTER);
        
        
        jButton1.setVerticalTextPosition(SwingConstants.BOTTOM);
        jButton1.setHorizontalTextPosition(SwingConstants.CENTER);
        
        jButton2.setVerticalTextPosition(SwingConstants.BOTTOM);
        jButton2.setHorizontalTextPosition(SwingConstants.CENTER);
        
         ImageIcon icone = new ImageIcon(getClass().getResource("/Img/icone/icone.png"));
       this.setIconImage(icone.getImage()); 
     
       this.setTitle("Sistema Bibliotecário Educacional");
        this.setLocationRelativeTo(null);
     //   this.setResizable(false);
       
       
        
        
        this.toFront();
     
  
    
        
        
        
        ActionListener tarefa = (new ActionListener(){
public void actionPerformed(ActionEvent e){
HORAS();
}
});

        
javax.swing.Timer time = new javax.swing.Timer(1000,tarefa);
time.start();
        
        
      //  this.setLayout(null);


tMonitor.getColumnModel().getColumn(0).setResizable(false);
tMonitor.getColumnModel().getColumn(0).setMaxWidth(60);
tMonitor.getColumnModel().getColumn(2).setResizable(false);
tMonitor.getColumnModel().getColumn(2).setMaxWidth(60);



 try {
         this.backupAutomatico();
     } catch (IOException ex) {
       //  Logger.getLogger(TelaPrinc.class.getName()).log(Level.SEVERE, null, ex);
     }
 
 /*
    try {
            Runtime.getRuntime().exec("SBEduc_backup.cmd"); //backup manual
        } catch (IOException ex) {
          // JOptionPane.showMessageDialog(null,"Erro","Não foi possível realizar o backup manual.\nO seu banco de dados está configurado corretamente?",JOptionPane.ERROR_MESSAGE);
        }
        // JOptionPane.showMessageDialog(null,"Backup realizado","Backup manual salvo com êxito.",JOptionPane.INFORMATION_MESSAGE);
 
*/


 this.setExtendedState(this.MAXIMIZED_BOTH); 
 this.atualizaTabela();
         this.setVisible(true);
        
  
         
         
         
        
    }
    
      public void atualizaTabela(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca","root","");
            
            String query = "select * from painel";
            
            PreparedStatement st = conec.prepareStatement(query);
            
           
            
            
            //Até aqui em cima, tudo igual a antes.
            
            //Agora, declarar o ResultSet, que vai pegar o resultado do BD
            
            ResultSet rs = st.executeQuery();
            
            //Agora, mostrar o resultado da pesquisa:
            
            
            
            
            //Mostrar na tabela:
            
            //Cria o modelo padrão da tabela:
            
            DefaultTableModel model = (DefaultTableModel) tMonitor.getModel();
            
            model.setNumRows(0);
            
            while(rs.next()){
                
                
                //Cria o novo vetor delimitando o tamanho e valores por CHAVES { }
                model.addRow(new Object[]{rs.getString("codigo"),rs.getString("nome_aluno"),rs.getString("turma"),rs.getString("livro"),rs.getString("data_dev")  });
                
               
              
            }
            
            
       
            
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o BD");
        }
    }
  
    
    
    private void HORAS(){
hora = Calendar.getInstance();
hh = hora.get(Calendar.HOUR_OF_DAY);
mm = hora.get(Calendar.MINUTE);
ss = hora.get(Calendar.SECOND);
formato = new DecimalFormat("00");
rotulo.setText(""+formatar(hh)+":"+formatar(mm)+":"+formatar(ss));
}
private String formatar(int num){
formato = new DecimalFormat("00");
return formato.format(num);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        rotulo = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bRegEmpr = new javax.swing.JButton();
        bCadAluno1 = new javax.swing.JButton();
        bCadLivro1 = new javax.swing.JButton();
        bGerencLivro1 = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();
        bGerencAluno1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMonitor = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bDevolveuLivro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tPesquisar = new javax.swing.JTextField();
        bPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1366, 650));

        jPanel2.setBackground(new java.awt.Color(0, 155, 219));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Sistema Bibliotecário Educacional");

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Licenciado para: Colégio Estadual Cônego Scherer");

        data.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        data.setForeground(new java.awt.Color(240, 240, 240));
        data.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));

        rotulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rotulo.setForeground(new java.awt.Color(240, 240, 240));
        rotulo.setText("01:51:00");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/info.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(40, 40, 40)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(80, 80, 80)
                        .add(jLabel3)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 298, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(data, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(9, 9, 9)
                        .add(rotulo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(16, 16, 16)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(rotulo)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(data)
                .add(24, 24, 24))
            .add(jPanel2Layout.createSequentialGroup()
                .add(30, 30, 30)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton3)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jLabel2)
                        .add(5, 5, 5)
                        .add(jLabel3)))
                .add(9, 9, 9))
        );

        jPanel3.setBackground(new java.awt.Color(0, 155, 219));

        bRegEmpr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bRegEmpr.setForeground(new java.awt.Color(240, 240, 240));
        bRegEmpr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/nRegEmpr.png"))); // NOI18N
        bRegEmpr.setText("<html><center>Efetuar<br>Empréstimo");
        bRegEmpr.setBorderPainted(false);
        bRegEmpr.setContentAreaFilled(false);
        bRegEmpr.setFocusPainted(false);
        bRegEmpr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bRegEmprMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bRegEmprMouseExited(evt);
            }
        });
        bRegEmpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegEmprActionPerformed(evt);
            }
        });

        bCadAluno1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bCadAluno1.setForeground(new java.awt.Color(240, 240, 240));
        bCadAluno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/nCadastrarAluno.png"))); // NOI18N
        bCadAluno1.setText("<html><center>Novo<br>Leitor");
        bCadAluno1.setBorderPainted(false);
        bCadAluno1.setContentAreaFilled(false);
        bCadAluno1.setFocusPainted(false);
        bCadAluno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCadAluno1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCadAluno1MouseExited(evt);
            }
        });
        bCadAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadAluno1ActionPerformed(evt);
            }
        });

        bCadLivro1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bCadLivro1.setForeground(new java.awt.Color(240, 240, 240));
        bCadLivro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/cadastrarLivro2.png"))); // NOI18N
        bCadLivro1.setText("<html><center>Adicionar<br>ao Acervo");
        bCadLivro1.setBorderPainted(false);
        bCadLivro1.setContentAreaFilled(false);
        bCadLivro1.setFocusPainted(false);
        bCadLivro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCadLivro1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCadLivro1MouseExited(evt);
            }
        });
        bCadLivro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadLivro1ActionPerformed(evt);
            }
        });

        bGerencLivro1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bGerencLivro1.setForeground(new java.awt.Color(240, 240, 240));
        bGerencLivro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/gerenciarLivros2.png"))); // NOI18N
        bGerencLivro1.setText("<html><center>Gerenciar<br>Acervo");
        bGerencLivro1.setBorderPainted(false);
        bGerencLivro1.setContentAreaFilled(false);
        bGerencLivro1.setFocusPainted(false);
        bGerencLivro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bGerencLivro1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bGerencLivro1MouseExited(evt);
            }
        });
        bGerencLivro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGerencLivro1ActionPerformed(evt);
            }
        });

        bLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bLogout.setForeground(new java.awt.Color(240, 240, 240));
        bLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/logout2.png"))); // NOI18N
        bLogout.setText("<html><center>Sair");
        bLogout.setBorderPainted(false);
        bLogout.setContentAreaFilled(false);
        bLogout.setFocusPainted(false);
        bLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bLogoutMouseExited(evt);
            }
        });
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });

        bGerencAluno1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bGerencAluno1.setForeground(new java.awt.Color(240, 240, 240));
        bGerencAluno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/gerenciarAlunos2.png"))); // NOI18N
        bGerencAluno1.setText("<html><center>Gerenciar<br>Leitores");
        bGerencAluno1.setBorderPainted(false);
        bGerencAluno1.setContentAreaFilled(false);
        bGerencAluno1.setFocusPainted(false);
        bGerencAluno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bGerencAluno1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bGerencAluno1MouseExited(evt);
            }
        });
        bGerencAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGerencAluno1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(bLogout, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(7, 7, 7))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(bCadAluno1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(bRegEmpr, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, bCadLivro1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, bGerencAluno1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, bGerencLivro1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(bRegEmpr, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(bCadAluno1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(bCadLivro1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(bGerencAluno1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(bGerencLivro1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(bLogout, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));

        tMonitor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tMonitor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome do Leitor", "Turma", "Livro Pego", "Data Devolução"
            })
            {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            tMonitor.getTableHeader().setReorderingAllowed(false);
            jScrollPane1.setViewportView(tMonitor);

            jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 255, 255));
            jLabel5.setText("Devoluções Pendentes");

            jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setText("Operações");

            jPanel1.setBackground(new java.awt.Color(204, 204, 204));
            jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jPanel1.setForeground(new java.awt.Color(240, 240, 240));
            jPanel1.setMinimumSize(new java.awt.Dimension(1024, 768));

            bDevolveuLivro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            bDevolveuLivro.setForeground(new java.awt.Color(51, 51, 51));
            bDevolveuLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/devolveuLivro2.png"))); // NOI18N
            bDevolveuLivro.setText("<html><center>Devolveu<br>Item");
            bDevolveuLivro.setBorderPainted(false);
            bDevolveuLivro.setContentAreaFilled(false);
            bDevolveuLivro.setFocusPainted(false);
            bDevolveuLivro.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    bDevolveuLivroMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    bDevolveuLivroMouseExited(evt);
                }
            });
            bDevolveuLivro.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bDevolveuLivroActionPerformed(evt);
                }
            });

            jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/backupManual.png"))); // NOI18N
            jButton1.setText("<html><center>Backup<br>Manual");
            jButton1.setBorderPainted(false);
            jButton1.setContentAreaFilled(false);
            jButton1.setFocusPainted(false);
            jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jButton1MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jButton1MouseExited(evt);
                }
            });
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/restauracao.png"))); // NOI18N
            jButton2.setText("<html><center>Restaurar<br>Sistema");
            jButton2.setBorderPainted(false);
            jButton2.setContentAreaFilled(false);
            jButton2.setFocusPainted(false);
            jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jButton2MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jButton2MouseExited(evt);
                }
            });
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(bDevolveuLivro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(34, 34, 34)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(38, 38, 38)
                    .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel1Layout.createSequentialGroup()
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(bDevolveuLivro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jButton1)
                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

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

            bPesquisar.setContentAreaFilled(false);
            bPesquisar.setFocusPainted(false);
            bPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botoes/pesquisar.png"))); // NOI18N
            bPesquisar.setBorderPainted(false);
            bPesquisar.setContentAreaFilled(false);
            bPesquisar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bPesquisarActionPerformed(evt);
                }
            });

            org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel4Layout.createSequentialGroup()
                    .add(38, 38, 38)
                    .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jPanel4Layout.createSequentialGroup()
                            .add(tPesquisar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 429, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(bPesquisar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(jPanel4Layout.createSequentialGroup()
                            .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel4)
                                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 948, Short.MAX_VALUE)
                                .add(jLabel5)
                                .add(jScrollPane1))
                            .add(20, 20, 20))))
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel4Layout.createSequentialGroup()
                    .add(51, 51, 51)
                    .add(jLabel5)
                    .add(18, 18, 18)
                    .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(tPesquisar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(bPesquisar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(20, 20, 20)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .add(35, 35, 35)
                    .add(jLabel4)
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(30, 30, 30))
            );

            org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, 0)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
         
         
        System.exit(0); 
      
    }//GEN-LAST:event_bLogoutActionPerformed

    private void bCadAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadAluno1ActionPerformed
         telaCadA = new TelaCadAluno(this,data.getText());
         //    telaCadA.setAlwaysOnTop(true);
             this.setEnabled(false);
             this.setFocusable(false);
    }//GEN-LAST:event_bCadAluno1ActionPerformed

    private void bCadLivro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadLivro1ActionPerformed
        telaCadL = new TelaCadLivro(this,data.getText());
      //  telaCadL.setAlwaysOnTop(true);
         this.setEnabled(false);
         this.setFocusable(false);
    }//GEN-LAST:event_bCadLivro1ActionPerformed

    private void bGerencAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGerencAluno1ActionPerformed
       telaGerencAluno = new TelaGerAluno(this);
       // telaGerencAluno.setAlwaysOnTop(true);
         this.setEnabled(false);
         this.setFocusable(false);
    }//GEN-LAST:event_bGerencAluno1ActionPerformed

    private void bGerencLivro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGerencLivro1ActionPerformed
         telaGerencLivro = new TelaGerLivro(this);
       // telaGerencLivro.setAlwaysOnTop(true);
         this.setEnabled(false);
         this.setFocusable(false);
    }//GEN-LAST:event_bGerencLivro1ActionPerformed

    private void bRegEmprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegEmprActionPerformed
         telaEfetuarEmprestimo = new TelaEmprestimo(this);
       this.setEnabled(false);
         this.setFocusable(false);
    }//GEN-LAST:event_bRegEmprActionPerformed

    private void bDevolveuLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDevolveuLivroActionPerformed
      
          String nomeLivro = (String) tMonitor.getModel().getValueAt(tMonitor.getSelectedRow(), 3);
    int quantidade = 0;
        
        int linha = tMonitor.getSelectedRow();
        if(linha == -1){         
           JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha na tabela\npara completar essa ação.","Selecione uma linha",JOptionPane.INFORMATION_MESSAGE);
       }
        else{
        
        Object[] options = { "Sim", "Não" };  
//this.setAlwaysOnTop(false);    
int op = JOptionPane.showOptionDialog(null,"O leitor "+(String) tMonitor.getModel().getValueAt(tMonitor.getSelectedRow(), 1)+" devolveu o item "+(String) tMonitor.getModel().getValueAt(tMonitor.getSelectedRow(), 3)  +"?",  "Devolveu o item?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
//this.setAlwaysOnTop(true);       
        if(op==0){
            
  
    
        //EXCLUI
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca","root","");
            
            String query = "delete from painel where codigo = ?";
            
            PreparedStatement st = conec.prepareStatement(query);
            
            String index = (String) tMonitor.getModel().getValueAt(tMonitor.getSelectedRow(), 0);
            
            st.setString(1,index);
            
            

            
           st.executeUpdate();
            

            st.close();
            conec.close();
            
            
            
       
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o BD");
        }

        
        //pega quantidade atual
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca","root","");
            
            String query = "select * from livros";
            
            PreparedStatement st = conec.prepareStatement(query);

            
            //Até aqui em cima, tudo igual a antes.
            
            //Agora, declarar o ResultSet, que vai pegar o resultado do BD
            
            ResultSet rs = st.executeQuery();
           
            
            while(rs.next()){
                
                if(rs.getString("titulo_livro").equals(nomeLivro)){
                    quantidade = Integer.parseInt( rs.getString("disponibilidade"));
                }
              
            }
             
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o BD");
        }
    

        //seta nova quantidade disponivel
         try {
            Class.forName("com.mysql.jdbc.Driver");
        
        //Cria a conection (java.sql) e conecta ao bd
            
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca", "root" ,"");
        
            // A partir daqui, já conectou no BD. 
            
            //Insere dados no bd:
            
            //String query, recebe comandos do SQL
            String query = "update livros set disponibilidade=? where titulo_livro=?";
      
            //Cria o comando que envia para o SQL
            
            //Seta os valores dos ? nos values da string de inserção
            quantidade++;
            
            PreparedStatement st = conec.prepareStatement(query);
            st.setInt(1,quantidade);
            st.setString(2, nomeLivro);


           
            
            
            //executa o comando
            st.executeUpdate();
            
            //Fecha o comando e a execução
            st.close();
            conec.close();
            
            
        
        
        } catch (ClassNotFoundException ex) {
            System.out.println("Não encontrou a Classe");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar no sql");
        }
        
        
        
        
//Atualiza

this.atualizaTabela();
        
        }
        
        
    }
    }//GEN-LAST:event_bDevolveuLivroActionPerformed

    private void bRegEmprMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRegEmprMouseEntered
      // JOptionPane.showMessageDialog(null, "animação pintura ON");
       bRegEmpr.setForeground(Color.black);
      
    }//GEN-LAST:event_bRegEmprMouseEntered

    private void bRegEmprMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bRegEmprMouseExited
     // JOptionPane.showMessageDialog(null, "animação pintura OFF");
        
          bRegEmpr.setForeground(Color.white);
    }//GEN-LAST:event_bRegEmprMouseExited

    private void bCadAluno1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadAluno1MouseEntered
        bCadAluno1.setForeground(Color.black);
    }//GEN-LAST:event_bCadAluno1MouseEntered

    private void bCadAluno1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadAluno1MouseExited
       bCadAluno1.setForeground(Color.white);
    }//GEN-LAST:event_bCadAluno1MouseExited

    private void bGerencAluno1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bGerencAluno1MouseEntered
        bGerencAluno1.setForeground(Color.black);
    }//GEN-LAST:event_bGerencAluno1MouseEntered

    private void bGerencAluno1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bGerencAluno1MouseExited
        bGerencAluno1.setForeground(Color.white);
    }//GEN-LAST:event_bGerencAluno1MouseExited

    private void bCadLivro1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadLivro1MouseEntered
       bCadLivro1.setForeground(Color.black);
    }//GEN-LAST:event_bCadLivro1MouseEntered

    private void bCadLivro1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCadLivro1MouseExited
       bCadLivro1.setForeground(Color.white);
    }//GEN-LAST:event_bCadLivro1MouseExited

    private void bGerencLivro1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bGerencLivro1MouseEntered
     bGerencLivro1.setForeground(Color.black);
    }//GEN-LAST:event_bGerencLivro1MouseEntered

    private void bGerencLivro1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bGerencLivro1MouseExited
       bGerencLivro1.setForeground(Color.white);
    }//GEN-LAST:event_bGerencLivro1MouseExited

    private void bLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLogoutMouseEntered
      bLogout.setForeground(Color.black);
    }//GEN-LAST:event_bLogoutMouseEntered

    private void bLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bLogoutMouseExited
        bLogout.setForeground(Color.white);
    }//GEN-LAST:event_bLogoutMouseExited

    private void bDevolveuLivroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDevolveuLivroMouseEntered
        bDevolveuLivro.setForeground(Color.white);
    }//GEN-LAST:event_bDevolveuLivroMouseEntered

    private void bDevolveuLivroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bDevolveuLivroMouseExited
        bDevolveuLivro.setForeground(Color.black);
    }//GEN-LAST:event_bDevolveuLivroMouseExited

    private void tPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPesquisarActionPerformed
        if(tPesquisar.getText().equals("")){
            try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection conec;

                conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca","root","");

                String query = "select * from painel";

                PreparedStatement st = conec.prepareStatement(query);

                //Até aqui em cima, tudo igual a antes.

                //Agora, declarar o ResultSet, que vai pegar o resultado do BD

                ResultSet rs = st.executeQuery();

                //Agora, mostrar o resultado da pesquisa:

                //Mostrar na tabela:

                //Cria o modelo padrão da tabela:

                DefaultTableModel model = (DefaultTableModel) tMonitor.getModel();

                model.setNumRows(0);

                while(rs.next()){

                    //Cria o novo vetor delimitando o tamanho e valores por CHAVES { }
                    model.addRow(new Object[]{rs.getString("codigo"),rs.getString("nome_aluno"),rs.getString("turma"),rs.getString("livro"),rs.getString("data_dev")  });

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

                String query = "select * from painel where nome_aluno like ? or turma like ? or livro like ? or data_dev like ? ";

                PreparedStatement st = conec.prepareStatement(query);

                st.setString(1,"%"+tPesquisar.getText()+"%");
                st.setString(2,"%"+tPesquisar.getText()+"%");
                st.setString(3,"%"+tPesquisar.getText()+"%");
                st.setString(4,"%"+tPesquisar.getText()+"%");

                //Até aqui em cima, tudo igual a antes.

                //Agora, declarar o ResultSet, que vai pegar o resultado do BD

                ResultSet rs = st.executeQuery();

                //Agora, mostrar o resultado da pesquisa:

                //Mostrar na tabela:

                //Cria o modelo padrão da tabela:

                DefaultTableModel model = (DefaultTableModel) tMonitor.getModel();

                model.setNumRows(0);

                while(rs.next()){

                    //Cria o novo vetor delimitando o tamanho e valores por CHAVES { }
                    model.addRow(new Object[]{rs.getString("codigo"),rs.getString("nome_aluno"),rs.getString("turma"),rs.getString("livro"),rs.getString("data_dev")  });

                }

                tPesquisar.setText("");

            } catch (ClassNotFoundException ex) {
                System.out.println("Não foi possivel encontrar o Driver");
            } catch (SQLException ex) {
                System.out.println("Erro ao conectar com o BD");
            }

        }

    }//GEN-LAST:event_tPesquisarActionPerformed

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        if(tPesquisar.getText().equals("")){
            try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection conec;

                conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca","root","");

                String query = "select * from painel";

                PreparedStatement st = conec.prepareStatement(query);

                //Até aqui em cima, tudo igual a antes.

                //Agora, declarar o ResultSet, que vai pegar o resultado do BD

                ResultSet rs = st.executeQuery();

                //Agora, mostrar o resultado da pesquisa:

                //Mostrar na tabela:

                //Cria o modelo padrão da tabela:

                DefaultTableModel model = (DefaultTableModel) tMonitor.getModel();

                model.setNumRows(0);

                while(rs.next()){

                    //Cria o novo vetor delimitando o tamanho e valores por CHAVES { }
                    model.addRow(new Object[]{rs.getString("codigo"),rs.getString("nome_aluno"),rs.getString("turma"),rs.getString("livro"),rs.getString("data_dev")  });

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

                String query = "select * from painel where nome_aluno like ? or turma like ? or livro like ? or data_dev like ? ";

                PreparedStatement st = conec.prepareStatement(query);

                st.setString(1,"%"+tPesquisar.getText()+"%");
                st.setString(2,"%"+tPesquisar.getText()+"%");
                st.setString(3,"%"+tPesquisar.getText()+"%");
                st.setString(4,"%"+tPesquisar.getText()+"%");

                //Até aqui em cima, tudo igual a antes.

                //Agora, declarar o ResultSet, que vai pegar o resultado do BD

                ResultSet rs = st.executeQuery();

                //Agora, mostrar o resultado da pesquisa:

                //Mostrar na tabela:

                //Cria o modelo padrão da tabela:

                DefaultTableModel model = (DefaultTableModel) tMonitor.getModel();

                model.setNumRows(0);

                while(rs.next()){

                    //Cria o novo vetor delimitando o tamanho e valores por CHAVES { }
                    model.addRow(new Object[]{rs.getString("codigo"),rs.getString("nome_aluno"),rs.getString("turma"),rs.getString("livro"),rs.getString("data_dev")  });

                }

                tPesquisar.setText("");

            } catch (ClassNotFoundException ex) {
                System.out.println("Não foi possivel encontrar o Driver");
            } catch (SQLException ex) {
                System.out.println("Erro ao conectar com o BD");
            }

        }
    }//GEN-LAST:event_bPesquisarActionPerformed

    private void tPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPesquisarKeyReleased
        if(tPesquisar.getText().equals("")){
            try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection conec;

                conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca","root","");

                String query = "select * from painel";

                PreparedStatement st = conec.prepareStatement(query);

                //Até aqui em cima, tudo igual a antes.

                //Agora, declarar o ResultSet, que vai pegar o resultado do BD

                ResultSet rs = st.executeQuery();

                //Agora, mostrar o resultado da pesquisa:

                //Mostrar na tabela:

                //Cria o modelo padrão da tabela:

                DefaultTableModel model = (DefaultTableModel) tMonitor.getModel();

                model.setNumRows(0);

                while(rs.next()){

                    //Cria o novo vetor delimitando o tamanho e valores por CHAVES { }
                    model.addRow(new Object[]{rs.getString("codigo"),rs.getString("nome_aluno"),rs.getString("turma"),rs.getString("livro"),rs.getString("data_dev")  });

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

                String query = "select * from painel where nome_aluno like ? or turma like ? or livro like ? or data_dev like ? ";

                PreparedStatement st = conec.prepareStatement(query);

                st.setString(1,"%"+tPesquisar.getText()+"%");
                st.setString(2,"%"+tPesquisar.getText()+"%");
                st.setString(3,"%"+tPesquisar.getText()+"%");
                st.setString(4,"%"+tPesquisar.getText()+"%");

                //Até aqui em cima, tudo igual a antes.

                //Agora, declarar o ResultSet, que vai pegar o resultado do BD

                ResultSet rs = st.executeQuery();

                //Agora, mostrar o resultado da pesquisa:

                //Mostrar na tabela:

                //Cria o modelo padrão da tabela:

                DefaultTableModel model = (DefaultTableModel) tMonitor.getModel();

                model.setNumRows(0);

                while(rs.next()){

                    //Cria o novo vetor delimitando o tamanho e valores por CHAVES { }
                    model.addRow(new Object[]{rs.getString("codigo"),rs.getString("nome_aluno"),rs.getString("turma"),rs.getString("livro"),rs.getString("data_dev")  });

                }

              

            } catch (ClassNotFoundException ex) {
                System.out.println("Não foi possivel encontrar o Driver");
            } catch (SQLException ex) {
                System.out.println("Erro ao conectar com o BD");
            }

        }
    }//GEN-LAST:event_tPesquisarKeyReleased

    
    public void backupManual() throws IOException{
       String localAtual = System.getProperty("user.dir"); 
       // System.out.println(localAtual);
        File arquivo = new File( localAtual+"\\lib\\SBEduc_backup.cmd" );
        
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
        bw.write( "cd\\" );
        bw.newLine();
        bw.write( "cd \"C:\\Program Files\\MySQL\\MySQL Server 5.6\\bin\"" );
        bw.newLine();
        bw.write( "mysqldump -u root -h localhost --databases biblioteca> \""+localAtual+"\\backups\\%FORMATO%.sql\"" );

        
          
         
        
           
             bw.close();
               
             fw.close();
          
            
            
            try {
            Runtime.getRuntime().exec("\""+localAtual+"\\lib\\SBEduc_backup.cmd\""); 
                                      
        } catch (IOException ex) {
           //JOptionPane.showMessageDialog(null,"Erro","Não foi possível restaurar o sistema",JOptionPane.ERROR_MESSAGE);
        }
      //   JOptionPane.showMessageDialog(null,"Restauração concluída","Sistema restaurado com êxito.",JOptionPane.INFORMATION_MESSAGE);
            
       
        
    }
    
    public void backupAutomatico() throws IOException{
    
        try {     
         String  nomeDiretorio = "backups"; 
           if (!new File(nomeDiretorio).exists()) { // Verifica se o diretório existe. 
               (new File(nomeDiretorio)).mkdir();   // Cria o diretório 
           } 
      } catch (Exception ex) { 
        //   JOptionPane.showMessageDialog(null,"Err","Erro ao criar o diretório" + ex.toString(),JOptionPane.ERROR_MESSAGE); 
      }
        
        
        String localAtual = System.getProperty("user.dir"); 
       // System.out.println(localAtual);
        File arquivo = new File( localAtual+"\\lib\\SBEduc_backup.cmd" );
        
        //Se não existe, cria o script:
        if(!arquivo.exists()){
            try {
                arquivo.createNewFile();
            } catch (IOException ex) {
             //   Logger.getLogger(TelaRestaurar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      //  FileWriter fw = new FileWriter( arquivo );
       
 
        String username = System.getProperty("user.name");
  
          
          String path = localAtual+"\\backups";
        
  String files;
  File folder = new File(path);
  File[] listOfFiles = folder.listFiles(); 
 
  if(listOfFiles != null){
  
  for (int i = 0; i < listOfFiles.length; i++) {
 
   if (listOfFiles[i].isFile()) {
   files = listOfFiles[i].getName();
       if (files.endsWith(".sql") || files.endsWith(".SQL")){
               
        //   String dataCriado = (new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new Date(listOfFiles[i].lastModified())));
       
       
       //se já encontrar um backup com a data de hoje, não criar um novo  
     String dataHoje = new SimpleDateFormat("yyyy_MM_dd").format(new Date(System.currentTimeMillis()))+".sql";
           
           if(files.equals(dataHoje)){
           bloquearBackup = true;
               System.out.println("backup diário bloqueado, pois já existe um criado.");
       }
          
        
        }
     }
 
  }
  }
        
        
        
        
        
        if(bloquearBackup == false){
        
       
        FileWriter fw = new FileWriter( arquivo, false ); //false, pq irá sobrescrever o arquivo, para definir qual backup será restaurado
        
            BufferedWriter bw = new BufferedWriter( fw );
    
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
        bw.write( "set FORMATO=%ANO%_%MES%_%DIA%" );
        bw.newLine();
        bw.write( "echo %FORMATO%" );
        bw.newLine();
        bw.write( "cd\\" );
        bw.newLine();
        bw.write( "cd \"C:\\Program Files\\MySQL\\MySQL Server 5.6\\bin\"" );
        bw.newLine();
        bw.write( "mysqldump -u root -h localhost --databases biblioteca> \""+localAtual+"\\backups\\%FORMATO%.sql\"" );

        
          
         
        
           
             bw.close();
               
             fw.close();
          
            
            
            try {
            Runtime.getRuntime().exec("\""+localAtual+"\\lib\\SBEduc_backup.cmd\""); 
                                      
        } catch (IOException ex) {
           //JOptionPane.showMessageDialog(null,"Erro","Não foi possível restaurar o sistema",JOptionPane.ERROR_MESSAGE);
        }
      //   JOptionPane.showMessageDialog(null,"Restauração concluída","Sistema restaurado com êxito.",JOptionPane.INFORMATION_MESSAGE);
            
       
        
    }
    
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
           try {     
         String  nomeDiretorio = "backups"; 
           if (!new File(nomeDiretorio).exists()) { // Verifica se o diretório existe. 
               (new File(nomeDiretorio)).mkdir();   // Cria o diretório 
           } 
      } catch (Exception ex) { 
        //   JOptionPane.showMessageDialog(null,"Err","Erro ao criar o diretório" + ex.toString(),JOptionPane.ERROR_MESSAGE); 
      }
        
        
        try{
        this.backupManual();
        } catch (IOException ex) {
              //  Logger.getLogger(TelaRestaurar.class.getName()).log(Level.SEVERE, null, ex);
            }
        
      
        
        try {
             String localAtual = System.getProperty("user.dir"); 
            Runtime.getRuntime().exec("\""+localAtual+"\\lib\\SBEduc_backup.cmd\""); //backup manual
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null,"Erro","Não foi possível realizar o backup manual.\nO seu banco de dados está configurado corretamente?",JOptionPane.ERROR_MESSAGE);
        }
         JOptionPane.showMessageDialog(null,"Backup realizado","Backup manual salvo com êxito.",JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
      /*  
        String username = System.getProperty("user.name");
  String path = "C:\\Users\\"+username+"\\Desktop\\SBEduc\\backups";
        
  String files;
  File folder = new File(path);
  File[] listOfFiles = folder.listFiles(); 
 
  if(listOfFiles != null){
  
  for (int i = 0; i < listOfFiles.length; i++) {
 
   if (listOfFiles[i].isFile()) {
   files = listOfFiles[i].getName();
       if (files.endsWith(".sql") || files.endsWith(".SQL")){
          System.out.println(files);
         // JOptionPane.showMessageDialog(null, files);
        
        }
     }
 
  }
  }
        */
        
        TelaRestaurar telaRes = new TelaRestaurar(this);
        this.setEnabled(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
       jButton1.setForeground(Color.white);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
       jButton1.setForeground(Color.black);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setForeground(Color.white);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setForeground(Color.black);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TelaInfo telaInfo = new TelaInfo(this);
        this.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadAluno1;
    private javax.swing.JButton bCadLivro1;
    private javax.swing.JButton bDevolveuLivro;
    private javax.swing.JButton bGerencAluno1;
    private javax.swing.JButton bGerencLivro1;
    private javax.swing.JButton bLogout;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JButton bRegEmpr;
    private javax.swing.JLabel data;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotulo;
    private javax.swing.JTable tMonitor;
    private javax.swing.JTextField tPesquisar;
    // End of variables declaration//GEN-END:variables
}
