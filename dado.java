import java.util.Scanner;
import java.util.Random;

/*------Desenvolvido por Eugenio do Rosario------*/

public class dado{
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
			 Random num = new Random();
		Boolean gatilho = true;
		
		System.out.println("=====Jogo de Dados=====");
		System.out.println("\n");
		
		while(gatilho){
			
			System.out.print("Qual eh o seu palpite: ");
			int palpite = teclado.nextInt(); 
			//gerando numeros de 1 a 6
			int gerador = num.nextInt(6 - 1 + 1) + 1; 
			
			if(palpite == gerador){
				System.out.println("Parabens, Acertou o palpite");
				gatilho = false;
			} else {
				System.out.println("O valor do palpite eh: " + gerador + ", tente novamente.");
			}
		}

	}
}
