package br.com.usjt.FactoryMethod.exercicio3;

public class ArquivoLogService extends LogService{

	@Override
	protected LogParser getParser() {
		return new ArquivoLogParser();
	}

}
