package lista2;

public class Ex13 {
    public static void main(String[] args) {

        boolean possuiCNH = true;
        boolean possuiCarro = false;
        boolean possuiDinheiro = true;

        // false, pois não possui carro
        System.out.println(possuiCNH && possuiCarro);

        // true, pois possui dinheiro
        System.out.println(possuiCarro || possuiDinheiro);

        // false, pois possui CNH
        System.out.println(!possuiCNH);

        // true, pois possui CNH e dinheiro
        System.out.println(possuiCNH && possuiDinheiro);

        // false, pois a expressão interna é true
        System.out.println(!(possuiCarro || possuiDinheiro));

    }
}