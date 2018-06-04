package br.com.usjt.Aula08.Adapter.cliente;

public class TesteSomador {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(new SomadorAdapter());
		
	}
}
