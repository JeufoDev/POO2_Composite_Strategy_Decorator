package app.domain.strategy;

public class DescontoFixo implements DescontoStrategy{
	
	private double valor;
	
	public DescontoFixo(double valor) {
		this.valor = valor;
	}
	
	@Override
	public double aplicarDesconto(double valor) {
		return valor - this.valor ;
	}
}
