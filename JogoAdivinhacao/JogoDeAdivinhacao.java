import java.util.Scanner;

public class JogoDeAdivinhacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stubPágina 94 di livro  Java para Leigos
		Scanner teclado = new Scanner(System.in);
		
		out.print("Entre com int de 1 a 10: " );
		
		int numeroEntrada = teclado.nextInt();
		int numeroAleatorio = new Randow.next(10) + 1;
		
		if (numeroEntrada == numeroAleatorio) {
			out.println("***********");
			out.println("Você veceu!");
			out.println("***********");
		} else {
			out.println("Você perdeu!");
			out.println("O número aleatório era: ");
			out.println(numeroAleatorio + ".");
		}
		out.println("Obrigado por jogar.");	

	}

}
