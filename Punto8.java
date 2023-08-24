
import javax.swing.JOptionPane;


/**
 *
 * @author santiago
 */
public class Punto8 {
    public static void main(String[] args) {
        
        int num1, num2, resultado;
        
 num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
 num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero")); 
        
    resultado = num1+ num2;

    JOptionPane.showMessageDialog(null,"la suma es: "+resultado );
        
        
    }
}
