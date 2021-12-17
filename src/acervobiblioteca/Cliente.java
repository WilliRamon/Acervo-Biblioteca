package acervobiblioteca;

public class Cliente extends Pessoa{
	private long cpf;
	private String login; //mudei matricula para login
	
	public void retirarLivro() {
		
	}
	public void devolverLivro() {
		
	}
	
	public void consultarAcervo() { //adicionei
		
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	
}
