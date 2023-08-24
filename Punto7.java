
import javax.swing.JOptionPane;


/**
 *
 * @author Santiago
 */
public class Punto7 {
    public static void main(String[] args) {
        
      int num1, num2, num3;
  
 num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
 num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
 num3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        
 if (num1 > num2 && num2 > num3){
     
     JOptionPane.showMessageDialog(null,num1+" Es mayor" );
     
     
 }       
        
 else if (num2 > num1 && num1 > num3)
     
     
     JOptionPane.showMessageDialog(null,num2+" Es mayor" );   
        
        
 else {
     JOptionPane.showMessageDialog(null,num3+" Es mayor" );
 }      
        
          
        
        
        
        
        
        
        
        
        
    }
}
