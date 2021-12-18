package acervobiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class AcervoBiblioteca {

	public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			
				ArrayList<Livro> estoque = new ArrayList<>();
				Livro titulo = new Livro(null, 0);
				
				int press = -1;
				
				estoque.add(new Livro("Pai Rico, Pai Pobre", 01));
				estoque.add(new Livro("Os Segredos da Mente Milionária", 02));
				estoque.add(new Livro("As Armas da Persuasão - Como Influenciar e Não", 03));
				estoque.add(new Livro("A Arte da Guerra", 04));
				estoque.add(new Livro("Mais Esperto Que o Diabo - o Mistério ", 05));
				estoque.add(new Livro("O Poder do Agora", 06));
				estoque.add(new Livro("O Milagre Da Manhã", 07));
				estoque.add(new Livro("Mais Esperto Que O Diabo", 8));
				estoque.add(new Livro("A Arte da Sabedoria", 9));
				estoque.add(new Livro("O Feminismo é Para Todo Mundo", 10));
				estoque.add(new Livro("Como As Democracias Morrem", 11));
				estoque.add(new Livro("Quem Tem Medo do Feminismo Negro?", 12));
				estoque.add(new Livro("Aprendizagem Matematica 1", 13));
				estoque.add(new Livro("Desenho Geométrico Contextualizado", 14));
				estoque.add(new Livro("Convergências Portugues", 15));
				estoque.add(new Livro("Panoramas - Cad. Atividades Matemática", 16));
				estoque.add(new Livro("Código Civil e Legislação Civil em Vigor", 18));
				estoque.add(new Livro(" Vade Mecum Exame De Ordem", 19));
				estoque.add(new Livro("O Caso Dos Exploradores De Cavernas", 20));
				estoque.add(new Livro("Direito Civil Brasileiro - Parte Geral", 21));
				estoque.add(new Livro("BOX Pokémon: Ruby & Sapphire", 22));
				estoque.add(new Livro("BOX Shingeki no Kyojin", 23));
				estoque.add(new Livro("BOX TEX", 24));
				estoque.add(new Livro("BOX Citrus", 25));
				estoque.add(new Livro("BOX Naruto", 26));
				estoque.add(new Livro("Arsène Lupin, O Ladrão De Casaca", 27 ));
				estoque.add(new Livro("O Tatuador De Auschwitz - Baseado Na História", 28));
				estoque.add(new Livro("Admirável Mundo Novo", 29));
				estoque.add(new Livro("O Homem De Giz", 30));
				estoque.add(new Livro("BOX Harry Potter", 31));
				estoque.add(new Livro("Box - Alice No País Das Maravilhas", 32));
				estoque.add(new Livro("Box - Peter Pan", 33));
				estoque.add(new Livro("Box - O Pequeno Príncipe", 34));
				estoque.add(new Livro("Box - O Mágico De Oz", 35));
				estoque.add(new Livro("Gibis turma da Monica", 36));
				estoque.add(new Livro("Um Milhão De Finais Felizes", 37));
				estoque.add(new Livro("Um Defeito de Cor", 38));
				estoque.add(new Livro("Grande Sertão - Veredas", 39));
				estoque.add(new Livro("Textos Cruéis Demais Para Serem Lidos", 40));
				
				
					titulo.titulo();
				
										
					while(press !=0) {
									
					System.out.println("VOCÊ ESTÁ REALIZANDO:\n\n[1]DEVOLUÇÃO EXEMPLAR \n[2]RETIRAR EXEMPLAR \n[3]ATUALIZAR EXEMPLAR \n[4]MOSTRAR ESTOQUE \n[0]SAIR" );
								press = sc.nextInt();
								sc.nextLine();
									if (press == 1) {
										
										System.out.println("Insira o nome do exemplar: ");			
										String produto = sc.nextLine();
									
										System.out.println("Insira o nº de série do exemplar");
										int numSerie = sc.nextInt();
										System.out.println("EXEMPLAR DEVOLVIDO!!!");
									
										estoque.add(new Livro(produto, numSerie));
										} 
								
									else if (press == 2) {
										System.out.println("Digite o número do exemplar que deseja retirar: ");
										int i = sc.nextInt();
										System.out.println("EXEMPLAR RETIRADO!!!");
										estoque.remove(i);
									
										} 
								
									else if (press == 3) {
										System.out.println("Digite o número do exemplar que deseja atualizar: ");
										int i = sc.nextInt();
									
										sc.nextLine();
										System.out.println("Insira o nome do novo exemplar: ");
										String produto = sc.nextLine();
									
										System.out.println("Insira o nº de série do exemplar: ");
										int numSerie = sc.nextInt();
										System.out.println("EXEMPLAR ATUALIZADO!!!");
									
										estoque.set(i, new Livro(produto, numSerie));			
									} 
									
									else if (press == 4) {	
										System.out.println("EXEMPLARES ESTOQUE: ");
									
										}

								
									else {
									System.out.println("FECHANDO O PROGRAMA!!! \n\nEXEMPLAR ESTOQUE:");
									}
								
									for (int i = 0; i < estoque.size(); i++ ) {
									System.out.println(i + "|" + estoque.get(i));	
								
									}
								}
								sc.close();
							
				
			

		

	}

}
