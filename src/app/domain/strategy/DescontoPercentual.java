package app.domain.strategy;

import app.domain.composite.ComponenteProduto;

public class DescontoPercentual implements DescontoStrategy {
	
	private double percentual;
	
	public DescontoPercentual(double percentual) {
		this.percentual = percentual;
	}
	
	@Override
	public ComponenteProduto aplicarDesconto(ComponenteProduto produto) {
		return ()-> produto.getPreco() * (1 - percentual /100);
	}
}
