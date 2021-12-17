package testeprojeto;

public abstract class Exemplar {
	private String titulo;
	private String autor;
	private int codigo;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	

	
	public void realizarConsulta() {
		System.out.println("-----Lista de Livros-----");
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Codigo: " + this.getCodigo());
		System.out.println("--------------------------");
	}
	
	public void cadastrarExemplar(String titulo, String autor, int codigo) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setCodigo(codigo);
	}
	
	public void excluirExemplar(String titulo, String autor, int codigo) {
		this.setTitulo(null);
		this.setAutor(null);
		this.setCodigo(0);
	}
	
	
}
