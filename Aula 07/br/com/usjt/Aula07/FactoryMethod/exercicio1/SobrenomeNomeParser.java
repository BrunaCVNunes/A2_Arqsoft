package br.com.usjt.Aula07.FactoryMethod.exercicio1;

public class SobrenomeNomeParser implements NomeParser{
	@Override
	public String parse(Nome nome) {
		return nome.sobrenome + ", " + nome.nome + ";";
	}
}
