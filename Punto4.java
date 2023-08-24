
package tarea1;

import javax.swing.JOptionPane;

/**
 *
 * @author Santi
 */
public class Punto4 {
     public static void main(String[] args) {
     
   
    int numero, cociente, divisor, contador;
    cociente = 0;
    divisor = 1;
    contador = 0;
   numero =Integer.parseInt(  JOptionPane.showInputDialog("Ingresa un numero: "));
  
    while (cociente != 1){
      contador ++;
      divisor = divisor * 10;
      cociente = numero / divisor;
      if (cociente == 1){
        JOptionPane.showMessageDialog(null,"El numero tiene: "+ (contador + 1) + " digitos");
      }
      if (cociente < 1){
        JOptionPane.showMessageDialog(null,"El numero tiene: "+ contador + " digitos");
        cociente = 1;
      }
           
      if (numero < 10){
       JOptionPane.showMessageDialog(null,"Solo tiene un digito");
        cociente = 1;
      }
    }
        
    }
    
}


