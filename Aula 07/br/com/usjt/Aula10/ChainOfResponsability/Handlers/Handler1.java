package br.com.usjt.Aula10.ChainOfResponsability.Handlers;

public class Handler1 implements Chain {
	private long milis;
	private Chain nextInChain;
	private boolean status=false;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;

	}

	public Handler1() {
		this.milis = System.currentTimeMillis();
	}

	public long getMilis() {
		return milis;
	}

	public void setMilis(long milis) {
		this.milis = milis;
	}

	@Override
	public void handleRequest(Handler handler) {
		

		if (checkReqHand(handler)) {

			System.out.println("Número do handler tratando da requisição: " + "1" );
	
		}

		else {
			
			nextInChain.handleRequest(handler);

		}

	}
	
	public boolean checkReqHand(Handler handler) {
		if ((System.currentTimeMillis() - this.milis) < 200 && status == false) {
			this.milis = System.currentTimeMillis();
			status = true;
			return true;
			
		} 
	
		else if ((System.currentTimeMillis() - this.milis) >200 && status == true){
			this.milis = System.currentTimeMillis();
			status = true;
			return true;
		
		}
		
		else {
			return false;
		}
		
	}

}
