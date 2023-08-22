
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CEDENORTE
 */
public class Punto3 {
    public static void main(String[] args) {
        
        int num, mod;
        
      num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
              
    mod = num%8;
    
    if (mod==0){
        
        JOptionPane.showMessageDialog(null,num+" Es multiplo de 8");
    }
    else {
        
        JOptionPane.showMessageDialog(null, num+ " No es multiplo de 8");
        
            
        
        
        
        
        
    }
        
        
    }
}
