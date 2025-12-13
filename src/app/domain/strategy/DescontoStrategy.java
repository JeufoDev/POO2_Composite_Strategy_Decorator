package app.domain.strategy;

import app.domain.composite.ComponenteProduto;

public interface DescontoStrategy {
	
	public ComponenteProduto aplicarDesconto(ComponenteProduto produto);
	
}
