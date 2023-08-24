
import javax.swing.JOptionPane;


/**
 *
 * @author CEDENORTE
 */
public class Punto6 {
    public static void main(String[] args) {
        
  int num1, num2, num3;
  
 num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
 num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
 num3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        
 if (num1 > num2 && num2 > num3){
     
     JOptionPane.showMessageDialog(null,"esta en orden decreciente" );
     
     
 }       
        
 else if (num3 > num2 && num2 > num1)
     
     
     JOptionPane.showMessageDialog(null,"esta en orden creciente" );   
        
        
 else {
     JOptionPane.showMessageDialog(null,"No tienen orden" );
 }      
        
        
        
    }
}
