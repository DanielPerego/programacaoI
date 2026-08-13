package lista2;

public class Ex3 {
    public static void main(String[] args) {

        double distancia = 420;
        double litros = 35;

        double consumoMedio = distancia / litros;
        double litrosPara100 = 100 / consumoMedio;

        System.out.println("Consumo médio: " + consumoMedio + " km/l");
        System.out.println("Litros para 100 km: " + litrosPara100);

    }
}