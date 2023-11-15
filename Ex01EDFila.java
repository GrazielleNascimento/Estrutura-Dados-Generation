package estruturaDados;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01EDFila {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> fila = new LinkedList<String>();

        int opcao;

        do {
            System.out.println("\n****************************************");
            System.out.println("1 - Adicionar clientes na Fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Retiar Cliente da Fila");
            System.out.println("0 - Sair");
            System.out.println("****************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("\nDigite nome: ");
                    String nome = sc.next();

                    fila.add(nome);
                    System.out.println("\nCliente adicionado!\n");

                    break;
                case 2:

                    if(fila.isEmpty() == true) {
                        System.out.println("\nA fila está vazia!");
                    } else {
                        System.out.println("\nLista de clientes da fila:");

                        for (Iterator<String> it = fila.iterator(); it.hasNext(); ) {
                            System.out.println(it.next());
                        }
                    }
                    break;
                case 3:

                    if(fila.isEmpty() == true) {
                        System.out.println("\nA fila está vazia!");
                    } else {
                        fila.remove();

                        System.out.println("\nFila: \n");
                        for(Iterator<String> it = fila.iterator(); it.hasNext();) {
                            System.out.println(it.next());
                        }

                        System.out.printf("\nO Cliente foi Chamado!");
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;

                default:
                    System.out.println("\nOpção Inválida!");
            }


        }while(opcao != 0);
    }
}

