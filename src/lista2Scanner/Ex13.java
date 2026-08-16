package lista2Scanner;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Possui CNH?:");
		boolean cnh = sc.nextBoolean();
		
		System.out.println("Possui carro?:");
		boolean carro = sc.nextBoolean();
		
		System.out.println("Possui dinheiro?:");
		boolean dinheiro = sc.nextBoolean();
		
		System.out.println(cnh&&carro);
		System.out.println(carro||dinheiro);
		System.out.println(!cnh);
		System.out.println(cnh&&dinheiro);
		System.out.println(!(carro||dinheiro));
		sc.close();
	}

}
