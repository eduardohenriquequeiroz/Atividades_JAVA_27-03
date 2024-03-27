package estruturacondicional;

import java.util.Scanner;

public class Meses_do_Ano {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String MesAno;
		int numero;

		System.out.println("Informe o mês do ano: ");
		numero = ler.nextInt();

		if (numero <1) {
			System.out.println("Mês invalido");
		}
		else if (numero == 1) {
			System.out.println("Janeiro");
		}
		else if (numero == 2) {
			System.out.println("Fevereiro");
		}
		else if (numero == 3) {
			System.out.println("Março");
		}
		else if (numero == 4) {
			System.out.println("Abril");
		}
		else if (numero == 5) {
			System.out.println("Maio");
		}
		else if (numero == 6) {
			System.out.println("Junho");
		}
		else if (numero == 7) {
			System.out.println("Julho");
		}
		else if (numero == 8) {
			System.out.println("Agosto");
		}
		else if (numero == 9) {
			System.out.println("Setembro");
		}
		else if (numero == 10) {
			System.out.println("Outubro");
		}
		else if (numero == 11) {
			System.out.println("Novembro");
		}
		else if (numero == 12) {
			System.out.println("Dezembro");
		}
		else {
			System.out.println("Mês invalido");
		}
		ler.close();
	}
}
