package exercicio04;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Elvis
 */
public class ExecutarCadastro {
    
    public static void main(String[] args) {
        
        Cadastro cadastro = new Cadastro();
        
        
        List<Cadastro> listCadastro = new ArrayList<>();
        
        int numCadastro = Integer.parseInt(JOptionPane.showInputDialog("Quantos cadastro deseja realizar?" + "\nDigite zero para sair"));
        int qtd = 1;
        int cadastroNo = 1;
     
        while (qtd <= numCadastro) {
            cadastro = new Cadastro();
                        
            cadastro.setNome(JOptionPane.showInputDialog("Cadastro numero " + cadastroNo + "\nInsira o seu nome"));
                        cadastro.setUsuario(JOptionPane.showInputDialog("Cadastro numero " + cadastroNo + "\nInsira o seu nome de usuário"));
                                    cadastro.setSenha(JOptionPane.showInputDialog("Cadastro numero " + cadastroNo + "\nDigite a sua senha"
                                            + "\nObs.: Ela deve conter entre 3 a 6 caracteres e pelo menos um número"));
                                    
                                                                      
                                    if ( cadastro.getSenha().length() < 3 ) {
                                        JOptionPane.showMessageDialog(null,"Insira uma senha maior que 3 caracteres");
                                    }
                                            
                                    else if (cadastro.getSenha().length() > 6) {
                                        JOptionPane.showMessageDialog(null,"Insira uma senha menor que 6 caracteres");
                                        
                                    }
                                    
                                    else if (cadastro.getSenha().contains("1") || cadastro.getSenha().contains("2") || cadastro.getSenha().contains("3") ||
                                            cadastro.getSenha().contains("4") || cadastro.getSenha().contains("5") || cadastro.getSenha().contains("6") || 
                                            cadastro.getSenha().contains("7") || cadastro.getSenha().contains("8") || cadastro.getSenha().contains("9") ||
                                            cadastro.getSenha().contains("0")){ 
                                        
                                        listCadastro.add(cadastro);
                                        qtd++;
                                        cadastroNo++;
                                    }
                                    
                                    
                                    else {
                                        JOptionPane.showMessageDialog(null,"Insira uma senha que contenha pelo menos um número");
                                       
                                    }
                                    
        }                               
                                    
                                    
                                                                      
                                  
        
        
        for (Cadastro c : listCadastro) {
            System.out.println("O nome de usuário é " + c.getNome());
            System.out.println("O apelido de usuário é de " + c.getUsuario());
            System.out.println("A senha do usuário é " + c.getSenha() + "\n\n");
         	System.out.println("\n-------Fim da execução-------");
               
        }
    }
    }

