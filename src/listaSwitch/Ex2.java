package listaSwitch;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número 1:");
		double n1 = sc.nextDouble();
		
		System.out.println("Digite o número 2:");
		double n2 = sc.nextDouble();
		
		System.out.println("Digite qual opção de cálculo será realizada:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		int op = sc.nextInt();
		
		switch(op) {
			case 1:
				System.out.println(n1+n2);
				break;
				
			case 2:
				System.out.println(n1-n2);
				break;
				
			case 3:
				System.out.println(n1*n2);
				break;
				
			case 4:
				System.out.println(n1/n2);
				break;
				
			default:
				System.out.println("Opção inválida");
		}
		sc.close();
	}

}
