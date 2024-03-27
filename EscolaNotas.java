package estruturacondicional;

import java.util.Scanner;

public class EscolaNotas {

	public static void main(String[] args) {

		//Variáveis
		double primeiraNota, segundaNota, terceiraNota, quartaNota, soma, divisao;

		Scanner ler = new Scanner (System.in);

		System.out.println("Informe a primeira nota");
		primeiraNota = ler.nextInt();

		System.out.println("Informe a segunda nota");
		segundaNota = ler.nextInt();

		System.out.println("Informe a terceira nota");
		terceiraNota = ler.nextInt();

		System.out.println("Informe a quarta nota");
		quartaNota = ler.nextInt();

		soma = primeiraNota+segundaNota+terceiraNota+quartaNota;
		divisao = soma/4;

		if(divisao >=6) {
			System.out.println("Aluno Aprovado " + divisao);
		}
		else {
			System.out.println("Aluno Reprovado " + divisao);
		}
		ler.close();
	}
}


