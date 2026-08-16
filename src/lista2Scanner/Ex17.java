package lista2Scanner;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantia em estoque:");
		int estoque = sc.nextInt();
		
		 String mensagem = (estoque < 5) ? "Estoque baixo" : "Estoque suficiente";
		 
		 System.out.println(mensagem);
		 sc.close();
	}

}
