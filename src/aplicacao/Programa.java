package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual produto deseja cadastrar: ");
		String nome = sc.nextLine();
		System.out.print("Qual o seu valor: ");
		double preco = sc.nextDouble();
		
		Produto novo = new Produto(nome, preco);
		
		System.out.println();
		System.out.println("Produto: " + novo.getNome() 
		+ ", Preço: $" + String.format("%.2f", preco));

		sc.close();
	}

}
