package java8Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeCollections2 {

	public static void main(String[] args) {
		
		ArrayList <Integer> numeros = new ArrayList <Integer>();
		Scanner scan = new Scanner (System.in);
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite um número inteiro para verificar se o mesmo se encontra na lista: ");
		int digitado = scan.nextInt();
		
		int posicao = numeros.indexOf(digitado);
		
		if(posicao != -1) {
			System.out.println("O número " + digitado + " está na posição: " + posicao);
		} else {
			System.out.println("O número " + digitado + " não foi encontrado!");
		}
		

	}

}
