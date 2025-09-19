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
	    double precoGasolina, litrosVendidos;
		System.out.println("Quaal o valor do litro da gasolina? \n");
		precoGasolina = scanner.nextDouble();
		System.out.println("Quantos litros foram vendidos? \n");
		litrosVendidos = scanner.nextDouble();
		double valorTotal = precoGasolina * litrosVendidos;
		System.out.println("O valor total a pagar é " + valorTotal);
	}
}