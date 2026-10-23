import java.util.Scanner;

public class Temperatura_Celcius_Fahrenheit {
    public static void main(String[] args) {
        final double FACTOR_CONVERSION = 9.0 / 5.0;
        final double DESFASE_FAHRENHEIT = 32.0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = entrada.nextDouble();

        double fahrenheit = celsius * FACTOR_CONVERSION + DESFASE_FAHRENHEIT;

        System.out.printf("%.2f °C equivalen a %.2f °F%n", celsius, fahrenheit);

        entrada.close();
    }
}