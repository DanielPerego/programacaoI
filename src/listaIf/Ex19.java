package listaIf;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a idade do usuário:");
		int idade = sc.nextInt();
		
		System.out.println("Informe o sexo do usuário:");
		String sexo = sc.next();
		
		if(idade < 0) {
			System.out.println("Ninguém pode ter idade menor que zero!");
		}else if(idade <= 12) {
			System.out.println("É uma criança");
		}else if(idade <= 17) {
			System.out.println("É um adolescente");
		}else if(sexo.equals("homem")) {
			if(idade <= 64) {
				System.out.println("É um homem adulto");
			}else {
				System.out.println("É um homem idoso");
			}
		}else if(sexo.equals("mulher")) {
			if(idade <= 62) {
				System.out.println("É uma mulher adulta");
			}else {
				System.out.println("É uma mulher idosa");
			}
		}else {
			System.out.println("Sexo inválido");
		}
		
		sc.close();
	}

}
