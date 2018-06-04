package br.com.usjt.Aula07.FactoryMethod.exercicio3;

public class TesteLog {
	public static void main(String[] args) {
		LogService logService = new ConsoleLogService();
		logService.imprimeLog(10);
		
		logService = new ArquivoLogService();
		logService.imprimeLog(10);
	}
}
