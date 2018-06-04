package br.com.usjt.AbstractFactory.exercicio2;

public class TestePizzaria {
	public static void main(String[] args) {
		AbstractPizzaria fabricaPizza = new Pizzaria();
		AbstractPizzaria fabricaCalzone = new Calzonaria();
		
		Pizza pizza = fabricaPizza.getFactory(DiaSemana.SABADO);
		System.out.println(pizza.fazer());
		pizza = fabricaPizza.getFactory(DiaSemana.SEXTA);
		System.out.println(pizza.fazer());
		pizza = fabricaPizza.getFactory(DiaSemana.DOMINGO);
		System.out.println(pizza.fazer());
		
		pizza = fabricaCalzone.getFactory(DiaSemana.SABADO);
		System.out.println(pizza.fazer());
		pizza = fabricaCalzone.getFactory(DiaSemana.SEXTA);
		System.out.println(pizza.fazer());
		pizza = fabricaCalzone.getFactory(DiaSemana.DOMINGO);
		System.out.println(pizza.fazer());
	}
}
