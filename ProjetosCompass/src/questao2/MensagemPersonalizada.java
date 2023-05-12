package questao2;
import java.util.Scanner;

public class MensagemPersonalizada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma mensagem: ");
		String mensagem = scan.nextLine();
		scan.close();

		int qtdDivertido = 0;
		int qtdIrritado = 0;

		for (int i = 0; i < mensagem.length() - 1; i++) {
			if (mensagem.charAt(i) == ':' && mensagem.charAt(i+1) == '-') {
				if (i + 2 < mensagem.length() && mensagem.charAt(i+2) == ')') {
					qtdDivertido++;
				} else if (i + 2 < mensagem.length() && mensagem.charAt(i+2) == '(') {
					qtdIrritado++;
				}
			}
		}

		if (qtdDivertido == qtdIrritado) {
			System.out.println("neutral");
		} else if (qtdDivertido > qtdIrritado) {
			System.out.println("fun");
		} else {
			System.out.println("upset");
		}
	}

}

