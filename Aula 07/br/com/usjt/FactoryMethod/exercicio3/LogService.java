package br.com.usjt.FactoryMethod.exercicio3;

public abstract class LogService {
	public void imprimeLog(int size){
		LogParser logParser = getParser();
		logParser.imprime(size);
	}
	
	protected abstract LogParser getParser();
}
