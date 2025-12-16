package app;

import app.domain.composite.ComponenteProduto;
import app.domain.composite.ProdutoComposto;
import app.domain.composite.ProdutoSimples;
import app.domain.decorator.EmbalagemDecorator;
import app.domain.decorator.FreteDecorator;
import app.domain.strategy.DescontoFixo;
import app.domain.strategy.DescontoPercentual;
import app.domain.strategy.SemDesconto;

public class Main {

	public static void main(String[] args) {

		//Simples
		ProdutoSimples teclado = new ProdutoSimples("teclado", 100);
		ProdutoSimples mouse = new ProdutoSimples("mouse", 50);
		
		//Composto
		ProdutoComposto tecladoMouse = new ProdutoComposto("teclado&mouse");
		tecladoMouse.addItem(teclado);
		tecladoMouse.addItem(mouse);
		System.out.println(tecladoMouse.getPreco());
		

		//Decorator
		ComponenteProduto produtoFinal = new FreteDecorator(new EmbalagemDecorator(tecladoMouse, 5), 18);
		System.out.println(produtoFinal.getPreco());
		
		//Strategy
		DescontoFixo dezReais = new DescontoFixo(10);
		DescontoPercentual dezPct = new DescontoPercentual(10);
		SemDesconto semDesconto = new SemDesconto();
		
		double valorFinal = dezReais.aplicarDesconto(produtoFinal.getPreco());
		System.out.println(valorFinal);
	}

}
