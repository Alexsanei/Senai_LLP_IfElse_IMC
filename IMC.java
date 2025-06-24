import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso em kg (ex: 70): ");
        double peso = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Resultado
        System.out.printf("Seu IMC é: %.2f\n", imc);

        // Interpretação
        if (imc < 18.5) {
            System.out.println("Interpretação: Abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Interpretação: Peso normal.");
        } else if (imc < 30) {
            System.out.println("Interpretação: Sobrepeso.");
        } else {
            System.out.println("Interpretação: Obesidade.");
        }

        scanner.close();
    }
}
