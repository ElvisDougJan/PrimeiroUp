package exercicio01;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author Elvis
 */

public class ExecutarSoma {
    
    public static void main(String[] args) {
        
        Soma soma = new Soma();
                
        JOptionPane.showMessageDialog(null, "Vamos realizar uma soma básica");
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um valor"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira um segundo valor"));
        soma.somar(num1, num2);
        JOptionPane.showMessageDialog(null, soma.getResultado());
    }
    
}
