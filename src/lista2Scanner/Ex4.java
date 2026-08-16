package lista2Scanner;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota 1:");
		double n1 = sc.nextDouble();
				
		System.out.println("Digite a nota 2:");
		double n2 = sc.nextDouble();
		
		System.out.println("Digite a nota 3:");
		double n3 = sc.nextDouble();
		
		System.out.println("Soma de todas as notas: "+(n1+n2+n3));
		System.out.println("Média final: "+(n1+n2+n3)/3);
		sc.close();
	}

}
