package exercicio05;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Elvis
 */

public class ExecutarCadastro {

	public static void main(String[] args) {
            
        CadastroPessoa cadastro = new CadastroPessoa();
        ArrayList<CadastroPessoa> listCadastro = new ArrayList<>();
        
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção" + "\n1 - Novo cadastro" + "\n2 - Sair"));
        while (escolha == 1) {
            cadastro = new CadastroPessoa();
            cadastro.setPessoa(JOptionPane.showInputDialog("Insira o nome"));
            listCadastro.add(cadastro);
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Tela de cadastro" + "\n1 - Novo cadastro" + "\n2 - Sair"));
            
        }
        for (CadastroPessoa c : listCadastro)
         JOptionPane.showMessageDialog(null, "Lista de pessoas cadastradas: \n" + c.getPessoa());
         
           
}
}