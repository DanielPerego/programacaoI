package lista2Scanner;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura inicial:");
		double temp = sc.nextDouble();
		
		int temp2 = (int) temp;
		
		double temp3 = (double) temp2;
		
		System.out.println("Temperatura inicial: "+temp);
		System.out.println("Temperatura inteira: "+temp2);
		System.out.println("Temperatura double: "+temp3);
		sc.close();
	}

}
