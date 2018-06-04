package br.com.usjt.FactoryMethod.exercicio3;

public class TesteLog {
	public static void main(String[] args) {
		LogService logService = new ConsoleLogService();
		logService.imprimeLog(10);
		
		logService = new ArquivoLogService();
		logService.imprimeLog(10);
	}
}
