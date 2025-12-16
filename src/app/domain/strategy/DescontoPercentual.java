package app.domain.strategy;

public class DescontoPercentual implements DescontoStrategy {
	
	private double percentual;
	
	public DescontoPercentual(double percentual) {
		this.percentual = percentual;
	}
	
	@Override
	public double aplicarDesconto(double valor) {
		return valor * (1 - percentual /100);
	}
}
