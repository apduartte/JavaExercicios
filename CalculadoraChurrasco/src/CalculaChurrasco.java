import java.util.Scanner;
import java.lang.module.FindException;
import java.lang.Module;

public class CalculaChurrasco {

	public static void main(String[] args) {
		//Calculadora de Churrasco
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a quantidade de convidados");
		int convidados = teclado.nextInt();
		System.out.println("Digite a quantidade de crianças");
		int crianças = teclado.nextInt();
		System.out.println("Digite a quantidade de mulheres");
		int mulheres = teclado.nextInt();
		System.out.println("Digite a quantidade de homens");
		int homens = teclado.nextInt();
		
		int total = (crianças * 150)+( mulheres * 300)+(homens * 450);
		int totalBebida = (crianças * 250)+( mulheres * 500)+(homens * 750);
			
		
	      System.out.println("Total de Carne= "+total);
	      System.out.println("Total de Bebidas= "+totalBebida);
	      
	      
	}
	}


