package estruturacondicional;

import java.util.Scanner;

public class Numero_Par_Ou_Impar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Informe o número:");
		numero = ler.nextInt();

		if (numero %2 == 0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é ímpar");
		}
		ler.close();
	}

}
