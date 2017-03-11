package exercicio03;

import javax.swing.JOptionPane;

/**
 *
 * @author Elvis
 */
public class ExibirDados {
    
    public static void main(String[] args) {
        
               
        String[] listDados = new String [4];
        listDados[0] = JOptionPane.showInputDialog("Qual o seu nome");
        listDados[1] = JOptionPane.showInputDialog("Qual a sua idade");
        listDados[2] = JOptionPane.showInputDialog("De qual cidade você é");
        listDados[3] = JOptionPane.showInputDialog("Qual a sua profissão");
        
        JOptionPane.showMessageDialog(null, "Seu nome é " + listDados[0]);
        JOptionPane.showMessageDialog(null, "Sua idade é de " + listDados[1]);
        JOptionPane.showMessageDialog(null, "Você é de " + listDados[2]);
        JOptionPane.showMessageDialog(null, "E sua profissão é " + listDados[3]);     
         
        
    }
    
}
