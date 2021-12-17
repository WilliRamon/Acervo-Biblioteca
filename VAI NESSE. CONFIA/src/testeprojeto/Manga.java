package testeprojeto;

public class Manga extends Exemplar{
	private String ilustrador;

	public String getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}
	
	@Override
	public void realizarConsulta() {
		System.out.println("-----Lista de Manga-------");
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Codigo: " + this.getCodigo());
		System.out.println("Quantidade em Estoqeue: " + this.getQuantidadeEstoque());
		System.out.println("--------------------------");
	}
	@Override
	public void cadastrarExemplar(String titulo, String autor, int codigo, int quantidadeEstoque) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setCodigo(codigo);
		this.setQuantidadeEstoque(quantidadeEstoque);
		//this.setCategoria(categoria); //DUVIDA DUVIDA DUVIDA
	}

	@Override
	public String toString() {
		return "Manga [ilustrador=" + ilustrador + "] ";
	}

	
	
	
	
}
