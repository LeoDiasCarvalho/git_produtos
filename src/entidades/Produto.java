package entidades;

public class Produto {
	
	private String nome;
	private double preco;
	
	public Produto() {
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	public String toString() {
		return "Produto: " + nome + ", Preço: $" + String.format("%.2f", preco);
	}
	
	public double desconto() {
		return preco -= preco * 2/100;
		
	}
	
	public double parcelado(int quantParcela) {
		double valor = 0.0;
		if(quantParcela > 10 && quantParcela <= 12) {
			valor = preco + preco * 10 / 100;
		}else if(quantParcela > 5 && quantParcela <= 10) {
			valor = preco +  preco * 5 / 100;
		}else if(quantParcela > 3 && quantParcela <= 5) {
			valor = preco + preco * 2 / 100;
		}else if(quantParcela >= 1 && quantParcela <= 3) {
			valor = preco;
		}
		return valor;
	}
}
