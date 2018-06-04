package br.com.usjt.Aula07.FactoryMethod.exercicio1;

public class NomeSobrenomeService extends NomeService{

	@Override
	protected NomeParser getParser() {
		return new NomeSobrenomeParser(); 
	}

}
