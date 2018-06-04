package br.com.usjt.Aula07.AbstractFactory.exercicio2;

public class Pizzaria implements AbstractPizzaria {

	@Override
	public Pizza getFactory(DiaSemana dia) {
		switch(dia){
		case SEGUNDA: case QUARTA: case SEXTA:
			return new PizzaCalabresa();
		case TERCA: case QUINTA: case SABADO:
			return new PizzaPresunto();
		default: 
			return new PizzariaFechada();
		}
	}

}
