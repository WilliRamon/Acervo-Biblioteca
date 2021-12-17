package testeprojeto;

public abstract class Exemplar {
	protected String titulo;
	private String autor;
	private int codigo;
	private int quantidadeEstoque;
	
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
	
	

	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public void realizarConsulta() {
		System.out.println("-----Lista de Exemplares-----");
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Codigo: " + this.getCodigo());
		System.out.println("Quantidade em Estoqeue: " + this.getQuantidadeEstoque());
		System.out.println("--------------------------");
	
		}

	
	
	public void cadastrarExemplar(String titulo, String autor, int codigo, int quantidadeEstoque) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setCodigo(codigo);
		this.setQuantidadeEstoque(quantidadeEstoque);
	}
	
	public void excluirExemplar() {
		this.setTitulo(null);
		this.setAutor(null);
		this.setCodigo(0);
		this.setQuantidadeEstoque(0);
	}
	@Override
	public String toString() {
		return "Exemplar [titulo=" + titulo + ", autor=" + autor + ", codigo=" + codigo + ", quantidadeEstoque="
				+ quantidadeEstoque + "]";
	}

	
	public void retirarLivro() {
		if(this.getQuantidadeEstoque() > 0) {
			this.setQuantidadeEstoque(this.getQuantidadeEstoque() - 1);
			System.out.println("Obrigado! Volte sempre");
		}else {
			System.out.println("Infelizmente não temos em estoque");
		}
		

		}
	public void devolverLivro() {
		this.setQuantidadeEstoque(getQuantidadeEstoque() + 1);
		System.out.println("Obrigado por devolver e blablabla");
	}
	
	
	
}
