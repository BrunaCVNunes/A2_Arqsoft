package br.com.usjt.FactoryMethod.exercicio3;

public class ConsoleLogService extends LogService {

	@Override
	protected LogParser getParser() {
		return new ConsoleLogParser();
	}

}
