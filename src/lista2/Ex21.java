package lista2;

public class Ex21 {
    public static void main(String[] args) {

        String nome = "João Gomes";
        double salarioBase = 2500.00;
        int horasExtras = 8;

        double valorHorasExtras = horasExtras * 35;
        double salarioFinal = salarioBase + valorHorasExtras;

        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Valor das Horas Extras: R$ " + valorHorasExtras);
        System.out.println("Salário Final: R$ " + salarioFinal);

    }
}