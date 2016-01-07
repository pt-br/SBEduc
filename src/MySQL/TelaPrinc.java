/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL;


import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 * @author luks
 * @serial 5559413353236852456
 * @version 1.0
 */

public class TelaPrinc extends javax.swing.JFrame implements ActionListener{
 ImageIcon icone = new ImageIcon(getClass().getResource("/Img/icone/icone.png"));
 TableModel model;
 JLabel rotulo;
 int hh,mm,ss,h;
 Calendar hora;
 DecimalFormat formato;
 private Container container;
 private JLabel fundo;
// private JLabel nomeEsc;
 private JLabel painelControle;
 private JLabel operacoes;
 private JButton bHome;
 private JButton bRegEmpr;
 private JButton bCadAluno;
 private JButton bGerencAluno;
 private JButton bCadLivro;
 private JButton bGerencLivro;
 private JLabel data;
 private JButton bLogout;
 private JButton bDevolveuLivro;
 private JTable tMonitor;
/* TelaCadAluno telaCadA;
 TelaCadLivro telaCadL;
 TelaGerAluno telaGerencAluno;
 TelaGerLivro telaGerencLivro;
 TelaEmprestimo telaEfetuarEmprestimo; */
 
 /*boolean CadAlunoAberto = false;
 boolean CadLivroAberto = false;
 boolean GerencAlunoAberto = false;
 boolean GerencLivroAberto = false;
 boolean EfetuarEmprestimoAberto = false;*/
JPanel painel;
 
 
 JScrollPane scroll = new javax.swing.JScrollPane();
 
 
 
    public TelaPrinc() {
      container = this.getContentPane();      
      Dimension res = Toolkit.getDefaultToolkit().getScreenSize();  
   
        ImageIcon bg = new ImageIcon(getClass().getResource("/Img/telaPrincipalConego.png"));   
        bg.setImage(bg.getImage().getScaledInstance((int)res.getWidth(), (int)res.getHeight(),100));  
        
        ImageIcon iHome = new ImageIcon(getClass().getResource("/Img/botoes/home.png"));
        ImageIcon iCadAluno = new ImageIcon(getClass().getResource("/Img/botoes/cadastrarAluno.png"));
        ImageIcon iGerencAluno = new ImageIcon(getClass().getResource("/Img/botoes/gerenciarAlunos.png"));
        ImageIcon iCadLivro = new ImageIcon(getClass().getResource("/Img/botoes/cadastrarLivro.png"));
        ImageIcon iGerencLivro = new ImageIcon(getClass().getResource("/Img/botoes/gerenciarLivros.png"));
        ImageIcon iRegEmpr = new ImageIcon(getClass().getResource("/Img/botoes/registrarEmprestimo.png"));
        ImageIcon iLogout = new ImageIcon(getClass().getResource("/Img/botoes/logout.png"));
        ImageIcon iDevolveuLivro = new ImageIcon(getClass().getResource("/Img/botoes/devolveuLivro.png"));
        
        
        
        //DECLARAR
        data = new JLabel();  
        rotulo = new JLabel("");
        fundo = new JLabel(bg);
       // nomeEsc = new JLabel("Colégio Estadual Cônego Scherer");
        painelControle = new JLabel("Devoluções Pendentes");
        operacoes = new JLabel("Operações");
        bHome = new JButton(iHome);
        bRegEmpr = new JButton(iRegEmpr);
        bCadAluno = new JButton(iCadAluno);
        bGerencAluno = new JButton(iGerencAluno);
        bCadLivro = new JButton(iCadLivro);
        bGerencLivro = new JButton(iGerencLivro);
        bLogout = new JButton(iLogout);
        bDevolveuLivro = new JButton(iDevolveuLivro);
       
        painel = new JPanel();
        

     
        
        
        //ALTERAR
        rotulo.setBounds(1220,50,280,20);
        rotulo.setForeground(Color.white);
        rotulo.setFont(rotulo.getFont().deriveFont(20f));
        
        data.setBounds(1210,70,280,20);
        data.setForeground(Color.white);
        data.setFont(rotulo.getFont().deriveFont(20f));
        data.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));  
        
        painelControle.setBounds(250,260,350,25);
        painelControle.setFont(painelControle.getFont().deriveFont(20f)); 
        
        operacoes.setBounds(250,730,350,25);
        operacoes.setFont(painelControle.getFont().deriveFont(20f));
    
        /*  nomeEsc.setBounds(300,75,350,25);
        nomeEsc.setForeground(Color.white);
        nomeEsc.setFont(nomeEsc.getFont().deriveFont(20f));  */
        
     /*   bHome.setBounds(40, 200, 80, 80);
        bHome.setContentAreaFilled(false);
        bHome.setFocusPainted(false);*/
       
        bRegEmpr.setBounds(40, 200, 80, 80);
        bRegEmpr.setContentAreaFilled(false);
        bRegEmpr.setFocusPainted(false);
        bRegEmpr.addActionListener(this);
        
        bCadAluno.setBounds(40, 300, 80, 80);
        bCadAluno.setContentAreaFilled(false);
        bCadAluno.setFocusPainted(false);
        bCadAluno.addActionListener(this);
        
        bGerencAluno.setBounds(40, 400, 80, 80);
        bGerencAluno.setContentAreaFilled(false);
        bGerencAluno.setFocusPainted(false);
        bGerencAluno.addActionListener(this);
        
        bCadLivro.setBounds(40, 500, 80, 80);
        bCadLivro.setContentAreaFilled(false);
        bCadLivro.setFocusPainted(false);
        bCadLivro.addActionListener(this);
        
        bGerencLivro.setBounds(40, 600, 80, 80);
        bGerencLivro.setContentAreaFilled(false);
        bGerencLivro.setFocusPainted(false);
        bGerencLivro.addActionListener(this);
        
        bLogout.setBounds(40, 700, 80, 80);
        bLogout.setContentAreaFilled(false);
        bLogout.setFocusPainted(false);
        bLogout.addActionListener(this);
        
        bDevolveuLivro.setBounds(250, 780, 80, 80);
        bDevolveuLivro.setContentAreaFilled(false);
        bDevolveuLivro.setFocusPainted(false);
        bDevolveuLivro.addActionListener(this);
        
        painel.setBounds(240,710,1020,150);
        painel.setBackground(Color.LIGHT_GRAY);
        
        //RELOGIO
        

ActionListener tarefa = (new ActionListener(){
public void actionPerformed(ActionEvent e){
HORAS();
}
});
javax.swing.Timer time = new javax.swing.Timer(1000,tarefa);
time.start();






       
        //TABELA

tMonitor = new javax.swing.JTable();

 tMonitor.setModel(new javax.swing.table.DefaultTableModel(
    new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
    },
    new String [] {
        "Código", "Nome do Aluno", "Turma", "Livro Pego", "Data Devolução"
    }
) 
 
 {
    boolean[] canEdit = new boolean [] {
        false, false, false, false, false
    };

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }
});

model = tMonitor.getModel();



scroll.setViewportView(tMonitor);

tMonitor.getColumnModel().getColumn(0).setResizable(false);
tMonitor.getColumnModel().getColumn(0).setMaxWidth(60);
tMonitor.getColumnModel().getColumn(2).setResizable(false);
tMonitor.getColumnModel().getColumn(2).setMaxWidth(60);

tMonitor.getTableHeader().setReorderingAllowed(false);
scroll.setBounds(250, 300, 1000, 400);
        
        
        //PROP FRAME
        
    //    this.setUndecorated(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Sistema Bibliotecário Educacional");
        this.setIconImage(icone.getImage());
        this.toFront();
        
        this.setExtendedState(this.MAXIMIZED_BOTH);  
        
   
       
        this.setLocationRelativeTo(null);
        
        
        //INSERIR
        this.add(data);
        this.add(painelControle);
        this.add(scroll);
        this.add(rotulo);
        this.add(bLogout);
        this.add(bRegEmpr);
        this.add(bGerencLivro);
        this.add(bCadLivro);
        this.add(bGerencAluno);
        this.add(bCadAluno);
        this.add(bDevolveuLivro);
        this.add(operacoes);
        this.add(painel);
       // this.add(bHome);
     //   this.add(nomeEsc);
        container.add(fundo);
        
        
        this.atualizaTabela();
        
        this.setVisible(true);
        this.setResizable(false);
       
    }
    
    public void atualizaTabela(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca","root","umasenhasegura852456");
            
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
  
    @Override
    public void actionPerformed(ActionEvent ae) {
             if(ae.getSource().equals(bLogout)){
         
         
        this.dispose();
    //    TelaLogin telaLogin = new TelaLogin();
         
             }
             
     if(ae.getSource().equals(bCadAluno)){
         
   //          telaCadA = new TelaCadAluno(this,data.getText());
         //    telaCadA.setAlwaysOnTop(true);
             this.setEnabled(false);
             this.setFocusable(false);
       /*  if(CadAlunoAberto ==false){
     
         CadAlunoAberto  = true;
         }
         else{
         telaCadA.toFront();
         }*/
         
     }
     
     if(ae.getSource().equals(bCadLivro)){
         
    //     telaCadL = new TelaCadLivro(this,data.getText());
      //  telaCadL.setAlwaysOnTop(true);
         this.setEnabled(false);
         this.setFocusable(false);
       /*  if(CadLivroAberto ==false){
         
         CadLivroAberto  = true;
         }
         else{
         telaCadL.toFront();
         }*/
         
     
}
     
      if(ae.getSource().equals(bGerencAluno)){
     //    telaGerencAluno = new TelaGerAluno(this);
       // telaGerencAluno.setAlwaysOnTop(true);
         this.setEnabled(false);
         this.setFocusable(false);
       /*   if(GerencAlunoAberto ==false){
         
         GerencAlunoAberto  = true;
         }
         else{
         telaGerencAluno.toFront();
         }*/
        
        

     
}
      
      if(ae.getSource().equals(bGerencLivro)){
   //      telaGerencLivro = new TelaGerLivro(this);
       // telaGerencLivro.setAlwaysOnTop(true);
         this.setEnabled(false);
         this.setFocusable(false);
       /*   if(GerencLivroAberto ==false){
         
         GerencLivroAberto  = true;
         }
         else{
         telaGerencLivro.toFront();
         }
        */
        

     
}
      
      if(ae.getSource().equals(bRegEmpr)){
    //     telaEfetuarEmprestimo = new TelaEmprestimo(this);
       this.setEnabled(false);
         this.setFocusable(false);
       /*   if(EfetuarEmprestimoAberto ==false){
         
         EfetuarEmprestimoAberto  = true;
         }
         else{
         telaEfetuarEmprestimo.toFront();
         }*/
        
        

     
}
     
    if(ae.getSource().equals(bDevolveuLivro)){
      int linha = tMonitor.getSelectedRow();
        if(linha == -1){         
           JOptionPane.showMessageDialog(null, "Por favor, selecione uma linha na tabela\npara completar essa ação.","Selecione uma linha",JOptionPane.INFORMATION_MESSAGE);
       }
        else{
        
        Object[] options = { "Sim", "Não" };  
//this.setAlwaysOnTop(false);    
int op = JOptionPane.showOptionDialog(null,"O aluno "+(String) tMonitor.getModel().getValueAt(tMonitor.getSelectedRow(), 1)+" devolveu o livro "+(String) tMonitor.getModel().getValueAt(tMonitor.getSelectedRow(), 3)  +"?",  "Devolveu o livro?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);  
//this.setAlwaysOnTop(true);       
        if(op==0){
    
        //EXCLUI
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca","root","umasenhasegura852456");
            
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

//Atualiza

this.atualizaTabela();
        
        }
        
        
    }
      
    } 
     
     
     
     
     
     
        
        
    }
    
    
}
    
    