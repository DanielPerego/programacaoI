package lista2Scanner;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do produto:");
		String produto = sc.nextLine();
		
		System.out.println("Digite o valor do produto:");
		double valor = sc.nextDouble();
		
		System.out.println("Digite quantas unidades serão compradas:");
		int uni = sc.nextInt();
		
		System.out.println("Digite quantas parcelas serão feitas:");
		int parc = sc.nextInt();
		
		double valorTotal = valor*uni;
		double valorParc = valorTotal/parc;
		
		System.out.println(produto);
		System.out.println(valor);
		System.out.println(uni);
		System.out.println(valorTotal);
		System.out.println(parc);
		System.out.println(valorParc);
		sc.close();
	}

}
