package br.com.usjt.Aula07.FactoryMethod.exercicio3;

public class ConsoleLogParser implements LogParser{

	@Override
	public void imprime(int size) {		
		String texto = "";
		for (int i = 0; i < size; i++) {
			texto += (i+1) + "\r\n";
		}
		System.out.println("********** LOG **********");
		System.out.println(texto);
	}

}
