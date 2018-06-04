package br.com.usjt.Aula07.FactoryMethod.exercicio1;

import java.util.ArrayList;

public class TesteImprimeNome {
	public void imprime(ArrayList<Nome> nomes) {
		NomeService nomeService;
		for (Nome nome : nomes) {
			switch (nome.tipo) {
			case NOMESOBRENOME:
				nomeService = new NomeSobrenomeService();
				nomeService.display(nome);
				break;
			case SOBRENOMENOME:
				nomeService = new SobrenomeNomeService();
				nomeService.display(nome);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Nome> nome = new ArrayList<>();
		nome.add(new Nome("Bruna", "Taschen", Tipo.NOMESOBRENOME));
		nome.add(new Nome("Hipolito", "Diego", Tipo.SOBRENOMENOME));
		nome.add(new Nome("Hikaru", "Josefina", Tipo.SOBRENOMENOME));
		nome.add(new Nome("Neymar", "Junior", Tipo.NOMESOBRENOME));
		
		TesteImprimeNome imprimeNome = new TesteImprimeNome();
		imprimeNome.imprime(nome);
	}
}
