package br.com.usjt.FactoryMethod.exercicio2;

public class ArquivoPublicoService extends ArquivoService{

	@Override
	protected ArquivoParser getParser() {
		return new ArquivoPublicoParser();
	}

}
