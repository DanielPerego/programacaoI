package listaIf;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a média do aluno:");
		double media = sc.nextDouble();
		
		if(media >= 7) {
			if(media >= 9.5) {
				System.out.println("Aluno aprovado com distinção!");
			}else {
				System.out.println("Aluno aprovado!");
			}
		}else {
			System.out.println("Aluno reprovado!");
		}
		
		sc.close();
	}

}
