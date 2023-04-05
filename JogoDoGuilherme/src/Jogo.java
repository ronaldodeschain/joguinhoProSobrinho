import java.util.Random;
import java.util.Scanner;

public class Jogo {

	int pontos;
	int dificuldade;
	int primeiroNumero = 0;
	int segundoNumero = 0;
	int resultado;
	int resposta;
	int tentativas = 0;
	Scanner input = new Scanner(System.in);
	
	void inicia() {
		System.out.println("Bora Biscoito! Vamos começar! ");
		while(pontos < 5) {
			primeiroNumero = new Random().nextInt(10);
			segundoNumero = new Random().nextInt(10);
			resultado = primeiroNumero + segundoNumero;
			System.out.println(primeiroNumero + " + " +segundoNumero+ " é igual a:");
			resposta = input.nextInt();
			if (resposta == resultado) {
				System.out.println("Acertou Biscoito!");
				pontos++;
				tentativas++;
			}else {
				System.out.println("Ta errado, a resposta era: "+resultado);
				tentativas++;
			}
		}
		System.out.println("Muito bem!");
		System.out.println("Terminou o jogo em "+tentativas+" tentativas!");
	}
	
}
