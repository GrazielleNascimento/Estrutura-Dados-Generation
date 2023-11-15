package estruturaDados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Ex02EDPilha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();

		int opcao;

		do {
			System.out.println("\n****************************************");
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("****************************************");
			System.out.print("Entre com a opção desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				sc.nextLine();// limpa o cash
				System.out.print("\nDigite nome: ");
				String nome = sc.nextLine();

				pilha.add(nome);
				System.out.println("\nLivro adicionado!\n");

				break;
			case 2:

				if (pilha.isEmpty() == true) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					System.out.println("\nLista de Livros na Pilha:");

					for (Iterator<String> it = pilha.iterator(); it.hasNext();) {
						System.out.println(it.next());
					}
				}
				break;

			case 3:

				if (pilha.isEmpty() == true) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					pilha.pop();

					System.out.println("\nPilha: \n");
					for (Iterator<String> it = pilha.iterator(); it.hasNext();) {
						System.out.println(it.next());
					}

					System.out.printf("\nO Livro foi retirado da pilha!");
				}
				break;

			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;

			default:
				System.out.println("\nOpção Inválida!");
			}

		} while (opcao != 0);
	}
}
