package temperatura;



/**
 * 1. Escreva um programa que, com base em uma temperatura em graus celsius, a
 * converta e exiba em Kelvin (K), R�aumur (Re), Rankine (Ra) e Fahrenheit (F),
 * seguindo as f�rmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C
 * * 1.8 + 32 + 459.67
 * 
 * @author Mateus
 */
public class Converter {

	double k = 0.0;
	double re = 0.0;
	double ra = 0.0;
	double f = 0.0;

	public double kelvin(double celsius) {

		return  k = celsius + 273.15;
	}

	public double reaumur(double celsius) {

		return re = celsius * 0.8;
	}

	public double rankine(double celsius) {
		return ra = celsius * 1.8 + 32 + 459.67;
	}

	public double fahrenheit(double celsius) {
		return f = celsius * 1.8 + 32;
	}

}
