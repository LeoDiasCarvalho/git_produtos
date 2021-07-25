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

	
	public String toString() {
		return "Produto: " + nome + ", Pre�o: $" + String.format("%.2f", preco);
	}
	
	public double desconto() {
		return preco -= preco * 2/100;
		
	}
	
	public double parcelado() {
		return preco += preco * 2/100;
		
	}
	
	
	
	
	

}
