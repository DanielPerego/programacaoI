package listaSwitch;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int filme;
		
		System.out.println("Informe o número da sala (1 e 2):");
		int sala = sc.nextInt();
		
		switch(sala) {
			case 1:
				System.out.println("Informe o gênero do filme:");
				System.out.println("1 - Aventura");
				System.out.println("2 - Comédia");
				System.out.println("3 - Ficção Científica");
				filme = sc.nextInt();
				
				switch(filme) {
					case 1:
						System.out.println("Aventura");
						break;
						
					case 2:
						System.out.println("Comédia");
						break;
						
					case 3:
						System.out.println("Ficcção Científica");
						break;
						
					default:
						System.out.println("Opção inválida!");
				}
				break;
				
			case 2:
				System.out.println("Informe o gênero do filme:");
				System.out.println("1 - Terror");
				System.out.println("2 - Romance");
				System.out.println("3 - Animação");
				filme = sc.nextInt();
				
			switch(filme) {
				case 1:
					System.out.println("Terror");
					break;
					
				case 2:
					System.out.println("Romance");
					break;
					
				case 3:
					System.out.println("Animação");
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
