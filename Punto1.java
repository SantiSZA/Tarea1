
import javax.swing.JOptionPane;


/**
 *
 * Santiago Zapata
 */
public class Punto1 {
    public static void main(String[] args) {
        double num;
        
     num = Double.parseDouble(JOptionPane.showInputDialog("ingrese un numero"));
        
     if (num>0){
         
         JOptionPane.showMessageDialog(null, num+ " es positivo" );
     }
     else if (num==0){
         
         JOptionPane.showMessageDialog(null, " Su numero es 0" );
     }
     else{ 
       
         JOptionPane.showMessageDialog(null,num+" Es negativo" );
                
               
     }
    }
}
