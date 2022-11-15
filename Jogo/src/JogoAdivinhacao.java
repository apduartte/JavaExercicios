import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) {
				//Auto-generated method stubPágina 94 do livro  Java para Leigos
				Scanner teclado = new Scanner(System.in);
				
				System.out.print("Entre com int de 1 a 10: " );
				
				int numeroEntrada = teclado.nextInt();
				int numeroAleatorio = new Random().nextInt(10) + 1;
								
				if (numeroEntrada == numeroAleatorio) {
					System.out.println("***********");
					System.out.println("Você veceu!");
					System.out.println("***********");
				} else {
					System.out.println("Você perdeu!");
					System.out.println("O número aleatório era: ");
					System.out.println(numeroAleatorio + ".");
				}
				System.out.println("Obrigado por jogar.");	
			}
}



