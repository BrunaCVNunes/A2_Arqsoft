package br.com.usjt.Aula07.FactoryMethod.exercicio3;

public class ArquivoLogService extends LogService{

	@Override
	protected LogParser getParser() {
		return new ArquivoLogParser();
	}

}
