package app.domain.composite;

public class ProdutoSimples implements ComponenteProduto {
	
	private String nome;
	private double precoBase;
	
	public ProdutoSimples(String nome, double precoBase) {
		this.nome = nome;
		this.precoBase = precoBase;
	}

	@Override
	public double getPreco() {
		return precoBase;
	}
	
	@Override
	public String toString() {
		return nome +":"+ precoBase;
	}
}
