package java8Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadesCollections1 {

	public static void main(String[] args) {
		
		ArrayList <String> cores = new ArrayList<String>();
		Scanner scan = new Scanner (System.in);
		String digitadas = ("");
		int i = 0;
		
		for(i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			digitadas = scan.nextLine();
			cores.add(digitadas);
			}
		
		System.out.println("Estas foram as cores que você adicionou: " + cores);
		Collections.sort(cores);
		System.out.println("Cores em ordem alfabética: " + cores);
		
	}
}
