package lista1;

public class Ex11 {
    public static void main(String[] args) {

        String nomeAluno = "Manuel Campos";
        int nota = 6;
        int frequencia = 75;

        String resultado = (nota >= 7 && frequencia >= 75) ? "Aprovado" : "Reprovado";

        System.out.println(nomeAluno);
        System.out.println(resultado);

    }
}