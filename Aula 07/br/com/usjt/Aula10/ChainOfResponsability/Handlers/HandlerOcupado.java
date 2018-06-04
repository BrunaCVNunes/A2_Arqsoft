package br.com.usjt.Aula10.ChainOfResponsability.Handlers;

public class HandlerOcupado implements Chain {

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;

	}

	public HandlerOcupado() {
	}

	@Override
	public void handleRequest(Handler handler) {

			System.out.println("Todos os handlers estão ocupados. \nPor favor, tente mais tarde.");
			
	}


}
