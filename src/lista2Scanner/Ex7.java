package lista2Scanner;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma nota:");
		double nota = sc.nextDouble();
		
		int nota2 = (int) nota;
		
		double nota3 = (double) nota2;
		
		System.out.println("Nota original: "+nota);
		System.out.println("Nota inteira: "+nota2);
		System.out.println("Nota double: "+nota3);
		sc.close();
	}

}
