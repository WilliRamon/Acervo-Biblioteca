package testeprojeto;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private int telefone;
	private String endereco;
	
	public void fazerAniversario() {
		this.setIdade(getIdade() + 1);
		System.out.println("Nós da biblioteca A BIBLIOTECA te desejamos feliz aniversário!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
