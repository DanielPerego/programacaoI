package lista2Scanner;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma temperatura:");
		int temp = sc.nextInt();
		
		System.out.println(temp>25);
		System.out.println(temp<=30);
		System.out.println(temp==20);
		System.out.println(temp!=30);
		sc.close();
	}

}
