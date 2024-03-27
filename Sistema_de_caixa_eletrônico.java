package estruturacondicional;

import java.util.Scanner;

public class Sistema_de_caixa_eletrônico {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int login = 56164660, Secreto = 123456, CPF, senha;
		double saldo = 1000.00, valorFinal, saque;

		System.out.println("Informe o CPF:");
		CPF = ler.nextInt();

		System.out.println("Informe a senha:");
		senha = ler.nextInt();

		if (login == CPF && senha == Secreto) {
			System.out.println("Qual o valor que gostaria de sacar perante o seu saldo: "+saldo);
			System.out.println("Informe o valor:");
			saque = ler.nextInt();

			if (saque <= saldo ) {
				System.out.println("sacar saldo");
			}
			else if (saque >saldo) {
				System.out.println("Saldo insuficiente");
			}
		}
		else {
			System.out.println("CPF ou senha incorretos");
		}
		ler.close();
	}
}


