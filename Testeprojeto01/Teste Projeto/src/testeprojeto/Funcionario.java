package testeprojeto;

public class Funcionario extends Pessoa{
	private String cargo;
	private int codigo;
	
	public void cadastrarCliente(String nome, int idade, int telefone, String endereco) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setTelefone(telefone);
		this.setEndereco(endereco);
	}
	public void cadastrarLivro() {
		
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
