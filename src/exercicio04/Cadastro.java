package exercicio04;

/**
 *
 * @author Elvis
 */

public class Cadastro {

	
	
	private String usuario;
	private String nome;
        private String senha;
	
	public Cadastro() {
		
	}
	 
	public String usuario (String usuario) {
            usuario = usuario;
            return usuario;
        }

	public String nome (String nome) {
            nome = nome;
            return nome;
        }
        
        public String senha (String senha) {
            senha = senha;
            return senha;
        }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

 

        
}
