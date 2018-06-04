package br.com.usjt.FactoryMethod.exercicio1;

public class NomeSobrenomeService extends NomeService{

	@Override
	protected NomeParser getParser() {
		return new NomeSobrenomeParser(); 
	}

}
