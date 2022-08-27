package temperatura;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Converter c = new Converter();
		
		System.out.println("Digite os graus em Celsius");
		double celsius = ler.nextDouble();
		
		System.out.println(celsius +" graus:");
		System.out.println(" convertido em Kelvin: " + c.kelvin(celsius) + " (K)");
		System.out.println(" convertido em Rankine: " + c.rankine(celsius) + " (Ra)");
		System.out.println(" convertido em Reaumur: " + c.reaumur(celsius) + " (Re)");
		System.out.println(" convertido em Fahrenheit: " + c.fahrenheit(celsius) + " (F)");
		
	}

}
