package lista2Scanner;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o saldo:");
		double saldo = sc.nextDouble();
		
		String mensagem = (saldo>0) ? "Saldo positivo" : "Saldo negativo";
		
		System.out.println("Saldo: R$"+saldo);
		System.out.println("\n"+mensagem);
		sc.close();
	}

}
