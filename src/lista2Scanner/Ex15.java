package lista2Scanner;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do produto:");
		String nome = sc.nextLine();
		
		System.out.println("Digite o valor do produto:");
		double valor = sc.nextDouble();
		
		System.out.println("Digite a quantia em estoque:");
		int estoque = sc.nextInt();
		
		System.out.println("==================");
		System.out.println("\nProduto: "+nome);
		System.out.println("\nPreço: R$"+valor);
		System.out.println("\nEstoque: "+estoque+" unidades");
		System.out.println("\n==================");
		sc.close();
	}

}
