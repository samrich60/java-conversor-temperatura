package Conversor_Temperatura;

import java.util.Locale;
import java.util.Scanner;

import util.conversor;

public class Temp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		conversor conv = new conversor();
		System.out.println(conv);
		System.out.print("Opção: ");
		int escolha = sc.nextInt();
		switch (escolha) {
			case 1:
				System.out.println("");
				System.out.println("1 - Celsius para Fahrenheit");
				System.out.println("");
				System.out.print("Digite a temperatura: ");
				conv.Celsius = sc.nextDouble();
				System.out.printf("Resultado: %.2f°F%n", conv.conversorCF());
			break;
			case 2:
				System.out.println("");
				System.out.println("2 - Celsius para Kelvin");
				System.out.println("");
				System.out.print("Digite a temperatura: ");
				conv.Celsius = sc.nextDouble();
				System.out.printf("Resultado: %.2fK%n", conv.conversorCK());
			break;
			case 3:
				System.out.println("");
				System.out.println("3 - Fahrenheit para Celsius");
				System.out.println("");
				System.out.print("Digite a temperatura: ");
				conv.Fahrenheit = sc.nextDouble();
				System.out.printf("Resultado: %.2f°C%n", conv.conversorFC());
			break;
			case 4:
				System.out.println("");
				System.out.println("4 - Fahrenheit para Kelvin");
				System.out.println("");
				System.out.print("Digite a temperatura: ");
				conv.Fahrenheit = sc.nextDouble();
				System.out.printf("Resultado: %.2fK%n", conv.conversorFK());
			break;
			case 5:
				System.out.println("");
				System.out.println("5 - Kelvin para Celsius");
				System.out.println("");
				System.out.print("Digite a temperatura: ");
				conv.Kelvin = sc.nextDouble();
				System.out.printf("Resultado: %.2f°C%n", conv.conversorKC());
			break;
			case 6:
				System.out.println("");
				System.out.println("6 - Kelvin para Fahrenheit");
				System.out.println("");
				System.out.print("Digite a temperatura: ");
				conv.Kelvin = sc.nextDouble();
				System.out.printf("Resultado: %.2f°F%n", conv.conversorKF());
			break;
			case 7:
				System.out.println("");
				System.out.println("Obrigado por utilizar o programa.");
			break;
			default:
				System.out.println("");
				System.out.println("Opção Invalida!");
		}
	sc.close();
	}
}
