
import java.util.Scanner;

public class somaNumero {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int numero1 = dados.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int numero2 = dados.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("SOMA = " + soma);
		
		dados.close();

	}

}
