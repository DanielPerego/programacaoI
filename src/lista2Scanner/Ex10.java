package lista2Scanner;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de alunos:");
		int alunos = sc.nextInt();
		
		System.out.println("Digite a quantidade de grupos:");
		int grupos = sc.nextInt();
		
		int divisaoInteira = alunos/grupos;
		
		double divisaoDouble = (double) alunos/grupos;
		
		System.out.println("Divisão Inteira: "+divisaoInteira);
		System.out.println("Divisão Double: "+divisaoDouble);
		sc.close();
	}

}
