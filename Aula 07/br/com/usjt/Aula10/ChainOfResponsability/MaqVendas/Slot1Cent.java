package br.com.usjt.Aula10.ChainOfResponsability.MaqVendas;

public class Slot1Cent implements Chain{
	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
		
	}

	@Override
	public void debita(ValorProd valorProd, ValorMoeda valorMoeda) {
		if (valorMoeda.getValorDaMoeda() == 0.01) {
			valorProd.setValorAtual(valorProd.getValorAtual()-0.01);
			System.out.println("Valor do produto:" + valorProd.getValorAtual());
			
		}
		else {
		
			nextInChain.debita(valorProd, valorMoeda);
			
		}
	}

}
