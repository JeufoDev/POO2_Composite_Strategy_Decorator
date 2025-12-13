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
		
		//Strategy para desconto
		DescontoFixo dezReais = new DescontoFixo(10);
		ComponenteProduto tecladomMouseDesconto = dezReais.aplicarDesconto(tecladoMouse);
		System.out.println(tecladomMouseDesconto.getPreco());
		
		DescontoPercentual dezPct = new DescontoPercentual(10);
		ComponenteProduto descontoDezPct = dezPct.aplicarDesconto(tecladoMouse);
		System.out.println(descontoDezPct.getPreco());
		
		SemDesconto semDesconto = new SemDesconto();
		ComponenteProduto tecladoMouseSem = semDesconto.aplicarDesconto(tecladoMouse);
		System.out.println(tecladoMouseSem.getPreco());
		
		
		//Decorator
		ComponenteProduto produtoFinal = new FreteDecorator(new EmbalagemDecorator(tecladomMouseDesconto, 5), 18);
		System.out.println(produtoFinal.getPreco());
	}

}
