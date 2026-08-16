package lista2Scanner;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a distância percorrida na viagem (km):");
		int dist = sc.nextInt();
		
		System.out.println("Distância em metros: "+(dist*1000));
		sc.close();
	}

}
