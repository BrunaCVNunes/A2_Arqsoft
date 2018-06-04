package br.com.usjt.FactoryMethod.exercicio1;

public abstract class NomeService {
	
	public void display(Nome nome){
		NomeParser parser = getParser();
		System.out.println(parser.parse(nome));
	}
	
	protected abstract NomeParser getParser();

}
