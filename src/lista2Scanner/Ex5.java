package lista2Scanner;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura atual (ºC):");
		int celsius = sc.nextInt();
		
		int fahrenheit = (celsius*9/5)+32;
		
		System.out.println("Temperatura em fahrenheit: "+fahrenheit);
		sc.close();
	}

}
