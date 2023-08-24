
import javax.swing.JOptionPane;


/**
 *
 * @author santiago
 */
public class Punto5 {
    
    public static void main(String[] args) {
        
        int num1, num2, num3;
    
    num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
    num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
    num3 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
            
            
    if (num1 == num2 && num2 == num3){
        
      JOptionPane.showMessageDialog(null,"TODOS LOS NUMEROS SON IGUALES");
        
        
    }
        
        else if (num1 == num2)
            
        JOptionPane.showMessageDialog(null,num1+ " "+ num2+ " son iguales");    
            
        else if (num1 == num3) 
            
        JOptionPane.showMessageDialog(null,num1+ " "+ num3+ " son iguales");   
    
        else if (num2 == num3)
            
        JOptionPane.showMessageDialog(null,num2+ " "+ num3+ " son iguales");
    
        else {
            
            JOptionPane.showMessageDialog(null,"TODOS SON DIFERENTES");   
            
            
        }
                
    }    
        
    
    
    
    }
       
           
        
    
    
    
    

