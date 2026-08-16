package lista2Scanner;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do funcionário:");
		String nome = sc.nextLine();
		
		System.out.println("Digite o salário base do funcionário:");
		double salBase = sc.nextDouble();
		
		System.out.println("Digite a quantidade de horas extras trabalhadas:");
		int horasExtras = sc.nextInt();
		
		int valHoras = (horasExtras*35);
		double salTotal = salBase+valHoras;
		
		System.out.println(nome);
		System.out.println(salBase);
		System.out.println(valHoras);
		System.out.println(salTotal);
		sc.close();
	}

}
