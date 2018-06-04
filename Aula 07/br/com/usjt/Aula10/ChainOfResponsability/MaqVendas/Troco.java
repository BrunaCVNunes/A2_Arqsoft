package br.com.usjt.Aula10.ChainOfResponsability.MaqVendas;

public class Troco implements Chain {
	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;

	}

	@Override
	public void debita(ValorProd valorProd, ValorMoeda valorMoeda) {
		if (valorMoeda.getValorDaMoeda() == 0) {
			valorProd.setValorAtual(valorProd.getValorAtual() - 0);
			System.out.println("Valor do produto:" + valorProd.getValorAtual());

		} 
		if (valorProd.getValorAtual() <= 0) {
			System.out.println("Por favor, retire o/a "+ valorProd.getNomeProd());
			System.out.println("Valor troco: " + valorProd.getValorAtual() * -1);
		} else {
			System.out.println("Quantia insuficiente! Insira mais " + valorProd.getValorAtual() + " para obter " + valorProd.getNomeProd());
		}

	}

}
