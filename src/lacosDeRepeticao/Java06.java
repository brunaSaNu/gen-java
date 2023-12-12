package lacosDeRepeticao;

import java.util.Scanner;

public class Java06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro número do intervalo: ");
		int primeiro = leia.nextInt();
		
		System.out.println("Digite o último número do intervalo: ");
		int segundo = leia.nextInt();
		
		if (primeiro >= segundo) {
			System.out.println("Intervalo inválido");
		}
		
		System.out.println("No Intervalo entre " + primeiro + " e " + segundo + ":");
		
        for (int i = primeiro; i <= segundo; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " é múltiplo de 3 e 5");
            }
        }


	}

}
