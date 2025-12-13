package app.domain.decorator;

import app.domain.composite.ComponenteProduto;

public class ImpostoDecorator extends ComponenteDecorator{

	private double taxa;
	
	public ImpostoDecorator(ComponenteProduto componente, double taxa) {
		super(componente);
		this.taxa = taxa;
	}
	
	@Override
	public double getPreco() {
		double precoBase = super.getPreco();
		return precoBase + (precoBase * (taxa / 100));
	}
}
