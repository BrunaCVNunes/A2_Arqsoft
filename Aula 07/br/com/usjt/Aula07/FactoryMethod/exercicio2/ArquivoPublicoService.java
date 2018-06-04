package br.com.usjt.Aula07.FactoryMethod.exercicio2;

public class ArquivoPublicoService extends ArquivoService{

	@Override
	protected ArquivoParser getParser() {
		return new ArquivoPublicoParser();
	}

}
