package estruturadeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeEstruturadeDados {

	public static void main(String[] args) {
		// Atividade de Estrutura de dados usando Fila

//		
//		    Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, para organizar a ordem de chegada dos Clientes de um Banco. 
//		    O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
//			1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
//			2: Listar todos os Clientes na fila
//			3: Chamar (retirar) uma pessoa da fila 
//			0: O programa deve ser finalizado. 
//			Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..

		
		//opção com menu usando WHILE
		
		Queue<String> clientes = new LinkedList<String>();
		int opcao = 30; // iniciar a variavel com qualquer opção que não seja zero, pois se não o while n vai funcionar

		String clienteAdicionado;

		Scanner leia = new Scanner(System.in);

		while (opcao != 0) { //enquanto o cliente não digitar 0 o loop vai continuar rodando

			System.out.println("\n");

			System.out.println("Selecione uma opção desejada :");
			System.out.println("\n");
			System.out.println("*** 1 - Adicionar um novo Cliente na fila ***"); // deve solicitar o nome do cliente
			System.out.println("*** 2 - Listar todos os clientes da fila ***");
			System.out.println("*** 3 - Retirar alguém da fila (chamar)***");
			System.out.println("*** 0 - Sair ***");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {

			case 1:

				System.out.println("Digite o nome do cliente que vc quer adicionar :");
				clienteAdicionado = leia.nextLine();
				clientes.add(clienteAdicionado);

				System.out.println("\n");
				System.out.println("Cliente adicionado !");
				System.out.println("\n");

				break;

			case 0:
				System.out.println("\n");
				System.out.println("Saiu do sistema! Obrigado  e volte sempre :)");
				break;

			case 2:
				System.out.println("\n");
				System.out.println("Os clientes da fila são :" + clientes);
				break;

			case 3:
				
				if(clientes.isEmpty()) {
					System.out.println("A fila está vazia ! Clique na opção 1 para adicionar clientes!" );
				}else {
				clientes.poll();
				System.out.println("Cliente chamado!");
				System.out.println("\n");
				System.out.println("Fila atualizada :" + clientes);
				}
				

				break;
			}

		}

	}

			

}
