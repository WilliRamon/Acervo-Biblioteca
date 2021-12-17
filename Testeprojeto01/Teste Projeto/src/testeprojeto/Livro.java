package testeprojeto;

public class Livro extends Exemplar{
	private String categoria;

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

	
	@Override
	public void realizarConsulta() {
		System.out.println("-----Lista de Livros-----");
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Codigo: " + this.getCodigo());
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("--------------------------");
	}
	@Override
	public void cadastrarExemplar(String titulo, String autor, int codigo) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setCodigo(codigo);
		this.setCategoria(categoria); //DUVIDA DUVIDA DUVIDA
	}
}
