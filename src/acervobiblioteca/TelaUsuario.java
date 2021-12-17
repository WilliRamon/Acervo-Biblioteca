package acervobiblioteca;

import java.util.Scanner;

public class TelaUsuario {

	public static void main(String[] args) {
		
		String login, senha;
		int opcaoA;
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Biblioteca Generation");
		
		//criar objeto cliente
		Cliente c1 = new Cliente();
		
		//realizar login
		System.out.print("Login: ");
		login = ler.next();
		System.out.print("Senha: ");
		senha = ler.next();
		
		
		
		//se usuário e senha corretos
		if(login.equals("teste")&&senha.equals("123")) // o == não funciona para variavel string
		{
			System.out.println("Bem vinde "+login+"!");
			
			//chamar método consultarAcervo 
			c1.consultarAcervo();  //ATENÇÃO! MÉTODO NÃO TEM NADA AINDA
			
			//Depois que mostrar o acervo, mostrar as opções de ação
			System.out.println("Digite 1 para RETIRAR o livro. "
					+ "\nDigite 2 para DEVOLVER o livro."
					+ "\nInforme a opção desejada: ");
			opcaoA = ler.nextInt();
			//Se opcao 1, chamar método retirarLivro
			if(opcaoA==1)
			{
				c1.retirarLivro(); //ATENÇÃO! MÉTODO NÃO TEM NADA AINDA
			}
			//Se opcao 2, chamar método devolverLivro
			else if(opcaoA==2)
			{
				c1.devolverLivro();
			}
			
		}
		
		//se a senha for incorreta
		else
		{
			System.out.println("Login ou senha incorretos. Tente novamente.");
		}
		
	}

}
