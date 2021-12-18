package acervobiblioteca;

public class Livro extends Exemplar{

	public Livro(String exemplar, int numCadastro) {
		super(exemplar, numCadastro);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void titulo() {
		System.out.println("Você é Funcionário da Biblioteca país das Maravilhas ");
	}

}
