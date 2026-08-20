package listaSwitch;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int disciplina;
		
		System.out.println("Informe o curso:");
		System.out.println("1 - Informática");
		System.out.println("2 - Administração");
		System.out.println("3 - Engenharia");
		int curso = sc.nextInt();
		
		switch(curso) {
			case 1:
				System.out.println("Escolha a disciplina do curso:");
				System.out.println("1 - Programação");
				System.out.println("2 - Banco de Dados");
				System.out.println("3 - Redes");
				disciplina = sc.nextInt();
				
				switch(disciplina) {
					case 1:
						System.out.println("Programação");
						break;
						
					case 2:
						System.out.println("Banco de Dados");
						break;
						
					case 3:
						System.out.println("Redes");
						break;
						
					default:
						System.out.println("Opção inválida!");
				}
				break;
			case 2:
				System.out.println("Escolha a disciplina do curso:");
				System.out.println("1 - Marketing");
				System.out.println("2 - Economia");
				System.out.println("3 - Contabilidade");
				disciplina = sc.nextInt();
				
				switch(disciplina) {
					case 1:
						System.out.println("Marketing");
						break;
						
					case 2:
						System.out.println("Economia");
						break;
						
					case 3:
						System.out.println("Contabilidade");
						break;
						
					default:
						System.out.println("Opção inválida!");
				}
				break;
				
			case 3:
				System.out.println("Escolha a disciplina do curso:");
				System.out.println("1 - Cálculo");
				System.out.println("2 - Física");
				System.out.println("3 - Desenho Técnico");
				disciplina = sc.nextInt();
				
				switch(disciplina) {
					case 1:
						System.out.println("Cálculo");
						break;
						
					case 2:
						System.out.println("Física");
						break;
						
					case 3:
						System.out.println("Desenho Técnico");
						break;
						
					default:
						System.out.println("Opção inválida!");
				}
				break;
				
			default:
				System.out.println("Opção inválida!");
		}
		sc.close();
	}

}
