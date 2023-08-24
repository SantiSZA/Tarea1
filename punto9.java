
import javax.swing.JOptionPane;


/**
 *
 * @author santiago
 */
public class punto9 {
    public static void main(String[] args) {
        
        int num1;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        
    if (num1>17){
        
         JOptionPane.showMessageDialog(null,"Es mayor de edad" );
        
    }    
    else {
         JOptionPane.showMessageDialog(null,"Es menor de edad");
    } 
    }
}
