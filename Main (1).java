/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número inteiro para as operações: \n");
		int num1 = scanner.nextInt();
		System.out.println("Digite o segundo número inteiro para as operações: \n");
		int num2 = scanner.nextInt();
		int soma = num1 + num2;
		int subtrai = num1 - num2;
		int multiplica = num1 * num2;
		System.out.println("Resultado da soma:  " + soma);
		System.out.println("Resultado da subtração: " + subtrai);
		System.out.println("Resultado multiplicação: " + multiplica);
	}
}