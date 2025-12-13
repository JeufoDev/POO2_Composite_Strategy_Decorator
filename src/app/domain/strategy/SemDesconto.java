package app.domain.strategy;

import app.domain.composite.ComponenteProduto;

public class SemDesconto implements DescontoStrategy{

	@Override
	public ComponenteProduto aplicarDesconto(ComponenteProduto produto) {
		return produto;
	}
}
