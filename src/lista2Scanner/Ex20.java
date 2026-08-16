package lista2Scanner;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a idade:");
		int id = sc.nextInt();
		
		String mensagem = (id>=70) ? "Atendimento preferencial" : "Atendimento comum";
		
		System.out.println("Idade: "+id+" anos");
		System.out.println(mensagem);
		sc.close();
	}

}
