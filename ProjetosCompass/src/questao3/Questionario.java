package questao3;
import java.util.Scanner;

public class Questionario {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Pergunta o nome do usu�rio
		System.out.print("Qual � o seu nome? ");
		String nome = input.nextLine();

		// Define as perguntas e respostas
		String[] perguntas = {"Qual � a capital do Brasil?", "Quem descobriu o Brasil?", "Quanto � 2 + 2?"};
		String[] respostas = {"Bras�lia", "Pedro �lvares Cabral", "4"};

		// Inicializa vari�veis de controle
		int numPerguntas = perguntas.length;
		int numAcertos = 0;
		int numErros = 0;

		// Itera sobre as perguntas e verifica as respostas
		for (int i = 0; i < numPerguntas; i++) {
			System.out.print(perguntas[i] + " ");
			String resposta = input.nextLine();

			if (resposta.equalsIgnoreCase(respostas[i])) {
				System.out.println("Resposta correta!");
				numAcertos++;
			} else {
				System.out.println("Resposta incorreta!");
				numErros++;
			}
		}

		// Exibe o resultado final
		System.out.println("Fim do question�rio, " + nome + "!");
		System.out.println("Voc� acertou " + numAcertos + " de " + numPerguntas + " perguntas.");
		System.out.println("Voc� errou " + numErros + " de " + numPerguntas + " perguntas.");
	}

}


