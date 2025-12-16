package app.domain.composite;

import java.util.ArrayList;

public class ProdutoComposto implements ComponenteProduto {
	
	private String nome;
	private ArrayList<ComponenteProduto> itens;
	
	public ProdutoComposto(String nome) {
		this.nome = nome;
		this.itens = new ArrayList<>();
	}
	
	public void addItem(ComponenteProduto c) {
		itens.add(c);
	}
	
	public void removeItens(ComponenteProduto c) {
		itens.remove(c);
	}
	
	@Override
	public double getPreco() {
		double total = 0;
		
		for (ComponenteProduto item: itens) {
			total += item.getPreco();
		}
		
		return total;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
