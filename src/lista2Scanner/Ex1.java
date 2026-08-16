package lista2Scanner;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do aluno:");
		String nome = sc.nextLine();
		
		System.out.println("Digite a idade do aluno:");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o curso do aluno:");
		String curso = sc.nextLine();
		
		System.out.println("Digite a altura do aluno (m):");
		double alt = sc.nextDouble();
		
		System.out.println("Digite a média final do aluno:");
		double media = sc.nextDouble();
		
		System.out.println("Digite a situação de matrícula do aluno (true ou false):");
		boolean matricula = sc.nextBoolean();
		
		System.out.println("Nome do aluno: "+nome);
		System.out.println("Idade do aluno: "+id);
		System.out.println("Curso do aluno: "+curso);
		System.out.println("Altura do aluno: "+alt);
		System.out.println("Média final do aluno: "+media);
		System.out.println("Situação de matrícula: "+matricula);
		sc.close();
	}

}
