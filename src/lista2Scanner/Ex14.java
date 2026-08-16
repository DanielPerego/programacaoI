package lista2Scanner;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Está chovendo?");
		boolean chovendo = sc.nextBoolean();
		
		System.out.println("Possui guarda-chuva?");
		boolean guardaChuva = sc.nextBoolean();
		
		System.out.println("Carro disponível?");
		boolean carro = sc.nextBoolean();
		
		System.out.println(chovendo&&guardaChuva);
		System.out.println(guardaChuva||carro);
		System.out.println(!chovendo);
		System.out.println(chovendo&&(guardaChuva||carro));
		System.out.println(!(chovendo&&guardaChuva));
		sc.close();
	}

}
