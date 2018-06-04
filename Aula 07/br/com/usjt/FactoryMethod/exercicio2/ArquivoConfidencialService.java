package br.com.usjt.FactoryMethod.exercicio2;

public class ArquivoConfidencialService extends ArquivoService{

	@Override
	protected ArquivoParser getParser() {
		return new ArquivoConfidencialParser();
	}

}
