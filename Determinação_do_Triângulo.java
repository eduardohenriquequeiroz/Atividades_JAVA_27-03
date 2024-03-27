package estruturacondicional;

import java.util.Scanner;

public class Determinação_do_Triângulo {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int valor1, valor2, valor3;

		System.out.println("Informe o primeiro número:");
		valor1 = ler.nextInt();

		System.out.println("Informe o segundo número:");
		valor2 = ler.nextInt();

		System.out.println("informe o terceiro número:");
		valor3 = ler.nextInt();

		if (valor1 == valor2 && valor1 == valor3) {
			System.out.println("O triângulo é equilátero");
		}
		else if (valor1 == valor2 && valor1 != valor3) {
			System.out.println("O triângulo é isósceles");
		}
		else {
			System.out.println("O triângulo é escaleno");
		}
		ler.close();
	}
	
}


