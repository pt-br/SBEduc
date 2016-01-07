/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author luks
 */
public class MySQL {
    
    String user;
    String senha;
    String bdLogin;
    String bdSenha;
    String nome;
    String turma;
    String end;
    String tel;
    String titulo;
    String autor;
    String codigo;
    String data;
    String numReg;
    String editora;
    String quantidade;
    String categoria;
    
    public void regAluno(String nome,String turma,String data,String end, String tel){
 
        this.nome = nome;
        this.turma = turma;
        this.end = end;
        this.tel = tel;
        this.data = data;
                
        
        //Procura pela classe conectora
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
        //Cria a conection (java.sql) e conecta ao bd
            
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca", "root" ,"");
        
            // A partir daqui, já conectou no BD. 
            
            //Insere dados no bd:
            
            //String query, recebe comandos do SQL
            String query = "Insert into alunos(nome_aluno,turma,data_cad,endereço,telefone) values(?,?,?,?,?)";
            System.out.println(data);
            //Cria o comando que envia para o SQL
            
            //Seta os valores dos ? nos values da string de inserção
            PreparedStatement st = conec.prepareStatement(query);
            st.setString(1, nome);
            st.setString(2, turma);
            st.setString(3, data);
            st.setString(4, end);
            st.setString(5, tel);
           
            
            
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
    }
    
    public void regLivro(String numReg, String titulo,String autor,String data,String editora, String categoria, String quantidade){
        this.numReg = numReg;
        this.titulo = titulo;
        this.autor = autor;
        this.data = data;
        this.editora = editora;
        this.categoria = categoria;
        this.quantidade = quantidade;
        
                
        
        //Procura pela classe conectora
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
        //Cria a conection (java.sql) e conecta ao bd
            
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca", "root" ,"");
        
            // A partir daqui, já conectou no BD. 
            
            //Insere dados no bd:
            
            //String query, recebe comandos do SQL
            String query = "Insert into livros(num_reg,titulo_livro,nome_autor,categoria,data_cad,editora,disponibilidade) values(?,?,?,?,?,?,?)";
        
            //Cria o comando que envia para o SQL
            
            //Seta os valores dos ? nos values da string de inserção
            PreparedStatement st = conec.prepareStatement(query);
            st.setString(1, numReg);
            st.setString(2, titulo);
            st.setString(3, autor);
            st.setString(4,categoria);
            st.setString(5,data);
            st.setString(6,editora);
            st.setString(7,quantidade);
          
           
            
            
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
    }
    
    
    
    public void regUser(String user,String senha){
     
        this.user = user;
        this.senha = senha;
        System.out.println(user);
        //Procura pela classe conectora
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
        //Cria a conection (java.sql) e conecta ao bd
            
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca", "root" ,"");
        
            // A partir daqui, já conectou no BD. 
            
            //Insere dados no bd:
            
            //String query, recebe comandos do SQL
            String query = "Insert into biblioteca(login) values(?)";
        
            //Cria o comando que envia para o SQL
            
            //Seta os valores dos ? nos values da string de inserção
            PreparedStatement st = conec.prepareStatement(query);
            st.setString(1, user);
           
            
            
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
    }
    
    
    
    public boolean login(String user,String senha){
       this.user = user;
       this.senha = senha;
    boolean existe=false;
     
        
         try {
            
             
             Class.forName("com.mysql.jdbc.Driver");
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca", "root" ,"");
            
            String query = "select * from usuarios where login = ?";
            
            
            PreparedStatement st = conec.prepareStatement(query);
            
            
            st.setString(1,user);
            
            
            //Até aqui em cima, tudo igual a antes.
            
            //Agora, declarar o ResultSet, que vai pegar o resultado do BD
            
            ResultSet rs = st.executeQuery();
            
            //Pega o user e a senha do BD
            
             

           
            
            while(rs.next()){
            
            bdLogin = rs.getString("login");
            bdSenha = rs.getString("senha");
            
            if(user.equals(bdLogin) && senha.equals(bdSenha)){
                existe=true;
            }
            else{
              
                existe=false;
                
            }
            }
            
           
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel encontrar o Driver");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar com o BD");
        }
        
        return existe;
        
    }
    
    public void editAluno(String codigo,String nome,String turma,String end, String tel){
 
        this.nome = nome;
        this.turma = turma;
        this.end = end;
        this.tel = tel;
                
        
        //Procura pela classe conectora
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
        //Cria a conection (java.sql) e conecta ao bd
            
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca", "root" ,"");
        
            // A partir daqui, já conectou no BD. 
            
            //Insere dados no bd:
            
            //String query, recebe comandos do SQL
            String query = "update alunos set nome_aluno=?,turma=?,endereço=?,telefone=? where codigo=?";
        
            //Cria o comando que envia para o SQL
            
            //Seta os valores dos ? nos values da string de inserção
            PreparedStatement st = conec.prepareStatement(query);
            st.setString(1, nome);
            st.setString(2, turma);
            st.setString(3, end);
            st.setString(4, tel);
            st.setString(5, codigo);
           
            
            
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
    }
    
    public void editLivro(String codigo,String numReg,String titulo,String autor,String editora, String quantidade, String categoria){
        
        this.numReg = numReg;
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.editora = editora;
        this.quantidade = quantidade;
        this.categoria = categoria;
                
        
        //Procura pela classe conectora
        try {
            Class.forName("com.mysql.jdbc.Driver");
        
        //Cria a conection (java.sql) e conecta ao bd
            
            
            Connection conec;
            
            conec = DriverManager.getConnection("jdbc:mysql://127.0.0.1/biblioteca", "root" ,"");
        
            // A partir daqui, já conectou no BD. 
            
            //Insere dados no bd:
            
            //String query, recebe comandos do SQL
            String query = "update livros set num_reg=?,titulo_livro=?,nome_autor=?,editora=?, disponibilidade=?, categoria=? where codigo_livro=?";
      
            //Cria o comando que envia para o SQL
            
            //Seta os valores dos ? nos values da string de inserção
            PreparedStatement st = conec.prepareStatement(query);
            st.setString(1,numReg);
            st.setString(2, titulo);
            st.setString(3, autor);
            st.setString(4, editora);
            st.setString(5, quantidade);
            st.setString(6, categoria);
            st.setString(7, codigo);

           
            
            
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
    }
    
    
    
    
}
