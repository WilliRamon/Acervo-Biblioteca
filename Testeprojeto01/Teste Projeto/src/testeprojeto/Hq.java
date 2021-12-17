package testeprojeto;

public class Hq extends Exemplar{
	private String ilustrador;

	public String getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}
	
	@Override
	public void realizarConsulta() {
		System.out.println("-----Lista de Livros-----");
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Codigo: " + this.getCodigo());
		System.out.println("Categoria: " + this.getIlustrador());
		System.out.println("--------------------------");
	}
	@Override
	public void cadastrarExemplar(String titulo, String autor, int codigo) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setCodigo(codigo);
		//this.setCategoria(categoria); //DUVIDA DUVIDA DUVIDA
	}
}
