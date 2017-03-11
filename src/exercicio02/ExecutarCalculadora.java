package exercicio02;

import javax.swing.JOptionPane;

/**
 *
 * @author Elvis
 */

public class ExecutarCalculadora {

    public static void main(String[] args) {
    
        Calculadora calculadora = new Calculadora();
        
        JOptionPane.showMessageDialog(null, "Vamos realizar operações!"
                                            + "\nInsira dois números e depois escolha qual tipo de operação deseja realizar.");
        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o primeiro número"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o segundo número"));

        
        int idOperacao = Integer.parseInt(JOptionPane.showInputDialog("Qual operação deseja realizar?" + "\nDigite o número correspondente a operação:" + 
                                    "\nSomar = 0" + "\nSubtrair = 1" + "\nMultiplicar = 2" + "\nDividir = 3"));
        
      
           if (idOperacao < 4) { 
            switch (idOperacao) {
                case 0:
                    calculadora.somar(num1, num2);
                    JOptionPane.showMessageDialog(null, "O resultado da soma é de: " + calculadora.getResultado());
                    break;
                    
                case 1:
                    calculadora.subtrair(num1, num2);
                    JOptionPane.showMessageDialog(null, "O resultado da subtração é de: " + calculadora.getResultado());
                    break;
                    
                case 2:
                    calculadora.multiplicar(num1, num2);
                    JOptionPane.showMessageDialog(null, "O resultado da multiplicação é de: " + calculadora.getResultado());
                    break;
                    
                case 3:
                    calculadora.dividir(num1, num2);
                    JOptionPane.showMessageDialog(null, "O resultado da divisão é de: " + calculadora.getResultado());
                    break;
                
                }
            JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!");
           }
            
           else if (idOperacao >= 4) {
            JOptionPane.showMessageDialog(null, "Favor insira um número correspondente a operação desejada!");
        }
           
           
    }
    }

