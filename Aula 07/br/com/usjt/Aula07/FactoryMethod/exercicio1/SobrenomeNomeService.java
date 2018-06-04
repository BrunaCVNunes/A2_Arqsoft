package br.com.usjt.Aula07.FactoryMethod.exercicio1;

public class SobrenomeNomeService extends NomeService{
	@Override
	protected NomeParser getParser() {
		return new SobrenomeNomeParser(); 
	}
}
