package br.com.usjt.Aula10.ChainOfResponsability.Handlers;

public interface Chain {
	
	public void setNextChain(Chain nextChain);
	
	public void handleRequest(Handler handler);
	

}
