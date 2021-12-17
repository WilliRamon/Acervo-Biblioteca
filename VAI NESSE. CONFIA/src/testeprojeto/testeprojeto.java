package testeprojeto;

import java.util.ArrayList;

public class testeprojeto {

	public static void main(String[] args) {
		Manga manga01 = new Manga();
		Manga manga02 = new Manga();
		ArrayList<Exemplar> exempla = new ArrayList<>();
		ArrayList<Manga> manga = new ArrayList<>();
		
		manga.add(manga01);
		System.out.println(manga);
		
		
		manga01.cadastrarExemplar("Naruto", "Kishimoto", 123456, 5);
		manga02.cadastrarExemplar("Dragon ball", "Alguém lá", 132, 5);
		
		manga01.retirarLivro();
		manga01.retirarLivro();
		manga01.retirarLivro();
		manga01.retirarLivro();
		manga01.retirarLivro();
		
		manga01.devolverLivro();
		manga01.realizarConsulta();
		//manga02.retirarLivro();
		
		manga02.excluirExemplar();
		manga02.realizarConsulta();
		
		//c1.fazerAniversario();
	}

}
