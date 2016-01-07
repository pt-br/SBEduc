/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sbd;


import Telas.TelaPrinc;
import Telas.TelaLogin;
import Telas.TelaPrinc;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 *
 * @author alunos
 */
public class SBD {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        try {  
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");  
} catch (Exception e) {  
    JOptionPane.showMessageDialog(null,  
            "Não foi possível carregar o \"Skin\" padrão. Definindo o padrão original.", "Erro",  
            JOptionPane.ERROR_MESSAGE);  
}  
        
        
  //  TelaLogin telaLogin = new TelaLogin();
 
     //   TelaResp resp = new TelaResp();
        
        
        
        
  TelaPrinc telaIni = new TelaPrinc();
     
    }
}
