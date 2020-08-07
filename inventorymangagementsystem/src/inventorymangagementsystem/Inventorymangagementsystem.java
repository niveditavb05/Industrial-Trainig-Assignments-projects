/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymangagementsystem;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
//import com.main.view.LoginDialog;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author home
 */
public class Inventorymangagementsystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{
                Properties p=new Properties();
                p.put("logoString","IMS");
                HiFiLookAndFeel.setCurrentTheme(p);
                //UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");  
                UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");  
            }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){
               e.printStackTrace();
            }
        

       // LoginDialog ld=new LoginDialog();
       // /ld.setLocationRelativeTo(null);
       // ld.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       // ld.setVisible(true);
    }
    
}
