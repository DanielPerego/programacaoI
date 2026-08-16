package lista2Scanner;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a média:");
		double media = sc.nextDouble();
		
		String mensagem = (media >= 7) ? "Aprovado" : "Reprovado";
		
		System.out.println(mensagem);
		sc.close();
	}

}
