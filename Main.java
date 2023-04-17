import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus celsius para receber em fahrenheit: ");
        double tempC = leitura.nextDouble();
        int tempF = (int) (tempC * 1.8) + 32;
        System.out.println("A temperatura " + tempC + "º em fahrenheit é: " + tempF);

    }
}