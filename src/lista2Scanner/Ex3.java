package lista2Scanner;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos km o veículo percorreu:");
		double distancia = sc.nextDouble();
		
		System.out.println("Digite a quantidade de gasolina necessária para percorrer essa distância (l):");
		double litros = sc.nextDouble();
		
		double consumoMedio = distancia/litros;
		
		System.out.println("Consumo médio: "+consumoMedio);
		System.out.println("Litros necessários para percorrer 100Km: "+(100/consumoMedio));
		sc.close();
	}

}
