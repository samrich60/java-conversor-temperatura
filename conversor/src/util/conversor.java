package util;

import java.util.Scanner;

public class conversor {
	public double Celsius;
	public double Fahrenheit;
	public double Kelvin;
	public double resultado = 0;
	
	Scanner sc1 = new Scanner(System.in);
	
	public double conversorCF () {
		return resultado = (Celsius * 9/5) + 32;
	}

	public double conversorCK () {
		return resultado = Celsius + 273.15;
	}
	
	public double conversorFC () {
		return resultado = (Fahrenheit - 32) * 5/9;
	}
	
	public double conversorFK () {
		return resultado = (Fahrenheit - 32) * 5/9 + 273.15;
	}
	public double conversorKC () {
		return resultado = Kelvin - 273.15;
	}
	public double conversorKF () {
		return resultado = (Kelvin - 273.15) * 9/5 + 32;
	}
	
	public String toString() {
		String Perguntas = "Conversor de Temperatura:"
				+ "\n1 - Celsius para Fahrenheit"
				+ "\n2 - Celsius para Kelvin"
				+ "\n3 - Fahrenheit para Celsius"
				+ "\n4 - Fahrenheit para Kelin"
				+ "\n5 - Kelvin para Celsius"
				+ "\n6 - Kelvin para Fahrenheit"
				+ "\n7 - Encerrar";
		return Perguntas;
	}
	
}
