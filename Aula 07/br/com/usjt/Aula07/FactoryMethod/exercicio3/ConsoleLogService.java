package br.com.usjt.Aula07.FactoryMethod.exercicio3;

public class ConsoleLogService extends LogService {

	@Override
	protected LogParser getParser() {
		return new ConsoleLogParser();
	}

}
