package br.com.usjt.Aula10.ChainOfResponsability.MaqVendas;

public class Slot25Cent implements Chain{
	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
		
	}

	@Override
	public void debita(ValorProd valorProd, ValorMoeda valorMoeda) {
		if (valorMoeda.getValorDaMoeda() == 0.25) {
			valorProd.setValorAtual(valorProd.getValorAtual()-0.25);
			System.out.println("Valor do produto:" + valorProd.getValorAtual());
			
		}
		else {
			
			nextInChain.debita(valorProd, valorMoeda);
			
		}
	}

}
