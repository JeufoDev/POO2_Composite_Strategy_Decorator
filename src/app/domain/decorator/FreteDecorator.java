package app.domain.decorator;

import app.domain.composite.ComponenteProduto;

public class FreteDecorator extends ComponenteDecorator{

	private double valor;
	
	public FreteDecorator(ComponenteProduto componente, double valor) {
		super(componente);
		this.valor = valor;
	}
	@Override
	public double getPreco() {
		double precoBase = super.getPreco();
		return precoBase + valor;
	}
}
