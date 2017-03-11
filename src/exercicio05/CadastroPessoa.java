package exercicio05;

/**
 *
 * @author Elvis
 */

public class CadastroPessoa {

	private String pessoa = "";
        
      

	public String nomePessoa (String nome) {
		pessoa = nome;
		return pessoa;
	}

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

  
	
}
