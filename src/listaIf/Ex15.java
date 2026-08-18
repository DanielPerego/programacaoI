package listaIf;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o peso da pessoa (Kg):");
		double peso = sc.nextDouble();
		
		System.out.println("Informe a altura da pessoa (m):");
		double altura = sc.nextDouble();
		
		double imc = peso/(altura*altura);
		
		if(imc < 18.5) {
			System.out.println("Magreza/Abaixo do peso");
		}else if(imc <= 24.9) {
			System.out.println("Peso normal/Saudável");
		}else if(imc <= 29.9) {
			System.out.println("Sobrepeso/Pré-Obesidade");
		}else if(imc <= 34.9) {
			System.out.println("Obesidade Grau I");
		}else if(imc <= 39.9) {
			System.out.println("Obesidade Grau II");
		}else {
			System.out.println("Obesidade Grau III (Grave)");
		}
		
		sc.close();
	}

}
