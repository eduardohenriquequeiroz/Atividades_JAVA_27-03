package estruturacondicional;

import java.util.Scanner;

public class Dia_da_Semana {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String DiaSemana;
		int numero;

		System.out.println("Informe o número do dia da semana: ");
		numero = ler.nextInt();

		if (numero <1) {
			System.out.println("Dia inválido");
		}
		else if (numero == 1) {
			System.out.println("Segunda-Feira");
		}
		else if (numero == 2) {
			System.out.println("Terça-Feira");
		}
		else if (numero == 3) {
			System.out.println("Quarta-Feira");
		}
		else if (numero == 4) {
			System.out.println("Quinta-Feira");
		}
		else if (numero == 5) {
			System.out.println("Sexta-Feira");
		}
		else if (numero == 6) {
			System.out.println("Sábado");
		}
		else if (numero == 7) {
			System.out.println("Domingo");
		}
		else {
			System.out.println("Dia inválido");
		}
		ler.close();
	}
}