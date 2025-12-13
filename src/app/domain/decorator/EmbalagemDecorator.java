package app.domain.decorator;

import app.domain.composite.ComponenteProduto;

public class EmbalagemDecorator extends ComponenteDecorator{

	private double custo;
	
	public EmbalagemDecorator(ComponenteProduto componente, double custo) {
		super(componente);
		this.custo = custo;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getPreco() {
		double precoBase = super.getPreco();
		return precoBase + custo;
	}
}
