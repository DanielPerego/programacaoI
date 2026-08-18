package listaIf;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome do usuário:");
		String usuario = sc.next();
		
		System.out.println("Informe a senha do usuário:");
		String senha = sc.next();
		
		if(usuario.equals("admin")) {
			if(senha.equals("1234")) {
				System.out.println("Acesso permitido");
			}else {
				System.out.println("Senha incorreta");
			}
		}else {
			System.out.println("Usuário inexistente");
		}
		
		sc.close();
	}

}
