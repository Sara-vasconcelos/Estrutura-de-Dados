package estruturadeDados;

import java.util.Scanner;
import java.util.Stack;

public class AtividadeEstruturaPilha {

	public static void main(String[] args) {
		// Atividade de estruturas de dados com  a Pilha
//		
//		    Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, para organizar a retirada de livros em uma pilha. 
//		    O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
//		    	
//			1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
//			2: Listar todos os livros da Pilha
//			3: Retirar um livro da pilha 
//			0: O programa deve ser finalizado. 
//			Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.

		
		//opção de menu usando o DO e WHILE
		
		Stack <String> livros  = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		String livroAdicionado;
		
		
		do {
		System.out.println("\n");

		System.out.println("Selecione uma opção desejada :");
		System.out.println("\n");
		System.out.println("*** 1 - Adicionar um novo livro ***"); 
		System.out.println("*** 2 - Listar todos os livros da fila ***");
		System.out.println("*** 3 - Retirar um livro da pilha***");
		System.out.println("*** 0 - Sair ***");
		opcao = leia.nextInt();
		leia.nextLine();
		
		
		switch(opcao) {
		
		case 0 : 
			System.out.println("\n");
			System.out.println("Saiu do sistema! Obrigado  por usar nossa biblioteca , volte sempre :)");
			break;
		
		case 1:
			System.out.println("Digite o nome do livro que quer incluir na pilha :");
			livroAdicionado = leia.nextLine();
			livros.push(livroAdicionado);

			System.out.println("\n");
			System.out.println(" Livro adicionado !");
			System.out.println("\n");	
			
			break;
			
	
		case 2 :
			System.out.println("Você tem : " + livros.size()+ " livros em sua pilha");
			System.out.println("Os nomes dos livros são : " + livros);
			break;
			
		case 3:
			if(livros.isEmpty()) {
				System.out.println("A pilha está vazia ! Clique na opção 1 para adicionar os livros!" );
			}else {
			livros.pop();
			System.out.println("Livro retirado!");
			System.out.println("\n");
			System.out.println("Você tem agora  : " + livros.size()+ " livros em sua pilha");
			System.out.println("\n");
			System.out.println("Pilha atualizada  :" + livros);
			}
			
		
		
		
		
		}
	
		
		}while(opcao!=0);
		

	}

}
