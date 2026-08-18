package listaIf;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a média do aluno:");
		double media = sc.nextDouble();
		
		System.out.println("Digite o percentual de frequência do aluno:");
		double frequencia = sc.nextDouble();
		
		if(media >= 7 && frequencia >= 75) {
			if(media >= 9.5) {
				System.out.println("Aluno aprovado com mérito!");
			}else {
				System.out.println("Aluno aprovado");
			}
		}else {
			System.out.println("Aluno reprovado");
		}
		
		sc.close();
	}

}
