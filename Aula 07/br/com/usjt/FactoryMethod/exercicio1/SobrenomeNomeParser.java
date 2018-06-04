package br.com.usjt.FactoryMethod.exercicio1;

public class SobrenomeNomeParser implements NomeParser{
	@Override
	public String parse(Nome nome) {
		return nome.sobrenome + ", " + nome.nome + ";";
	}
}
