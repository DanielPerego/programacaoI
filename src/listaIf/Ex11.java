package listaIf;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a média do aluno:");
		double media = sc.nextDouble();
		
		if(media >= 9) {
			System.out.println("A");
		}else if(media >= 7) {
			System.out.println("B");
		}else if(media >= 5) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		sc.close();
	}

}
