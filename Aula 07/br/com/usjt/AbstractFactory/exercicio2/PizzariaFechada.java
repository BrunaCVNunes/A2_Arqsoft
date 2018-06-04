package br.com.usjt.AbstractFactory.exercicio2;

public class PizzariaFechada implements Pizza {

	@Override
	public String fazer() {
		return "Pizzaria fechada.";
	}

}
