package lista2Scanner;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do funcionário:");
		String nome = sc.nextLine();
		
		System.out.println("Digite o cargo do funcionário:");
		String cargo = sc.nextLine();
		
		System.out.println("Digite o salário do funcionário:");
		double sal = sc.nextDouble();
		
		System.out.println("**********");
		System.out.println("\nFuncionário: "+nome);
		System.out.println("\nCargo: "+cargo);
		System.out.println("\nSalário: "+sal);
		System.out.println("\n**********");
		sc.close();
	}

}
