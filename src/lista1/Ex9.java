package lista1;

public class Ex9 {
    public static void main(String[] args) {

        boolean possuiIngresso = true;
        boolean possuiDocumento = false;
        boolean acompanhanteMaiorIdade = true;

        // Precisa dos dois
        System.out.println(possuiIngresso && possuiDocumento);

        // Basta um
        System.out.println(possuiIngresso || possuiDocumento);

        // Inverte o valor
        System.out.println(!possuiDocumento);

        // Tem ingresso e documento ou acompanhante
        System.out.println(possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade));

        // Inverte o resultado
        System.out.println(!(possuiIngresso && possuiDocumento));

    }
}