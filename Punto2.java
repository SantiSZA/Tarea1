
import javax.swing.JOptionPane;


/**
 *
 * @author CEDENORTE
 */
public class Punto2 {
    
    public static void main(String[] args) {
        
        int num, mod;
        
      num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
              
    mod = num%2;
    
    if (mod==0){
        
        JOptionPane.showMessageDialog(null,num+" Es par");
    }
    else {
        
        JOptionPane.showMessageDialog(null, num+ " Es impar");
        
            
        
        
        
        
        
    }
    }
    
    
}
