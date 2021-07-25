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
		System.out.println(novo);
		System.out.println();
		System.out.print("Como será a forma de pagamento: parcelado/avista");
		char resp = sc.next().charAt(0);
		int quantParcela = 0;
		double valorParcela = 0.0;
		if(resp == 'p') {
			System.out.print("Em quantas parcelas: ");
			quantParcela = sc.nextInt();
			novo.parcelado();
			valorParcela = novo.getPreco() / quantParcela;
			System.out.println();
			System.out.println(novo + ", dividido em " + 
			quantParcela + " parcelas de $" + String.format("%.2f", valorParcela));
		}else if(resp == 'a') {
			novo.desconto();
			System.out.println();
			System.out.println(novo);
		}else {
			System.out.println("Forma inválida!");
		}

		sc.close();
	}

}
