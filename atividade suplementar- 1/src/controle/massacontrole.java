package controle;

import java.util.Scanner;
import dominio.Massa;

public class massacontrole {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		try {
		System.out.print("Digite a Massa Inicial em Gramas: ");
		float massaInicial = leia.nextFloat();
		
		Massa massa = new Massa(massaInicial);
		massa.calculaTempo();
		
		
		System.out.println("Massa inicial: " + massa.getMassaInicial() + " gramas");
		System.out.println("Massa final : " + massa.getMassaFinal() + " gramas");
		System.out.println("Tempo obtido : " + massa.getTempo() + " segundos");
		}
		catch(Exception e){

			System.out.println("Houve um erro na entrada de dados ");

			}
	}
}