package listaIf;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a idade do usuário:");
		int id = sc.nextInt();
		
		if(id <= 12) {
			System.out.println("Criança");
		}else if(id <= 17) {
			System.out.println("Adolescente");
		}else if(id <= 59) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		}
		
		sc.close();
	}

}
