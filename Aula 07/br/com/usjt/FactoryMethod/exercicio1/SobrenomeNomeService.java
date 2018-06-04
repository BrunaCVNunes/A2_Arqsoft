package br.com.usjt.FactoryMethod.exercicio1;

public class SobrenomeNomeService extends NomeService{
	@Override
	protected NomeParser getParser() {
		return new SobrenomeNomeParser(); 
	}
}
