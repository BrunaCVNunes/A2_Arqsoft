package br.com.usjt.Aula07.FactoryMethod.exercicio2;

public class ArquivoConfidencialService extends ArquivoService{

	@Override
	protected ArquivoParser getParser() {
		return new ArquivoConfidencialParser();
	}

}
