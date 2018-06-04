package br.com.usjt.Aula10.ChainOfResponsability.MaqVendas;

public interface Chain {
	
	public void setNextChain(Chain nextChain);
	
	public void debita(ValorProd valorProd, ValorMoeda valorMoeda);
	

}
