package jAVA09EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		Scanner scan = new Scanner (System.in);
		Scanner leia = new Scanner (System.in);
		
		System.out.println("*************************************************");
		System.out.println("\n 1 - Adicionar cliente na fila");
		System.out.println(" 2 - Listar todos os clientes");
		System.out.println(" 3 - Retirar cliente da fila");
		System.out.println(" 0 - Sair");
		System.out.println("*************************************************");
		System.out.println();
		System.out.println("Entre com a opção desejada:");
		int opcao = scan.nextInt();
		
		
		while (opcao != 0) {
			if(opcao == 1) {
				System.out.println("Digite o nome do cliente: ");
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.println("Cliente adicionado!");
			}
			if (opcao == 2) {
				System.out.println("Lista de clientes na fila: ");
				System.out.println(fila);
			}
			if (opcao == 3) {
				if(fila.size() == 0) {
					System.out.println("A fila está vazia.");
				} else {
					fila.remove();
					System.out.println("O cliente foi chamado!");
				}
			}
			
			System.out.println("*************************************************");
			System.out.println("\n 1 - Adicionar cliente na fila");
			System.out.println(" 2 - Listar todos os clientes");
			System.out.println(" 3 - Retirar cliente da fila");
			System.out.println(" 0 - Sair");
			System.out.println("*************************************************");
			System.out.println();
			System.out.println("Entre com a opção desejada:");
			opcao = scan.nextInt();
			
		}
		
	}

}
