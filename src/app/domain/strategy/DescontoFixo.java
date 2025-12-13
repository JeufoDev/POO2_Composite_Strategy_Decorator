package app.domain.strategy;

import app.domain.composite.ComponenteProduto;

public class DescontoFixo implements DescontoStrategy{
	
	private double valor;
	
	public DescontoFixo(double valor) {
		this.valor = valor;
	}
	
	@Override
	public ComponenteProduto aplicarDesconto(ComponenteProduto produto) {
		return ()-> produto.getPreco() - valor ;
	}
}
