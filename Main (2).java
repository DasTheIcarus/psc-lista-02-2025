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
	    double nota1,nota2,nota3,nota4;
		System.out.println("Digite a primeira nota bimestral: \n");
		nota1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota bimestral: \n");
		nota2 = scanner.nextDouble();
		System.out.println("Digite a terceira nota bimestral: \n");
		nota3 = scanner.nextDouble();
		System.out.println("Digite a quarta nota bimestral: \n");
		nota4 = scanner.nextDouble();
		double media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("A média de notas foi " + media);
	}
}