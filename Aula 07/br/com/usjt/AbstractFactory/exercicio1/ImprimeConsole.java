package br.com.usjt.AbstractFactory.exercicio1;

public class ImprimeConsole implements Impressao{

	@Override
	public void imprime(String texto) {
		// TODO Auto-generated method stub
		System.out.println("Imprime no console..." + texto);		
	}

}
