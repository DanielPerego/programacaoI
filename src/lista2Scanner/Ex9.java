package lista2Scanner;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
		int n1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor:");
		int n2 = sc.nextInt();
		
		int divisaoInteira = n1/n2;
		
		double divisaoDouble = (double) n1/n2;
		
		System.out.println("Divisão Inteira: "+divisaoInteira);
		System.out.println("Divisão Double: "+divisaoDouble);
		sc.close();
	}

}
