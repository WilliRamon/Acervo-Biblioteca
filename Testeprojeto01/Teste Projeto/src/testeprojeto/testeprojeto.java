package testeprojeto;

public class testeprojeto {

	public static void main(String[] args) {
		Manga manga01 = new Manga();
		Manga manga02 = new Manga();
		Manga manga03 = new Manga();
		
		
		manga01.cadastrarExemplar("Naruto", "Kishimoto", 123456);
		manga02.cadastrarExemplar("Dragon ball", "Alguém lá", 123123);
		
		manga01.realizarConsulta();
		manga02.realizarConsulta();
	}

}
