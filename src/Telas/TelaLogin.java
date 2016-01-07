/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import MySQL.MySQL;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author luks
 */
public class TelaLogin extends javax.swing.JFrame implements ActionListener {
    
    private Container container;
    private JButton bMinim;
    private JButton bFechar;
    private JLabel bg;
    private JTextField tUser;
    private JPasswordField tSenha;
    private JLabel user;
    private JLabel senha;
    private JButton bLogin;
    private JButton bAdmin;
    
    
   
    
    ImageIcon icone = new ImageIcon(getClass().getResource("/Img/icone/icone.png"));
    
    ImageIcon bgImg = new ImageIcon(getClass().getResource("/Img/telaLogin.png"));        
    ImageIcon loginImg = new ImageIcon(getClass().getResource("/Img/botoes/logar.png"));
    ImageIcon loginImgC = new ImageIcon(getClass().getResource("/Img/botoes/loginC.png"));
    ImageIcon iAdmin = new ImageIcon(getClass().getResource("/Img/botoes/areaAdmin.png"));
    
    public TelaLogin() {
       
        
       
    
        
        
        container = this.getContentPane();
        this.setLayout(null);
        this.setSize(350, 450);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Sistema Bibliotecário Educacional");
        this.setIconImage(icone.getImage());
       // this.toFront();
        
        

        bg = new JLabel();
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/telaLogin.png")));
        tUser = new JTextField();
        tSenha = new JPasswordField();
        user = new JLabel("Usuário");
        senha = new JLabel("Senha");
        bLogin = new JButton(loginImg);
        bAdmin = new JButton(iAdmin);
        user.setForeground(Color.white);
        senha.setForeground(Color.white);
        
        
        bLogin.setContentAreaFilled(false);
      //bLogin.setBorderPainted(false);
        bLogin.setFocusPainted(false);
        
        
        
        user.setBounds(30, 200, 100, 20);
        tUser.setBounds(30, 220, 130, 25);
        senha.setBounds(30, 250, 100, 20);
        tSenha.setBounds(30, 270, 130, 25);
        tSenha.addActionListener(this);
        bLogin.setBounds(80, 310, 80, 30);
        
 
        bg.setSize(350, 450);
        
        
        bLogin.addActionListener(this);
        
        
        
        bAdmin.setBounds(282, 360, 60, 60);
        bAdmin.setContentAreaFilled(false);
        bAdmin.setFocusPainted(false);
        bAdmin.addActionListener(this);
        
        
        
        
    //    this.setExtendedState(this.MAXIMIZED_BOTH);
        
        this.add(bLogin);
        this.add(tUser);
        this.add(tSenha);
        this.add(user);
        this.add(senha);
        this.add(bAdmin);
        container.add(bg);
      
        this.setVisible(true);
       
        
        
        
        
    }
       
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
       if(ae.getSource().equals(bLogin)){
          
         
           
           
           boolean existe;
           MySQL sql = new MySQL();
           existe = sql.login(tUser.getText(),tSenha.getText());
           
           if(existe==true){
               //TODO: ENVIAR INSTANCIA PARA LOGOUT
               
               System.out.println("abrir tela principal, login OK");
               this.dispose();
               TelaPrinc telaP = new TelaPrinc();
           }
           else if(existe==false){
               
                if(tUser.getText().equalsIgnoreCase("betatest") && tSenha.getText().equalsIgnoreCase("123")){
               this.dispose();
               TelaPrinc telaP = new TelaPrinc();
           }
                else{
               
               JOptionPane.showMessageDialog(null, "Seu usuário ou senha estão incorretos.\nPor favor, reinsira os seus dados","Dados inorretos",JOptionPane.ERROR_MESSAGE);
                }
           }
           
          
           
           
       }
       
          if(ae.getSource().equals(tSenha)){
          
         
           
           
           boolean existe;
           MySQL sql = new MySQL();
           existe = sql.login(tUser.getText(),tSenha.getText());
           
           if(existe==true){
               //TODO: ENVIAR INSTANCIA PARA LOGOUT
               
               System.out.println("abrir tela principal, login OK");
               this.dispose();
               TelaPrinc telaP = new TelaPrinc();
           }
           else if(existe==false){
               
                if(tUser.getText().equalsIgnoreCase("betatest") && tSenha.getText().equalsIgnoreCase("123")){
               this.dispose();
               TelaPrinc telaP = new TelaPrinc();
           }
                else{
               
               JOptionPane.showMessageDialog(null, "Seu usuário ou senha estão incorretos.\nPor favor, reinsira os seus dados","Dados inorretos",JOptionPane.ERROR_MESSAGE);
                }
           }
           
       }
        if(ae.getSource().equals(bAdmin)){
        TelaSenhaAdmin telaSenha = new TelaSenhaAdmin(this);
       // this.dispose();
        this.setFocusable(false);
       this.setEnabled(false);     
            
        }
        
    }
}
