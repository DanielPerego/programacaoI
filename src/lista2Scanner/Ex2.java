package lista2Scanner;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a marca do veículo:");
		String marca = sc.nextLine();
		
		System.out.println("Digite o modelo do veículo:");
		String modelo = sc.nextLine();
		
		System.out.println("Digite o ano de fabricação do veículo:");
		int ano = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite a cor do veículo:");
		String cor = sc.nextLine();
		
		System.out.println("Digite o valor do veículo:");
		double valor = sc.nextDouble();
		
		System.out.println("Veículo automático? (true ou false):");
		boolean automatico = sc.nextBoolean();
		
		System.out.println("Marca do veículo: "+marca);
		System.out.println("Modelo do veículo: "+modelo);
		System.out.println("Ano do veículo: "+ano);
		System.out.println("Cor do veículo: "+cor);
		System.out.println("Valor do veículo: R$"+valor);
		System.out.println("Veículo automático? "+automatico);
		sc.close();
	}

}
