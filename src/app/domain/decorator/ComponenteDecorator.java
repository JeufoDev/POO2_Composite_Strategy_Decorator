package app.domain.decorator;

import app.domain.composite.ComponenteProduto;

public abstract class ComponenteDecorator implements ComponenteProduto{
	
	protected ComponenteProduto componente;
	
	public ComponenteDecorator(ComponenteProduto componente) {
		this.componente = componente;
	}
		
	@Override
	public double getPreco() {
		return componente.getPreco();
	}
}
